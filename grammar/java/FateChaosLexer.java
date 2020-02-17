// Generated from FateChaos.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FateChaosLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEP=1, INT=2, NUMBER=3, DICE=4, TEXT=5, CHARACTER=6, END=7, NPC=8, CARD=9, 
		ASPECT=10, HIGHCONCEPT=11, TROUBLE=12, RANDOM=13, RANDOMANY=14, RANDOMSET=15, 
		RANDOMNAME=16, RANDOMPLACE=17, RANDOMDESCRIPTION=18, ATTRIBUTE=19, NOUN=20, 
		ADJECTIVE=21, VERB=22, PLACE=23, PERSON=24, SCENE=25, LOCATION=26, GENERATE=27, 
		ROLL=28, WS=29, COMMENT=30, ANY=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z", "UNDERSCORE", 
			"DASH", "QUOTE", "LINEFEED", "RETURN", "POUND", "PLUS", "LETTER", "DIGIT", 
			"SEP", "INT", "NUMBER", "DICE", "TEXT", "CHARACTER", "END", "NPC", "CARD", 
			"ASPECT", "HIGHCONCEPT", "TROUBLE", "RANDOM", "RANDOMANY", "RANDOMSET", 
			"RANDOMNAME", "RANDOMPLACE", "RANDOMDESCRIPTION", "ATTRIBUTE", "NOUN", 
			"ADJECTIVE", "VERB", "PLACE", "PERSON", "SCENE", "LOCATION", "GENERATE", 
			"ROLL", "WS", "COMMENT", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEP", "INT", "NUMBER", "DICE", "TEXT", "CHARACTER", "END", "NPC", 
			"CARD", "ASPECT", "HIGHCONCEPT", "TROUBLE", "RANDOM", "RANDOMANY", "RANDOMSET", 
			"RANDOMNAME", "RANDOMPLACE", "RANDOMDESCRIPTION", "ATTRIBUTE", "NOUN", 
			"ADJECTIVE", "VERB", "PLACE", "PERSON", "SCENE", "LOCATION", "GENERATE", 
			"ROLL", "WS", "COMMENT", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public FateChaosLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FateChaos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0230\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00cd"+
		"\n%\r%\16%\u00ce\3&\3&\3&\5&\u00d4\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u00de\n\'\3(\3(\3(\3(\6(\u00e4\n(\r(\16(\u00e5\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u00f7\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0104\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u010e\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u011a\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\5.\u012b\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0138\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0145\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u0156\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0167\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0179\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u018c\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01a5"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u01b4\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01be\n"+
		"\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u01cd\n8\39\39\39\39\39"+
		"\39\39\39\59\u01d7\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01e2\n:\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\5;\u01ee\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01f9"+
		"\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0207\n=\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\5>\u0216\n>\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0220\n?"+
		"\3@\3@\3@\3@\3A\3A\7A\u0228\nA\fA\16A\u022b\13A\3A\3A\3B\3B\2\2C\3\2\5"+
		"\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\3I\4K\5"+
		"M\6O\7Q\bS\tU\nW\13Y\f[\r]\16_\17a\20c\21e\22g\23i\24k\25m\26o\27q\30"+
		"s\31u\32w\33y\34{\35}\36\177\37\u0081 \u0083!\3\2 \4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\3\2$$\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\2\u0229\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2"+
		"\2\7\u0089\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17"+
		"\u0091\3\2\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2\2\27\u0099"+
		"\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2\2\2\37\u00a1\3"+
		"\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00ab"+
		"\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cc\3\2\2\2K\u00d0\3\2\2\2M\u00dd\3\2"+
		"\2\2O\u00df\3\2\2\2Q\u00f6\3\2\2\2S\u00f8\3\2\2\2U\u0103\3\2\2\2W\u010d"+
		"\3\2\2\2Y\u0119\3\2\2\2[\u012a\3\2\2\2]\u0137\3\2\2\2_\u0144\3\2\2\2a"+
		"\u0155\3\2\2\2c\u0166\3\2\2\2e\u0178\3\2\2\2g\u018b\3\2\2\2i\u01a4\3\2"+
		"\2\2k\u01b3\3\2\2\2m\u01bd\3\2\2\2o\u01cc\3\2\2\2q\u01d6\3\2\2\2s\u01e1"+
		"\3\2\2\2u\u01ed\3\2\2\2w\u01f8\3\2\2\2y\u0206\3\2\2\2{\u0215\3\2\2\2}"+
		"\u021f\3\2\2\2\177\u0221\3\2\2\2\u0081\u0225\3\2\2\2\u0083\u022e\3\2\2"+
		"\2\u0085\u0086\t\2\2\2\u0086\4\3\2\2\2\u0087\u0088\t\3\2\2\u0088\6\3\2"+
		"\2\2\u0089\u008a\t\4\2\2\u008a\b\3\2\2\2\u008b\u008c\t\5\2\2\u008c\n\3"+
		"\2\2\2\u008d\u008e\t\6\2\2\u008e\f\3\2\2\2\u008f\u0090\t\7\2\2\u0090\16"+
		"\3\2\2\2\u0091\u0092\t\b\2\2\u0092\20\3\2\2\2\u0093\u0094\t\t\2\2\u0094"+
		"\22\3\2\2\2\u0095\u0096\t\n\2\2\u0096\24\3\2\2\2\u0097\u0098\t\13\2\2"+
		"\u0098\26\3\2\2\2\u0099\u009a\t\f\2\2\u009a\30\3\2\2\2\u009b\u009c\t\r"+
		"\2\2\u009c\32\3\2\2\2\u009d\u009e\t\16\2\2\u009e\34\3\2\2\2\u009f\u00a0"+
		"\t\17\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\t\20\2\2\u00a2 \3\2\2\2\u00a3\u00a4"+
		"\t\21\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\t\22\2\2\u00a6$\3\2\2\2\u00a7\u00a8"+
		"\t\23\2\2\u00a8&\3\2\2\2\u00a9\u00aa\t\24\2\2\u00aa(\3\2\2\2\u00ab\u00ac"+
		"\t\25\2\2\u00ac*\3\2\2\2\u00ad\u00ae\t\26\2\2\u00ae,\3\2\2\2\u00af\u00b0"+
		"\t\27\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\30\2\2\u00b2\60\3\2\2\2\u00b3\u00b4"+
		"\t\31\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\t\32\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\7a\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba8\3\2\2\2\u00bb"+
		"\u00bc\7$\2\2\u00bc:\3\2\2\2\u00bd\u00be\7\f\2\2\u00be<\3\2\2\2\u00bf"+
		"\u00c0\7\17\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2@\3\2\2\2\u00c3"+
		"\u00c4\7-\2\2\u00c4B\3\2\2\2\u00c5\u00c6\t\33\2\2\u00c6D\3\2\2\2\u00c7"+
		"\u00c8\t\34\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7<\2\2\u00caH\3\2\2\2\u00cb"+
		"\u00cd\5E#\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cfJ\3\2\2\2\u00d0\u00d3\5I%\2\u00d1\u00d2\7"+
		"\60\2\2\u00d2\u00d4\5I%\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"L\3\2\2\2\u00d5\u00d6\5I%\2\u00d6\u00d7\5\t\5\2\u00d7\u00d8\5I%\2\u00d8"+
		"\u00de\3\2\2\2\u00d9\u00da\5A!\2\u00da\u00db\5\t\5\2\u00db\u00dc\5I%\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2\2\2\u00deN\3"+
		"\2\2\2\u00df\u00e3\59\35\2\u00e0\u00e1\7^\2\2\u00e1\u00e4\7$\2\2\u00e2"+
		"\u00e4\n\35\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\59\35\2\u00e8P\3\2\2\2\u00e9\u00ea\5\7\4\2\u00ea\u00eb\5\21\t\2"+
		"\u00eb\u00ec\5\3\2\2\u00ec\u00ed\5%\23\2\u00ed\u00ee\5\3\2\2\u00ee\u00ef"+
		"\5\7\4\2\u00ef\u00f0\5)\25\2\u00f0\u00f1\5\13\6\2\u00f1\u00f2\5%\23\2"+
		"\u00f2\u00f7\3\2\2\2\u00f3\u00f4\5!\21\2\u00f4\u00f5\5\7\4\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7R\3\2\2\2\u00f8"+
		"\u00f9\5\13\6\2\u00f9\u00fa\5\35\17\2\u00fa\u00fb\5\t\5\2\u00fbT\3\2\2"+
		"\2\u00fc\u00fd\5\35\17\2\u00fd\u00fe\5!\21\2\u00fe\u00ff\5\7\4\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u0101\5\35\17\2\u0101\u0102\5\7\4\2\u0102\u0104\3"+
		"\2\2\2\u0103\u00fc\3\2\2\2\u0103\u0100\3\2\2\2\u0104V\3\2\2\2\u0105\u0106"+
		"\5\7\4\2\u0106\u0107\5\3\2\2\u0107\u0108\5%\23\2\u0108\u0109\5\t\5\2\u0109"+
		"\u010e\3\2\2\2\u010a\u010b\5\7\4\2\u010b\u010c\5\t\5\2\u010c\u010e\3\2"+
		"\2\2\u010d\u0105\3\2\2\2\u010d\u010a\3\2\2\2\u010eX\3\2\2\2\u010f\u0110"+
		"\5\3\2\2\u0110\u0111\5\'\24\2\u0111\u0112\5!\21\2\u0112\u0113\5\13\6\2"+
		"\u0113\u0114\5\7\4\2\u0114\u0115\5)\25\2\u0115\u011a\3\2\2\2\u0116\u0117"+
		"\5\3\2\2\u0117\u0118\5\3\2\2\u0118\u011a\3\2\2\2\u0119\u010f\3\2\2\2\u0119"+
		"\u0116\3\2\2\2\u011aZ\3\2\2\2\u011b\u011c\5\21\t\2\u011c\u011d\5\23\n"+
		"\2\u011d\u011e\5\17\b\2\u011e\u011f\5\21\t\2\u011f\u0120\5\7\4\2\u0120"+
		"\u0121\5\37\20\2\u0121\u0122\5\35\17\2\u0122\u0123\5\7\4\2\u0123\u0124"+
		"\5\13\6\2\u0124\u0125\5!\21\2\u0125\u0126\5)\25\2\u0126\u012b\3\2\2\2"+
		"\u0127\u0128\5\21\t\2\u0128\u0129\5\7\4\2\u0129\u012b\3\2\2\2\u012a\u011b"+
		"\3\2\2\2\u012a\u0127\3\2\2\2\u012b\\\3\2\2\2\u012c\u012d\5)\25\2\u012d"+
		"\u012e\5%\23\2\u012e\u012f\5\37\20\2\u012f\u0130\5+\26\2\u0130\u0131\5"+
		"\5\3\2\u0131\u0132\5\31\r\2\u0132\u0133\5\13\6\2\u0133\u0138\3\2\2\2\u0134"+
		"\u0135\5)\25\2\u0135\u0136\5%\23\2\u0136\u0138\3\2\2\2\u0137\u012c\3\2"+
		"\2\2\u0137\u0134\3\2\2\2\u0138^\3\2\2\2\u0139\u013a\5%\23\2\u013a\u013b"+
		"\5\3\2\2\u013b\u013c\5\35\17\2\u013c\u013d\5\t\5\2\u013d\u013e\5\37\20"+
		"\2\u013e\u013f\5\33\16\2\u013f\u0145\3\2\2\2\u0140\u0141\5%\23\2\u0141"+
		"\u0142\5\35\17\2\u0142\u0143\5\t\5\2\u0143\u0145\3\2\2\2\u0144\u0139\3"+
		"\2\2\2\u0144\u0140\3\2\2\2\u0145`\3\2\2\2\u0146\u0147\5%\23\2\u0147\u0148"+
		"\5\3\2\2\u0148\u0149\5\35\17\2\u0149\u014a\5\t\5\2\u014a\u014b\5\37\20"+
		"\2\u014b\u014c\5\33\16\2\u014c\u014d\5\3\2\2\u014d\u014e\5\35\17\2\u014e"+
		"\u014f\5\61\31\2\u014f\u0156\3\2\2\2\u0150\u0151\5%\23\2\u0151\u0152\5"+
		"\35\17\2\u0152\u0153\5\t\5\2\u0153\u0154\5\3\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0146\3\2\2\2\u0155\u0150\3\2\2\2\u0156b\3\2\2\2\u0157\u0158\5%\23\2"+
		"\u0158\u0159\5\3\2\2\u0159\u015a\5\35\17\2\u015a\u015b\5\t\5\2\u015b\u015c"+
		"\5\37\20\2\u015c\u015d\5\33\16\2\u015d\u015e\5\'\24\2\u015e\u015f\5\13"+
		"\6\2\u015f\u0160\5)\25\2\u0160\u0167\3\2\2\2\u0161\u0162\5%\23\2\u0162"+
		"\u0163\5\35\17\2\u0163\u0164\5\t\5\2\u0164\u0165\5\'\24\2\u0165\u0167"+
		"\3\2\2\2\u0166\u0157\3\2\2\2\u0166\u0161\3\2\2\2\u0167d\3\2\2\2\u0168"+
		"\u0169\5%\23\2\u0169\u016a\5\3\2\2\u016a\u016b\5\35\17\2\u016b\u016c\5"+
		"\t\5\2\u016c\u016d\5\37\20\2\u016d\u016e\5\33\16\2\u016e\u016f\5\35\17"+
		"\2\u016f\u0170\5\3\2\2\u0170\u0171\5\33\16\2\u0171\u0172\5\13\6\2\u0172"+
		"\u0179\3\2\2\2\u0173\u0174\5%\23\2\u0174\u0175\5\35\17\2\u0175\u0176\5"+
		"\t\5\2\u0176\u0177\5\35\17\2\u0177\u0179\3\2\2\2\u0178\u0168\3\2\2\2\u0178"+
		"\u0173\3\2\2\2\u0179f\3\2\2\2\u017a\u017b\5%\23\2\u017b\u017c\5\3\2\2"+
		"\u017c\u017d\5\35\17\2\u017d\u017e\5\t\5\2\u017e\u017f\5\37\20\2\u017f"+
		"\u0180\5\33\16\2\u0180\u0181\5!\21\2\u0181\u0182\5\31\r\2\u0182\u0183"+
		"\5\3\2\2\u0183\u0184\5\7\4\2\u0184\u0185\5\13\6\2\u0185\u018c\3\2\2\2"+
		"\u0186\u0187\5%\23\2\u0187\u0188\5\35\17\2\u0188\u0189\5\t\5\2\u0189\u018a"+
		"\5!\21\2\u018a\u018c\3\2\2\2\u018b\u017a\3\2\2\2\u018b\u0186\3\2\2\2\u018c"+
		"h\3\2\2\2\u018d\u018e\5%\23\2\u018e\u018f\5\3\2\2\u018f\u0190\5\35\17"+
		"\2\u0190\u0191\5\t\5\2\u0191\u0192\5\37\20\2\u0192\u0193\5\33\16\2\u0193"+
		"\u0194\5\t\5\2\u0194\u0195\5\13\6\2\u0195\u0196\5\'\24\2\u0196\u0197\5"+
		"\7\4\2\u0197\u0198\5%\23\2\u0198\u0199\5\23\n\2\u0199\u019a\5!\21\2\u019a"+
		"\u019b\5)\25\2\u019b\u019c\5\23\n\2\u019c\u019d\5\37\20\2\u019d\u019e"+
		"\5\35\17\2\u019e\u01a5\3\2\2\2\u019f\u01a0\5%\23\2\u01a0\u01a1\5\35\17"+
		"\2\u01a1\u01a2\5\t\5\2\u01a2\u01a3\5\t\5\2\u01a3\u01a5\3\2\2\2\u01a4\u018d"+
		"\3\2\2\2\u01a4\u019f\3\2\2\2\u01a5j\3\2\2\2\u01a6\u01a7\5\3\2\2\u01a7"+
		"\u01a8\5)\25\2\u01a8\u01a9\5)\25\2\u01a9\u01aa\5%\23\2\u01aa\u01ab\5\23"+
		"\n\2\u01ab\u01ac\5\5\3\2\u01ac\u01ad\5+\26\2\u01ad\u01ae\5)\25\2\u01ae"+
		"\u01af\5\13\6\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\5\3\2\2\u01b1\u01b2\5"+
		"%\23\2\u01b2\u01b4\3\2\2\2\u01b3\u01a6\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4"+
		"l\3\2\2\2\u01b5\u01b6\5\35\17\2\u01b6\u01b7\5\37\20\2\u01b7\u01b8\5+\26"+
		"\2\u01b8\u01b9\5\35\17\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\5\35\17\2\u01bb"+
		"\u01bc\5\35\17\2\u01bc\u01be\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01ba\3"+
		"\2\2\2\u01ben\3\2\2\2\u01bf\u01c0\5\3\2\2\u01c0\u01c1\5\t\5\2\u01c1\u01c2"+
		"\5\25\13\2\u01c2\u01c3\5\13\6\2\u01c3\u01c4\5\7\4\2\u01c4\u01c5\5)\25"+
		"\2\u01c5\u01c6\5\23\n\2\u01c6\u01c7\5-\27\2\u01c7\u01c8\5\13\6\2\u01c8"+
		"\u01cd\3\2\2\2\u01c9\u01ca\5\3\2\2\u01ca\u01cb\5\t\5\2\u01cb\u01cd\3\2"+
		"\2\2\u01cc\u01bf\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cdp\3\2\2\2\u01ce\u01cf"+
		"\5-\27\2\u01cf\u01d0\5\13\6\2\u01d0\u01d1\5%\23\2\u01d1\u01d2\5\5\3\2"+
		"\u01d2\u01d7\3\2\2\2\u01d3\u01d4\5-\27\2\u01d4\u01d5\5\5\3\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7r\3\2\2\2\u01d8"+
		"\u01d9\5!\21\2\u01d9\u01da\5\31\r\2\u01da\u01db\5\3\2\2\u01db\u01dc\5"+
		"\7\4\2\u01dc\u01dd\5\13\6\2\u01dd\u01e2\3\2\2\2\u01de\u01df\5!\21\2\u01df"+
		"\u01e0\5\31\r\2\u01e0\u01e2\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01de\3"+
		"\2\2\2\u01e2t\3\2\2\2\u01e3\u01e4\5!\21\2\u01e4\u01e5\5\13\6\2\u01e5\u01e6"+
		"\5%\23\2\u01e6\u01e7\5\'\24\2\u01e7\u01e8\5\37\20\2\u01e8\u01e9\5\35\17"+
		"\2\u01e9\u01ee\3\2\2\2\u01ea\u01eb\5!\21\2\u01eb\u01ec\5%\23\2\u01ec\u01ee"+
		"\3\2\2\2\u01ed\u01e3\3\2\2\2\u01ed\u01ea\3\2\2\2\u01eev\3\2\2\2\u01ef"+
		"\u01f0\5\'\24\2\u01f0\u01f1\5\7\4\2\u01f1\u01f2\5\13\6\2\u01f2\u01f3\5"+
		"\35\17\2\u01f3\u01f4\5\13\6\2\u01f4\u01f9\3\2\2\2\u01f5\u01f6\5\'\24\2"+
		"\u01f6\u01f7\5\7\4\2\u01f7\u01f9\3\2\2\2\u01f8\u01ef\3\2\2\2\u01f8\u01f5"+
		"\3\2\2\2\u01f9x\3\2\2\2\u01fa\u01fb\5\31\r\2\u01fb\u01fc\5\37\20\2\u01fc"+
		"\u01fd\5\7\4\2\u01fd\u01fe\5\3\2\2\u01fe\u01ff\5)\25\2\u01ff\u0200\5\23"+
		"\n\2\u0200\u0201\5\37\20\2\u0201\u0202\5\35\17\2\u0202\u0207\3\2\2\2\u0203"+
		"\u0204\5\31\r\2\u0204\u0205\5\35\17\2\u0205\u0207\3\2\2\2\u0206\u01fa"+
		"\3\2\2\2\u0206\u0203\3\2\2\2\u0207z\3\2\2\2\u0208\u0209\5\17\b\2\u0209"+
		"\u020a\5\13\6\2\u020a\u020b\5\35\17\2\u020b\u020c\5\13\6\2\u020c\u020d"+
		"\5%\23\2\u020d\u020e\5\3\2\2\u020e\u020f\5)\25\2\u020f\u0210\5\13\6\2"+
		"\u0210\u0216\3\2\2\2\u0211\u0212\5\17\b\2\u0212\u0213\5\13\6\2\u0213\u0214"+
		"\5\35\17\2\u0214\u0216\3\2\2\2\u0215\u0208\3\2\2\2\u0215\u0211\3\2\2\2"+
		"\u0216|\3\2\2\2\u0217\u0218\5%\23\2\u0218\u0219\5\37\20\2\u0219\u021a"+
		"\5\31\r\2\u021a\u021b\5\31\r\2\u021b\u0220\3\2\2\2\u021c\u021d\5%\23\2"+
		"\u021d\u021e\5\31\r\2\u021e\u0220\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u021c"+
		"\3\2\2\2\u0220~\3\2\2\2\u0221\u0222\t\36\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\b@\2\2\u0224\u0080\3\2\2\2\u0225\u0229\5? \2\u0226\u0228\n\37\2"+
		"\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\bA\2\2\u022d"+
		"\u0082\3\2\2\2\u022e\u022f\13\2\2\2\u022f\u0084\3\2\2\2\37\2\u00ce\u00d3"+
		"\u00dd\u00e3\u00e5\u00f6\u0103\u010d\u0119\u012a\u0137\u0144\u0155\u0166"+
		"\u0178\u018b\u01a4\u01b3\u01bd\u01cc\u01d6\u01e1\u01ed\u01f8\u0206\u0215"+
		"\u021f\u0229\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}