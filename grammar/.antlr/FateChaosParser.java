// Generated from /home/wbellman/prj/personal/FateChaos/grammar/FateChaos.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FateChaosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEP=1, INT=2, NUMBER=3, DICE=4, TEXT=5, CHARACTER=6, END=7, NPC=8, CARD=9, 
		ASPECT=10, HIGHCONCEPT=11, TROUBLE=12, RANDOM=13, RANDOMANY=14, RANDOMSET=15, 
		RANDOMNAME=16, RANDOMPLACE=17, RANDOMDESCRIPTION=18, ATTRIBUTE=19, NOUN=20, 
		ADJECTIVE=21, VERB=22, PLACE=23, PERSON=24, SCENE=25, LOCATION=26, GENERATE=27, 
		ROLL=28, WS=29, COMMENT=30, ANY=31;
	public static final int
		RULE_test = 0, RULE_item = 1, RULE_scene = 2, RULE_character = 3, RULE_npc = 4, 
		RULE_generate = 5, RULE_roll = 6, RULE_aspect = 7, RULE_high_concept = 8, 
		RULE_trouble = 9, RULE_attribute = 10, RULE_location = 11, RULE_set = 12, 
		RULE_description = 13, RULE_name = 14, RULE_place = 15, RULE_element = 16, 
		RULE_random = 17, RULE_phrase = 18, RULE_end = 19;
	public static final String[] ruleNames = {
		"test", "item", "scene", "character", "npc", "generate", "roll", "aspect", 
		"high_concept", "trouble", "attribute", "location", "set", "description", 
		"name", "place", "element", "random", "phrase", "end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEP", "INT", "NUMBER", "DICE", "TEXT", "CHARACTER", "END", "NPC", 
		"CARD", "ASPECT", "HIGHCONCEPT", "TROUBLE", "RANDOM", "RANDOMANY", "RANDOMSET", 
		"RANDOMNAME", "RANDOMPLACE", "RANDOMDESCRIPTION", "ATTRIBUTE", "NOUN", 
		"ADJECTIVE", "VERB", "PLACE", "PERSON", "SCENE", "LOCATION", "GENERATE", 
		"ROLL", "WS", "COMMENT", "ANY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FateChaos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FateChaosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TestContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FateChaosParser.EOF, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				item();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARACTER) | (1L << NPC) | (1L << ASPECT) | (1L << SCENE) | (1L << GENERATE) | (1L << ROLL))) != 0) );
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	 
		public ItemContext() { }
		public void copyFrom(ItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RollDiceContext extends ItemContext {
		public RollContext roll() {
			return getRuleContext(RollContext.class,0);
		}
		public RollDiceContext(ItemContext ctx) { copyFrom(ctx); }
	}
	public static class PlayerCharacterDefContext extends ItemContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public PlayerCharacterDefContext(ItemContext ctx) { copyFrom(ctx); }
	}
	public static class AspectDefContext extends ItemContext {
		public AspectContext aspect() {
			return getRuleContext(AspectContext.class,0);
		}
		public AspectDefContext(ItemContext ctx) { copyFrom(ctx); }
	}
	public static class GenerateRequestContext extends ItemContext {
		public GenerateContext generate() {
			return getRuleContext(GenerateContext.class,0);
		}
		public GenerateRequestContext(ItemContext ctx) { copyFrom(ctx); }
	}
	public static class NonPlayerCharacterDefContext extends ItemContext {
		public NpcContext npc() {
			return getRuleContext(NpcContext.class,0);
		}
		public NonPlayerCharacterDefContext(ItemContext ctx) { copyFrom(ctx); }
	}
	public static class SceneDefContext extends ItemContext {
		public SceneContext scene() {
			return getRuleContext(SceneContext.class,0);
		}
		public SceneDefContext(ItemContext ctx) { copyFrom(ctx); }
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				_localctx = new PlayerCharacterDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				character();
				}
				break;
			case NPC:
				_localctx = new NonPlayerCharacterDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				npc();
				}
				break;
			case SCENE:
				_localctx = new SceneDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				scene();
				}
				break;
			case ASPECT:
				_localctx = new AspectDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				aspect();
				}
				break;
			case GENERATE:
				_localctx = new GenerateRequestContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				generate();
				}
				break;
			case ROLL:
				_localctx = new RollDiceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				roll();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SceneContext extends ParserRuleContext {
		public TerminalNode SCENE() { return getToken(FateChaosParser.SCENE, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<AspectContext> aspect() {
			return getRuleContexts(AspectContext.class);
		}
		public AspectContext aspect(int i) {
			return getRuleContext(AspectContext.class,i);
		}
		public SceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scene; }
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(SCENE);
			setState(56);
			set();
			setState(57);
			location();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASPECT) {
				{
				{
				setState(58);
				aspect();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(FateChaosParser.CHARACTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public High_conceptContext high_concept() {
			return getRuleContext(High_conceptContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TroubleContext trouble() {
			return getRuleContext(TroubleContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CHARACTER);
			setState(67);
			name();
			setState(68);
			high_concept();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TROUBLE) {
				{
				setState(69);
				trouble();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(72);
				attribute();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NpcContext extends ParserRuleContext {
		public TerminalNode NPC() { return getToken(FateChaosParser.NPC, 0); }
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public High_conceptContext high_concept() {
			return getRuleContext(High_conceptContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TroubleContext trouble() {
			return getRuleContext(TroubleContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public NpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_npc; }
	}

	public final NpcContext npc() throws RecognitionException {
		NpcContext _localctx = new NpcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_npc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NPC);
			setState(81);
			match(TEXT);
			setState(82);
			high_concept();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TROUBLE) {
				{
				setState(83);
				trouble();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(86);
				attribute();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenerateContext extends ParserRuleContext {
		public TerminalNode GENERATE() { return getToken(FateChaosParser.GENERATE, 0); }
		public List<EndContext> end() {
			return getRuleContexts(EndContext.class);
		}
		public EndContext end(int i) {
			return getRuleContext(EndContext.class,i);
		}
		public List<TerminalNode> ASPECT() { return getTokens(FateChaosParser.ASPECT); }
		public TerminalNode ASPECT(int i) {
			return getToken(FateChaosParser.ASPECT, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(FateChaosParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(FateChaosParser.CHARACTER, i);
		}
		public List<TerminalNode> SCENE() { return getTokens(FateChaosParser.SCENE); }
		public TerminalNode SCENE(int i) {
			return getToken(FateChaosParser.SCENE, i);
		}
		public List<TerminalNode> NPC() { return getTokens(FateChaosParser.NPC); }
		public TerminalNode NPC(int i) {
			return getToken(FateChaosParser.NPC, i);
		}
		public GenerateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate; }
	}

	public final GenerateContext generate() throws RecognitionException {
		GenerateContext _localctx = new GenerateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_generate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(GENERATE);
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARACTER) | (1L << NPC) | (1L << ASPECT) | (1L << SCENE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END) {
				{
				{
				setState(100);
				end();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollContext extends ParserRuleContext {
		public TerminalNode ROLL() { return getToken(FateChaosParser.ROLL, 0); }
		public TerminalNode DICE() { return getToken(FateChaosParser.DICE, 0); }
		public RollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roll; }
	}

	public final RollContext roll() throws RecognitionException {
		RollContext _localctx = new RollContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_roll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ROLL);
			setState(107);
			match(DICE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AspectContext extends ParserRuleContext {
		public TerminalNode ASPECT() { return getToken(FateChaosParser.ASPECT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspect; }
	}

	public final AspectContext aspect() throws RecognitionException {
		AspectContext _localctx = new AspectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ASPECT);
			setState(110);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class High_conceptContext extends ParserRuleContext {
		public TerminalNode HIGHCONCEPT() { return getToken(FateChaosParser.HIGHCONCEPT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public High_conceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high_concept; }
	}

	public final High_conceptContext high_concept() throws RecognitionException {
		High_conceptContext _localctx = new High_conceptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_high_concept);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(HIGHCONCEPT);
			setState(113);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TroubleContext extends ParserRuleContext {
		public TerminalNode TROUBLE() { return getToken(FateChaosParser.TROUBLE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TroubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trouble; }
	}

	public final TroubleContext trouble() throws RecognitionException {
		TroubleContext _localctx = new TroubleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_trouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(TROUBLE);
			setState(116);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(FateChaosParser.ATTRIBUTE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ATTRIBUTE);
			setState(119);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(FateChaosParser.LOCATION, 0); }
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LOCATION);
			setState(122);
			place();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public TerminalNode RANDOMSET() { return getToken(FateChaosParser.RANDOMSET, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==RANDOMSET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public TerminalNode RANDOMDESCRIPTION() { return getToken(FateChaosParser.RANDOMDESCRIPTION, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==RANDOMDESCRIPTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public TerminalNode RANDOMNAME() { return getToken(FateChaosParser.RANDOMNAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==RANDOMNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public TerminalNode RANDOMPLACE() { return getToken(FateChaosParser.RANDOMPLACE, 0); }
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_place);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==RANDOMPLACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(FateChaosParser.TEXT, 0); }
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(132);
				match(TEXT);
				}
				break;
			case RANDOM:
			case RANDOMANY:
				{
				setState(133);
				random();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RandomContext extends ParserRuleContext {
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
	 
		public RandomContext() { }
		public void copyFrom(RandomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RandomFreeContext extends RandomContext {
		public TerminalNode RANDOMANY() { return getToken(FateChaosParser.RANDOMANY, 0); }
		public RandomFreeContext(RandomContext ctx) { copyFrom(ctx); }
	}
	public static class RandomPhraseContext extends RandomContext {
		public TerminalNode RANDOM() { return getToken(FateChaosParser.RANDOM, 0); }
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public RandomPhraseContext(RandomContext ctx) { copyFrom(ctx); }
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_random);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOMANY:
				_localctx = new RandomFreeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(RANDOMANY);
				}
				break;
			case RANDOM:
				_localctx = new RandomPhraseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(RANDOM);
				setState(138);
				phrase();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseContext extends ParserRuleContext {
		public List<TerminalNode> NOUN() { return getTokens(FateChaosParser.NOUN); }
		public TerminalNode NOUN(int i) {
			return getToken(FateChaosParser.NOUN, i);
		}
		public List<TerminalNode> ADJECTIVE() { return getTokens(FateChaosParser.ADJECTIVE); }
		public TerminalNode ADJECTIVE(int i) {
			return getToken(FateChaosParser.ADJECTIVE, i);
		}
		public List<TerminalNode> VERB() { return getTokens(FateChaosParser.VERB); }
		public TerminalNode VERB(int i) {
			return getToken(FateChaosParser.VERB, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << ADJECTIVE) | (1L << VERB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << ADJECTIVE) | (1L << VERB))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(FateChaosParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6W\n\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\6\7"+
		"c\n\7\r\7\16\7d\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0089\n\22\3\23\3\23\3\23\5\23\u008e"+
		"\n\23\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\25\3\25\3\25\2\2\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\6\2\b\b\n\n\f\f\33\33\4"+
		"\2\7\7\21\21\4\2\7\7\24\24\4\2\7\7\22\22\4\2\7\7\23\23\3\2\26\30\2\u0092"+
		"\2+\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bD\3\2\2\2\nR\3\2\2\2\f`\3\2\2\2\16"+
		"l\3\2\2\2\20o\3\2\2\2\22r\3\2\2\2\24u\3\2\2\2\26x\3\2\2\2\30{\3\2\2\2"+
		"\32~\3\2\2\2\34\u0080\3\2\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2\"\u0088"+
		"\3\2\2\2$\u008d\3\2\2\2&\u0090\3\2\2\2(\u0094\3\2\2\2*,\5\4\3\2+*\3\2"+
		"\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2\2\2"+
		"\618\5\b\5\2\628\5\n\6\2\638\5\6\4\2\648\5\20\t\2\658\5\f\7\2\668\5\16"+
		"\b\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\33\2\2:;\5\32\16\2;?\5\30\r\2<>\5\20"+
		"\t\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5("+
		"\25\2C\7\3\2\2\2DE\7\b\2\2EF\5\36\20\2FH\5\22\n\2GI\5\24\13\2HG\3\2\2"+
		"\2HI\3\2\2\2IM\3\2\2\2JL\5\26\f\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OM\3\2\2\2PQ\5(\25\2Q\t\3\2\2\2RS\7\n\2\2ST\7\7\2\2TV\5"+
		"\22\n\2UW\5\24\13\2VU\3\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\5\26\f\2YX\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5(\25\2_\13\3\2"+
		"\2\2`b\7\35\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3"+
		"\2\2\2fh\5(\25\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki"+
		"\3\2\2\2lm\7\36\2\2mn\7\6\2\2n\17\3\2\2\2op\7\f\2\2pq\5\"\22\2q\21\3\2"+
		"\2\2rs\7\r\2\2st\5\"\22\2t\23\3\2\2\2uv\7\16\2\2vw\5\"\22\2w\25\3\2\2"+
		"\2xy\7\25\2\2yz\5\"\22\2z\27\3\2\2\2{|\7\34\2\2|}\5 \21\2}\31\3\2\2\2"+
		"~\177\t\3\2\2\177\33\3\2\2\2\u0080\u0081\t\4\2\2\u0081\35\3\2\2\2\u0082"+
		"\u0083\t\5\2\2\u0083\37\3\2\2\2\u0084\u0085\t\6\2\2\u0085!\3\2\2\2\u0086"+
		"\u0089\7\7\2\2\u0087\u0089\5$\23\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089#\3\2\2\2\u008a\u008e\7\20\2\2\u008b\u008c\7\17\2\2\u008c\u008e"+
		"\5&\24\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008e%\3\2\2\2\u008f"+
		"\u0091\t\7\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\'\3\2\2\2\u0094\u0095\7\t\2\2\u0095)\3"+
		"\2\2\2\16-\67?HMV[di\u0088\u008d\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}