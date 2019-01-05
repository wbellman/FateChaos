// Generated from FateChaos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FateChaosParser}.
 */
public interface FateChaosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(FateChaosParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(FateChaosParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code playerCharacterDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterPlayerCharacterDef(FateChaosParser.PlayerCharacterDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code playerCharacterDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitPlayerCharacterDef(FateChaosParser.PlayerCharacterDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonPlayerCharacterDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterNonPlayerCharacterDef(FateChaosParser.NonPlayerCharacterDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonPlayerCharacterDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitNonPlayerCharacterDef(FateChaosParser.NonPlayerCharacterDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sceneDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterSceneDef(FateChaosParser.SceneDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sceneDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitSceneDef(FateChaosParser.SceneDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aspectDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterAspectDef(FateChaosParser.AspectDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aspectDef}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitAspectDef(FateChaosParser.AspectDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generateRequest}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterGenerateRequest(FateChaosParser.GenerateRequestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generateRequest}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitGenerateRequest(FateChaosParser.GenerateRequestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rollDice}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void enterRollDice(FateChaosParser.RollDiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rollDice}
	 * labeled alternative in {@link FateChaosParser#item}.
	 * @param ctx the parse tree
	 */
	void exitRollDice(FateChaosParser.RollDiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterScene(FateChaosParser.SceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitScene(FateChaosParser.SceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(FateChaosParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(FateChaosParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#npc}.
	 * @param ctx the parse tree
	 */
	void enterNpc(FateChaosParser.NpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#npc}.
	 * @param ctx the parse tree
	 */
	void exitNpc(FateChaosParser.NpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#generate}.
	 * @param ctx the parse tree
	 */
	void enterGenerate(FateChaosParser.GenerateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#generate}.
	 * @param ctx the parse tree
	 */
	void exitGenerate(FateChaosParser.GenerateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#roll}.
	 * @param ctx the parse tree
	 */
	void enterRoll(FateChaosParser.RollContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#roll}.
	 * @param ctx the parse tree
	 */
	void exitRoll(FateChaosParser.RollContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#aspect}.
	 * @param ctx the parse tree
	 */
	void enterAspect(FateChaosParser.AspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#aspect}.
	 * @param ctx the parse tree
	 */
	void exitAspect(FateChaosParser.AspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#high_concept}.
	 * @param ctx the parse tree
	 */
	void enterHigh_concept(FateChaosParser.High_conceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#high_concept}.
	 * @param ctx the parse tree
	 */
	void exitHigh_concept(FateChaosParser.High_conceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#trouble}.
	 * @param ctx the parse tree
	 */
	void enterTrouble(FateChaosParser.TroubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#trouble}.
	 * @param ctx the parse tree
	 */
	void exitTrouble(FateChaosParser.TroubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FateChaosParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FateChaosParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(FateChaosParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(FateChaosParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(FateChaosParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(FateChaosParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(FateChaosParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(FateChaosParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FateChaosParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FateChaosParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#place}.
	 * @param ctx the parse tree
	 */
	void enterPlace(FateChaosParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#place}.
	 * @param ctx the parse tree
	 */
	void exitPlace(FateChaosParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(FateChaosParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(FateChaosParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code randomFree}
	 * labeled alternative in {@link FateChaosParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomFree(FateChaosParser.RandomFreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code randomFree}
	 * labeled alternative in {@link FateChaosParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomFree(FateChaosParser.RandomFreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code randomPhrase}
	 * labeled alternative in {@link FateChaosParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandomPhrase(FateChaosParser.RandomPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code randomPhrase}
	 * labeled alternative in {@link FateChaosParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandomPhrase(FateChaosParser.RandomPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(FateChaosParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(FateChaosParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FateChaosParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(FateChaosParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FateChaosParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(FateChaosParser.EndContext ctx);
}