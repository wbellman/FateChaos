//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from /home/wbellman/prj/personal/FateChaos/grammar/FateChaos.g4 by ANTLR 4.7.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="FateChaosParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.2")]
[System.CLSCompliant(false)]
public interface IFateChaosListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.game"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGame([NotNull] FateChaosParser.GameContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.game"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGame([NotNull] FateChaosParser.GameContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>playerCharacterDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPlayerCharacterDef([NotNull] FateChaosParser.PlayerCharacterDefContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>playerCharacterDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPlayerCharacterDef([NotNull] FateChaosParser.PlayerCharacterDefContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>nonPlayerCharacterDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNonPlayerCharacterDef([NotNull] FateChaosParser.NonPlayerCharacterDefContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>nonPlayerCharacterDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNonPlayerCharacterDef([NotNull] FateChaosParser.NonPlayerCharacterDefContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>sceneDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSceneDef([NotNull] FateChaosParser.SceneDefContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>sceneDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSceneDef([NotNull] FateChaosParser.SceneDefContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>aspectDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAspectDef([NotNull] FateChaosParser.AspectDefContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>aspectDef</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAspectDef([NotNull] FateChaosParser.AspectDefContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>generateRequest</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGenerateRequest([NotNull] FateChaosParser.GenerateRequestContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>generateRequest</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGenerateRequest([NotNull] FateChaosParser.GenerateRequestContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>rollDice</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRollDice([NotNull] FateChaosParser.RollDiceContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>rollDice</c>
	/// labeled alternative in <see cref="FateChaosParser.item"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRollDice([NotNull] FateChaosParser.RollDiceContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.scene"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterScene([NotNull] FateChaosParser.SceneContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.scene"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitScene([NotNull] FateChaosParser.SceneContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.character"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCharacter([NotNull] FateChaosParser.CharacterContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.character"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCharacter([NotNull] FateChaosParser.CharacterContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.npc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNpc([NotNull] FateChaosParser.NpcContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.npc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNpc([NotNull] FateChaosParser.NpcContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.generate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGenerate([NotNull] FateChaosParser.GenerateContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.generate"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGenerate([NotNull] FateChaosParser.GenerateContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.roll"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRoll([NotNull] FateChaosParser.RollContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.roll"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRoll([NotNull] FateChaosParser.RollContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.aspect"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAspect([NotNull] FateChaosParser.AspectContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.aspect"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAspect([NotNull] FateChaosParser.AspectContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.high_concept"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterHigh_concept([NotNull] FateChaosParser.High_conceptContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.high_concept"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitHigh_concept([NotNull] FateChaosParser.High_conceptContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.trouble"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTrouble([NotNull] FateChaosParser.TroubleContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.trouble"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTrouble([NotNull] FateChaosParser.TroubleContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAttribute([NotNull] FateChaosParser.AttributeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.attribute"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAttribute([NotNull] FateChaosParser.AttributeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.location"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocation([NotNull] FateChaosParser.LocationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.location"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocation([NotNull] FateChaosParser.LocationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.name"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterName([NotNull] FateChaosParser.NameContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.name"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitName([NotNull] FateChaosParser.NameContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.element"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElement([NotNull] FateChaosParser.ElementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.element"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElement([NotNull] FateChaosParser.ElementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.random"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRandom([NotNull] FateChaosParser.RandomContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.random"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRandom([NotNull] FateChaosParser.RandomContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.skills"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSkills([NotNull] FateChaosParser.SkillsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.skills"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSkills([NotNull] FateChaosParser.SkillsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.skill"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSkill([NotNull] FateChaosParser.SkillContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.skill"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSkill([NotNull] FateChaosParser.SkillContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumber([NotNull] FateChaosParser.NumberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumber([NotNull] FateChaosParser.NumberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.phrase"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPhrase([NotNull] FateChaosParser.PhraseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.phrase"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPhrase([NotNull] FateChaosParser.PhraseContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.pos"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPos([NotNull] FateChaosParser.PosContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.pos"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPos([NotNull] FateChaosParser.PosContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FateChaosParser.end"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEnd([NotNull] FateChaosParser.EndContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FateChaosParser.end"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEnd([NotNull] FateChaosParser.EndContext context);
}
