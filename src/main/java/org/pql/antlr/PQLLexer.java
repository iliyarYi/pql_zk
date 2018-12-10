// Generated from PQL.g4 by ANTLR 4.7.1
package org.pql.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNIVERSE=1, STRING=2, VARIABLE_NAME=3, SIMILARITY=4, LP=5, RP=6, LB=7, 
		RB=8, LSB=9, RSB=10, LTB=11, RTB=12, DQ=13, EOS=14, SEP=15, ASSIGN=16, 
		TILDE=17, ESC_SEQ=18, UNICODE_ESC=19, HEX_DIGIT=20, WS=21, LINE_COMMENT=22, 
		SELECT=23, INSERT=24, INTO=25, FROM=26, WHERE=27, EQUALS=28, OVERLAPS=29, 
		WITH=30, SUBSET=31, PROPER=32, GET_TASKS=33, NOT=34, AND=35, OR=36, ANY=37, 
		EACH=38, ALL=39, IN=40, IS=41, OF=42, TRUE=43, FALSE=44, UNION=45, INTERSECTION=46, 
		DIFFERENCE=47, CAN_OCCUR=48, ALWAYS_OCCURS=49, EXECUTES=50, CAN_CONFLICT=51, 
		CAN_COOCCUR=52, CONFLICT=53, COOCCUR=54, TOTAL_CAUSAL=55, TOTAL_CONCUR=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UNIVERSE", "STRING", "VARIABLE_NAME", "SIMILARITY", "LP", "RP", "LB", 
		"RB", "LSB", "RSB", "LTB", "RTB", "DQ", "EOS", "SEP", "ASSIGN", "TILDE", 
		"ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", "WS", "LINE_COMMENT", "SELECT", 
		"INSERT", "INTO", "FROM", "WHERE", "EQUALS", "OVERLAPS", "WITH", "SUBSET", 
		"PROPER", "GET_TASKS", "NOT", "AND", "OR", "ANY", "EACH", "ALL", "IN", 
		"IS", "OF", "TRUE", "FALSE", "UNION", "INTERSECTION", "DIFFERENCE", "CAN_OCCUR", 
		"ALWAYS_OCCURS", "EXECUTES", "CAN_CONFLICT", "CAN_COOCCUR", "CONFLICT", 
		"COOCCUR", "TOTAL_CAUSAL", "TOTAL_CONCUR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'<'", "'>'", "'\"'", "';'", "','", "'='", "'~'", null, null, null, null, 
		null, "'SELECT'", "'INSERT'", "'INTO'", "'FROM'", "'WHERE'", "'EQUALS'", 
		"'OVERLAPS'", "'WITH'", "'SUBSET'", "'PROPER'", "'GetTasks'", "'NOT'", 
		"'AND'", "'OR'", "'ANY'", "'EACH'", "'ALL'", "'IN'", "'IS'", "'OF'", "'TRUE'", 
		"'FALSE'", "'UNION'", "'INTERSECT'", "'EXCEPT'", "'CanOccur'", "'AlwaysOccurs'", 
		"'Executes'", "'CanConflict'", "'CanCooccur'", "'Conflict'", "'Cooccur'", 
		"'TotalCausal'", "'TotalConcurrent'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UNIVERSE", "STRING", "VARIABLE_NAME", "SIMILARITY", "LP", "RP", 
		"LB", "RB", "LSB", "RSB", "LTB", "RTB", "DQ", "EOS", "SEP", "ASSIGN", 
		"TILDE", "ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", "WS", "LINE_COMMENT", 
		"SELECT", "INSERT", "INTO", "FROM", "WHERE", "EQUALS", "OVERLAPS", "WITH", 
		"SUBSET", "PROPER", "GET_TASKS", "NOT", "AND", "OR", "ANY", "EACH", "ALL", 
		"IN", "IS", "OF", "TRUE", "FALSE", "UNION", "INTERSECTION", "DIFFERENCE", 
		"CAN_OCCUR", "ALWAYS_OCCURS", "EXECUTES", "CAN_CONFLICT", "CAN_COOCCUR", 
		"CONFLICT", "COOCCUR", "TOTAL_CAUSAL", "TOTAL_CONCUR"
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


	public PQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01c5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\7\3"+
		"y\n\3\f\3\16\3|\13\3\3\3\3\3\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13\4"+
		"\3\5\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\5\5\u008f\n\5\3\5\3\5\6"+
		"\5\u0093\n\5\r\5\16\5\u0094\5\5\u0097\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u00b6\n\23\3\23\5\23\u00b9\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\6\26\u00c5\n\26\r\26"+
		"\16\26\u00c6\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00cf\n\27\f\27\16\27"+
		"\u00d2\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\t\4\2$$^^\4\2aac|\5"+
		"\2\62;aac|\t\2\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\2\u01d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7\177"+
		"\3\2\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u009a\3\2\2\2\17\u009c\3\2"+
		"\2\2\21\u009e\3\2\2\2\23\u00a0\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2"+
		"\2\31\u00a6\3\2\2\2\33\u00a8\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2"+
		"!\u00ae\3\2\2\2#\u00b0\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2)\u00c1\3"+
		"\2\2\2+\u00c4\3\2\2\2-\u00ca\3\2\2\2/\u00d5\3\2\2\2\61\u00dc\3\2\2\2\63"+
		"\u00e3\3\2\2\2\65\u00e8\3\2\2\2\67\u00ed\3\2\2\29\u00f3\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0108\3\2\2\2A\u010f\3\2\2\2C\u0116\3\2\2\2E"+
		"\u011f\3\2\2\2G\u0123\3\2\2\2I\u0127\3\2\2\2K\u012a\3\2\2\2M\u012e\3\2"+
		"\2\2O\u0133\3\2\2\2Q\u0137\3\2\2\2S\u013a\3\2\2\2U\u013d\3\2\2\2W\u0140"+
		"\3\2\2\2Y\u0145\3\2\2\2[\u014b\3\2\2\2]\u0151\3\2\2\2_\u015b\3\2\2\2a"+
		"\u0162\3\2\2\2c\u016b\3\2\2\2e\u0178\3\2\2\2g\u0181\3\2\2\2i\u018d\3\2"+
		"\2\2k\u0198\3\2\2\2m\u01a1\3\2\2\2o\u01a9\3\2\2\2q\u01b5\3\2\2\2st\7,"+
		"\2\2t\4\3\2\2\2uz\5\33\16\2vy\5%\23\2wy\n\2\2\2xv\3\2\2\2xw\3\2\2\2y|"+
		"\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\5\33\16\2~\6\3\2\2"+
		"\2\177\u0083\t\3\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\b\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0097\7\63\2\2\u0087\u008e\7\62\2\2\u0088\u008a\7"+
		"\60\2\2\u0089\u008b\4\62;\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0097\3\2\2\2\u0090\u0092\7\60\2\2\u0091"+
		"\u0093\4\62;\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0086\3\2\2\2\u0096"+
		"\u0087\3\2\2\2\u0096\u0090\3\2\2\2\u0097\n\3\2\2\2\u0098\u0099\7*\2\2"+
		"\u0099\f\3\2\2\2\u009a\u009b\7+\2\2\u009b\16\3\2\2\2\u009c\u009d\7}\2"+
		"\2\u009d\20\3\2\2\2\u009e\u009f\7\177\2\2\u009f\22\3\2\2\2\u00a0\u00a1"+
		"\7]\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3\26\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7$\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\36\3\2\2\2\u00ac\u00ad"+
		"\7.\2\2\u00ad \3\2\2\2\u00ae\u00af\7?\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7\u0080\2\2\u00b1$\3\2\2\2\u00b2\u00b5\7^\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b6\t\5\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b9\5\'\24\2\u00b8\u00b2\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"&\3\2\2\2\u00ba\u00bb\7^\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\5)\25\2\u00bd"+
		"\u00be\5)\25\2\u00be\u00bf\5)\25\2\u00bf\u00c0\5)\25\2\u00c0(\3\2\2\2"+
		"\u00c1\u00c2\t\6\2\2\u00c2*\3\2\2\2\u00c3\u00c5\t\7\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\b\26\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7/\2\2"+
		"\u00cb\u00cc\7/\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\n\b\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\27\2\2\u00d4.\3\2\2\2"+
		"\u00d5\u00d6\7U\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7N\2\2\u00d8\u00d9"+
		"\7G\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7V\2\2\u00db\60\3\2\2\2\u00dc\u00dd"+
		"\7K\2\2\u00dd\u00de\7P\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7G\2\2\u00e0"+
		"\u00e1\7T\2\2\u00e1\u00e2\7V\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7K\2\2\u00e4"+
		"\u00e5\7P\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7Q\2\2\u00e7\64\3\2\2\2\u00e8"+
		"\u00e9\7H\2\2\u00e9\u00ea\7T\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7O\2\2"+
		"\u00ec\66\3\2\2\2\u00ed\u00ee\7Y\2\2\u00ee\u00ef\7J\2\2\u00ef\u00f0\7"+
		"G\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7G\2\2\u00f28\3\2\2\2\u00f3\u00f4"+
		"\7G\2\2\u00f4\u00f5\7S\2\2\u00f5\u00f6\7W\2\2\u00f6\u00f7\7C\2\2\u00f7"+
		"\u00f8\7N\2\2\u00f8\u00f9\7U\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7Q\2\2\u00fb"+
		"\u00fc\7X\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7N\2\2"+
		"\u00ff\u0100\7C\2\2\u0100\u0101\7R\2\2\u0101\u0102\7U\2\2\u0102<\3\2\2"+
		"\2\u0103\u0104\7Y\2\2\u0104\u0105\7K\2\2\u0105\u0106\7V\2\2\u0106\u0107"+
		"\7J\2\2\u0107>\3\2\2\2\u0108\u0109\7U\2\2\u0109\u010a\7W\2\2\u010a\u010b"+
		"\7D\2\2\u010b\u010c\7U\2\2\u010c\u010d\7G\2\2\u010d\u010e\7V\2\2\u010e"+
		"@\3\2\2\2\u010f\u0110\7R\2\2\u0110\u0111\7T\2\2\u0111\u0112\7Q\2\2\u0112"+
		"\u0113\7R\2\2\u0113\u0114\7G\2\2\u0114\u0115\7T\2\2\u0115B\3\2\2\2\u0116"+
		"\u0117\7I\2\2\u0117\u0118\7g\2\2\u0118\u0119\7v\2\2\u0119\u011a\7V\2\2"+
		"\u011a\u011b\7c\2\2\u011b\u011c\7u\2\2\u011c\u011d\7m\2\2\u011d\u011e"+
		"\7u\2\2\u011eD\3\2\2\2\u011f\u0120\7P\2\2\u0120\u0121\7Q\2\2\u0121\u0122"+
		"\7V\2\2\u0122F\3\2\2\2\u0123\u0124\7C\2\2\u0124\u0125\7P\2\2\u0125\u0126"+
		"\7F\2\2\u0126H\3\2\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7T\2\2\u0129J\3"+
		"\2\2\2\u012a\u012b\7C\2\2\u012b\u012c\7P\2\2\u012c\u012d\7[\2\2\u012d"+
		"L\3\2\2\2\u012e\u012f\7G\2\2\u012f\u0130\7C\2\2\u0130\u0131\7E\2\2\u0131"+
		"\u0132\7J\2\2\u0132N\3\2\2\2\u0133\u0134\7C\2\2\u0134\u0135\7N\2\2\u0135"+
		"\u0136\7N\2\2\u0136P\3\2\2\2\u0137\u0138\7K\2\2\u0138\u0139\7P\2\2\u0139"+
		"R\3\2\2\2\u013a\u013b\7K\2\2\u013b\u013c\7U\2\2\u013cT\3\2\2\2\u013d\u013e"+
		"\7Q\2\2\u013e\u013f\7H\2\2\u013fV\3\2\2\2\u0140\u0141\7V\2\2\u0141\u0142"+
		"\7T\2\2\u0142\u0143\7W\2\2\u0143\u0144\7G\2\2\u0144X\3\2\2\2\u0145\u0146"+
		"\7H\2\2\u0146\u0147\7C\2\2\u0147\u0148\7N\2\2\u0148\u0149\7U\2\2\u0149"+
		"\u014a\7G\2\2\u014aZ\3\2\2\2\u014b\u014c\7W\2\2\u014c\u014d\7P\2\2\u014d"+
		"\u014e\7K\2\2\u014e\u014f\7Q\2\2\u014f\u0150\7P\2\2\u0150\\\3\2\2\2\u0151"+
		"\u0152\7K\2\2\u0152\u0153\7P\2\2\u0153\u0154\7V\2\2\u0154\u0155\7G\2\2"+
		"\u0155\u0156\7T\2\2\u0156\u0157\7U\2\2\u0157\u0158\7G\2\2\u0158\u0159"+
		"\7E\2\2\u0159\u015a\7V\2\2\u015a^\3\2\2\2\u015b\u015c\7G\2\2\u015c\u015d"+
		"\7Z\2\2\u015d\u015e\7E\2\2\u015e\u015f\7G\2\2\u015f\u0160\7R\2\2\u0160"+
		"\u0161\7V\2\2\u0161`\3\2\2\2\u0162\u0163\7E\2\2\u0163\u0164\7c\2\2\u0164"+
		"\u0165\7p\2\2\u0165\u0166\7Q\2\2\u0166\u0167\7e\2\2\u0167\u0168\7e\2\2"+
		"\u0168\u0169\7w\2\2\u0169\u016a\7t\2\2\u016ab\3\2\2\2\u016b\u016c\7C\2"+
		"\2\u016c\u016d\7n\2\2\u016d\u016e\7y\2\2\u016e\u016f\7c\2\2\u016f\u0170"+
		"\7{\2\2\u0170\u0171\7u\2\2\u0171\u0172\7Q\2\2\u0172\u0173\7e\2\2\u0173"+
		"\u0174\7e\2\2\u0174\u0175\7w\2\2\u0175\u0176\7t\2\2\u0176\u0177\7u\2\2"+
		"\u0177d\3\2\2\2\u0178\u0179\7G\2\2\u0179\u017a\7z\2\2\u017a\u017b\7g\2"+
		"\2\u017b\u017c\7e\2\2\u017c\u017d\7w\2\2\u017d\u017e\7v\2\2\u017e\u017f"+
		"\7g\2\2\u017f\u0180\7u\2\2\u0180f\3\2\2\2\u0181\u0182\7E\2\2\u0182\u0183"+
		"\7c\2\2\u0183\u0184\7p\2\2\u0184\u0185\7E\2\2\u0185\u0186\7q\2\2\u0186"+
		"\u0187\7p\2\2\u0187\u0188\7h\2\2\u0188\u0189\7n\2\2\u0189\u018a\7k\2\2"+
		"\u018a\u018b\7e\2\2\u018b\u018c\7v\2\2\u018ch\3\2\2\2\u018d\u018e\7E\2"+
		"\2\u018e\u018f\7c\2\2\u018f\u0190\7p\2\2\u0190\u0191\7E\2\2\u0191\u0192"+
		"\7q\2\2\u0192\u0193\7q\2\2\u0193\u0194\7e\2\2\u0194\u0195\7e\2\2\u0195"+
		"\u0196\7w\2\2\u0196\u0197\7t\2\2\u0197j\3\2\2\2\u0198\u0199\7E\2\2\u0199"+
		"\u019a\7q\2\2\u019a\u019b\7p\2\2\u019b\u019c\7h\2\2\u019c\u019d\7n\2\2"+
		"\u019d\u019e\7k\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7v\2\2\u01a0l\3\2\2"+
		"\2\u01a1\u01a2\7E\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5"+
		"\7e\2\2\u01a5\u01a6\7e\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7t\2\2\u01a8"+
		"n\3\2\2\2\u01a9\u01aa\7V\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7v\2\2\u01ac"+
		"\u01ad\7c\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af\7E\2\2\u01af\u01b0\7c\2\2"+
		"\u01b0\u01b1\7w\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4"+
		"\7n\2\2\u01b4p\3\2\2\2\u01b5\u01b6\7V\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8"+
		"\7v\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7E\2\2\u01bb"+
		"\u01bc\7q\2\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7e\2\2\u01be\u01bf\7w\2\2"+
		"\u01bf\u01c0\7t\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3"+
		"\7p\2\2\u01c3\u01c4\7v\2\2\u01c4r\3\2\2\2\16\2xz\u0083\u008c\u008e\u0094"+
		"\u0096\u00b5\u00b8\u00c6\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}