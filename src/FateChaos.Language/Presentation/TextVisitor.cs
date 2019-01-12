#region

using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using FateChaos.Language.Interfaces;
using static FateChaosParser;

#endregion

namespace FateChaos.Language.Presentation {
  public class TextVisitor : FateChaosBaseVisitor<string> {
    private IWordGenerator Generator { get; }

    public TextVisitor(IWordGenerator generator, IAntlrErrorListener<IToken> listener) {
      Generator = generator;
      QuickParseListener = listener;
    }

    private IAntlrErrorListener<IToken> QuickParseListener { get; }

    public override string VisitPlayerCharacterDef(PlayerCharacterDefContext context) {
      var character   = context.character();
      var name        = VisitName(character.name());
      var highConcept = VisitHigh_concept(character.high_concept());

      var newLine = Environment.NewLine;
      var sep     = $"----------------------------------{newLine}";

      var characterCard = $"{sep}"  +
                          $"{name}{newLine}" +
                          $"{sep}"  +
                          $"HC: {highConcept}{newLine}";

      if (character.trouble() != null) {
        var trouble     = VisitTrouble(character.trouble());
        characterCard += $"TR: {trouble}{newLine}";
      }

      var attrs = character.attribute();

      characterCard = attrs
            .Select(VisitAttribute)
            .Aggregate(characterCard, (current, attribute) => current + $"AS: {attribute}{newLine}");

      if (character.skills() != null) {
        characterCard += VisitSkills(character.skills());
      }

      characterCard += $"{sep}{newLine}";

      return characterCard;
    }

    public override string VisitName(NameContext context) {
      if (context.TEXT() != null) return Text(context.TEXT());

      return context.RANDOMNAME() != null
               ? Generator.FullName
               : "Nameless";
    }

    public override string VisitHigh_concept(High_conceptContext context) {
      return VisitElement(context.element());
    }

    public override string VisitTrouble(TroubleContext context) {
      return VisitElement(context.element());
    }

    public override string VisitAttribute(AttributeContext context) {
      return VisitElement(context.element());
    }

    public override string VisitElement(ElementContext context) {
      if (context.TEXT() != null) return Text(context.TEXT());
      if( context.random() != null ) return VisitRandom(context.random());
      if( context.RANDOMDESCRIPTION() != null ) return Generator.Description;
      if( context.RANDOMSET() != null ) return Generator.Setting;
      if( context.RANDOMNAME() != null ) return Generator.FullName;
      if( context.RANDOMPLACE() != null ) return Generator.Location;

      return "The definition of inscrutability.";
    }

    public override string VisitSkills(SkillsContext context) {
      var skillTree = new Dictionary<string, List<string>>();
      var skills = new List<string>();

      foreach (var skill in context.skill()) {

        string number, skillName;

        if (skill.RANDOMSKILL() != null) {
          number = Generator.Number(1, 3).ToString();
          skillName = Generator.Skill;
          if (skills.Contains(skillName)) {
            skillName = "WILD CARD";
          }
        } else {
          number = VisitNumber(skill.number());
          skillName = Text(skill.TEXT());
        }

        skills.Add(skillName);
        if (!skillTree.ContainsKey(number)) {
          skillTree.Add(number, new List<string>());
        }

        skillTree[number].Add(skillName);
      }

      var newLine = Environment.NewLine;
      var skillTable = $"SKILLS{newLine}------{newLine}";
      foreach (var kvp in skillTree) {
        skillTable += $"\t{kvp.Key} | {string.Join(", ", kvp.Value)}{newLine}";
      }

      return skillTable;
    }

    public override string VisitRandom(RandomContext context) {
      if (context.phrase() != null) return VisitPhrase(context.phrase());

      if (context.number() != null) {
        var num = VisitNumber(context.number());
        int.TryParse(num, out var i);
        return i > 1 ?
                 Generator.Number(1, i).ToString()
                 : Generator.Number(0, 1).ToString();
      }

      var parser = QuickParse(Generator.Phrase);

      return VisitPhrase(parser.phrase());
    }

    public override string VisitNumber(NumberContext context) {
      return Text(context.INT());
    }

    public override string VisitPhrase(PhraseContext context) {

      var posList = context.pos().Select(VisitPos).ToList();

      return $"{string.Join(" ",posList)}.";
    }


    public override string VisitPos(PosContext context) {

      if (context.NOUN() != null) return Generator.Noun;
      if (context.VERB() != null) return Generator.Verb;
      if (context.ADJECTIVE() != null) return Generator.Adjective;

      return context.TEXT() != null
               ? Text(context.TEXT())
               : "*gibberish*";
    }


    private string Text(ITerminalNode node) {
      return node.GetText();
    }

    private FateChaosParser QuickParse(string script) {
      var stream = new AntlrInputStream(script);
      var lexer = new FateChaosLexer(stream);
      var cts = new CommonTokenStream(lexer);

      var parser = new FateChaosParser(cts);

      lexer.RemoveErrorListeners();
      parser.RemoveErrorListeners();
      parser.AddErrorListener(QuickParseListener);

      return parser;
    }
  }
}