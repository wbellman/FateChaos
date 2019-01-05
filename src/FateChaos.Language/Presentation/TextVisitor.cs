#region

using Antlr4.Runtime;
using static FateChaosParser;

#endregion

namespace FateChaos.Language.Presentation {
  public class TextVisitor : FateChaosBaseVisitor<string> {

    public override string VisitPlayerCharacterDef(PlayerCharacterDefContext context) {
      var character = context.character();

      var nameNode = character.name();

      var name = string.Empty;

      if (nameNode.TEXT() != null) name = nameNode.TEXT().GetText();

      if( nameNode.RANDOMNAME() != null) name = "Dingo Fizzlewitz";

      return $"CHARACTER: ${name}";
    }

    /*
    public string VisitNonPlayerCharacterDef(NonPlayerCharacterDefContext context) {
      var npc = context.npc();

      var name = npc.name();


    }

    public string VisitSceneDef(SceneDefContext context) {
      throw new System.NotImplementedException();
    }

    public string VisitAspectDef(AspectDefContext context) {
      throw new System.NotImplementedException();
    }

    public string VisitGenerateRequest(GenerateRequestContext context) {
      throw new System.NotImplementedException();
    }

    public string VisitRollDice(RollDiceContext context) {
      throw new System.NotImplementedException();
    }
    */
  }
}