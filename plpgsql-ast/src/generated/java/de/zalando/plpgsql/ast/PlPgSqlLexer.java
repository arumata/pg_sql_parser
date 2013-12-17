// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlPgSqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, LIKE=9, 
		SIMILAR_OP=10, SIMILAR=11, TO=12, AND=13, OR=14, ASSIGN_OP=15, BETWEEN=16, 
		IS=17, NOT=18, ISNULL=19, NOTNULL=20, MUL=21, DIV=22, MOD=23, ADD=24, 
		SUB=25, EQ=26, NEQ=27, LT=28, LTE=29, GT=30, GTE=31, SELECT=32, ALL=33, 
		DISTINCT=34, FROM=35, WHERE=36, GROUP_BY=37, GROUP=38, BY=39, ORDER_BY=40, 
		ORDER=41, LIMIT=42, OFFSET=43, ROW=44, ROWS=45, FETCH=46, ONLY=47, UPDATE=48, 
		SHARE=49, OF=50, NOWAIT=51, INTO=52, STRICT=53, UNION=54, INTERSECT=55, 
		EXCEPT=56, ASC=57, DESC=58, USING=59, NULLS=60, FIRST=61, NEXT=62, LAST=63, 
		CAST=64, ALIAS=65, FOR=66, CREATE=67, REPLACE=68, FUNCTION=69, IN=70, 
		OUT=71, INOUT=72, VARIADIC=73, ON=74, HAVING=75, LANGUAGE=76, LANGUAGE_NAME=77, 
		DEFAULT=78, RETURNS=79, TABLE=80, AS=81, DECLARE=82, BEGIN=83, END=84, 
		WINDOW=85, IMMUTABLE=86, STABLE=87, VOLATILE=88, CALLED_ON_NULL_INPUT=89, 
		RETURNS_NULL_ON_NULL_INPUT=90, EXTERNAL=91, SECURITY=92, SECURITY_INVOKER=93, 
		SECURITY_DEFINER=94, COST=95, CONSTANT=96, COLLATE=97, NULL=98, TRUE=99, 
		FALSE=100, UNKNOWN=101, DOLLAR_QUOTE=102, QUOTE=103, STRING=104, INTEGER_VALUE=105, 
		DECIMAL_VALUE=106, ID=107, QNAME=108, ARRAY_TYPE=109, COPY_TYPE=110, ROW_TYPE=111, 
		SL_COMMENT=112, ML_COMMENT=113, WS=114;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'^'", "')'", "','", "'::'", "'['", "'('", "';'", "LIKE", "SIMILAR_OP", 
		"SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", "ISNULL", 
		"NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", "'<'", "'<='", 
		"'>'", "'>='", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", "GROUP_BY", 
		"GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", "ROWS", 
		"FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "WINDOW", 
		"IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", "COST", 
		"CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", "UNKNOWN", "DOLLAR_QUOTE", 
		"'''", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "ID", "QNAME", "ARRAY_TYPE", 
		"COPY_TYPE", "ROW_TYPE", "SL_COMMENT", "ML_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LIKE", 
		"SIMILAR_OP", "SIMILAR", "TO", "AND", "OR", "ASSIGN_OP", "BETWEEN", "IS", 
		"NOT", "ISNULL", "NOTNULL", "MUL", "DIV", "MOD", "ADD", "SUB", "EQ", "NEQ", 
		"LT", "LTE", "GT", "GTE", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", 
		"GROUP_BY", "GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", 
		"ROWS", "FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "WINDOW", 
		"IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", "COST", 
		"CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", "UNKNOWN", "DOLLAR_QUOTE", 
		"QUOTE", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "ID", "QNAME", "ARRAY_TYPE", 
		"COPY_TYPE", "ROW_TYPE", "SL_COMMENT", "ML_COMMENT", "WS", "EXPONENT", 
		"DIGIT"
	};


		public static final int COMMENTS_CHANNEL = 1;


	public PlPgSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlPgSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 111: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 112: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 113: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = COMMENTS_CHANNEL;  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = COMMENTS_CHANNEL;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2t\u03c1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n\u00fe"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\5\34\u014b\n\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3"+
		"K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3V\3"+
		"V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\5^\u02da\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3_\5_\u02e6\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d"+
		"\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3g\3g\5g\u0321\ng\3g\3g\3h"+
		"\3h\3i\3i\7i\u0329\ni\fi\16i\u032c\13i\3i\3i\3j\6j\u0331\nj\rj\16j\u0332"+
		"\3k\6k\u0336\nk\rk\16k\u0337\3k\3k\7k\u033c\nk\fk\16k\u033f\13k\3k\3k"+
		"\6k\u0343\nk\rk\16k\u0344\3k\6k\u0348\nk\rk\16k\u0349\3k\3k\7k\u034e\n"+
		"k\fk\16k\u0351\13k\5k\u0353\nk\3k\3k\3k\3k\6k\u0359\nk\rk\16k\u035a\3"+
		"k\3k\5k\u035f\nk\3l\3l\3l\7l\u0364\nl\fl\16l\u0367\13l\3m\3m\3m\3m\3n"+
		"\3n\5n\u036f\nn\3n\3n\6n\u0373\nn\rn\16n\u0374\3o\3o\5o\u0379\no\3o\3"+
		"o\5o\u037d\no\3o\3o\3o\3o\3o\3o\3p\3p\5p\u0387\np\3p\3p\3p\3p\3p\3p\3"+
		"p\3p\3p\3q\3q\3q\3q\7q\u0396\nq\fq\16q\u0399\13q\3q\5q\u039c\nq\3q\3q"+
		"\3q\3q\3r\3r\3r\3r\7r\u03a6\nr\fr\16r\u03a9\13r\3r\3r\3r\3r\3r\3s\6s\u03b1"+
		"\ns\rs\16s\u03b2\3s\3s\3t\3t\5t\u03b9\nt\3t\6t\u03bc\nt\rt\16t\u03bd\3"+
		"u\3u\5\u032a\u0397\u03a7v\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35"+
		"\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W"+
		"-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:"+
		"\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\u0085D\1\u0087E\1"+
		"\u0089F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093K\1\u0095L\1\u0097"+
		"M\1\u0099N\1\u009bO\1\u009dP\1\u009fQ\1\u00a1R\1\u00a3S\1\u00a5T\1\u00a7"+
		"U\1\u00a9V\1\u00abW\1\u00adX\1\u00afY\1\u00b1Z\1\u00b3[\1\u00b5\\\1\u00b7"+
		"]\1\u00b9^\1\u00bb_\1\u00bd`\1\u00bfa\1\u00c1b\1\u00c3c\1\u00c5d\1\u00c7"+
		"e\1\u00c9f\1\u00cbg\1\u00cdh\1\u00cfi\1\u00d1j\1\u00d3k\1\u00d5l\1\u00d7"+
		"m\1\u00d9n\1\u00dbo\1\u00ddp\1\u00dfq\1\u00e1r\2\u00e3s\3\u00e5t\4\u00e7"+
		"\2\1\u00e9\2\1\3\2\37\4\2KKkk\4\2NNnn\4\2MMmm\4\2GGgg\4\2UUuu\4\2OOoo"+
		"\5\2KK]]kk\4\2CCcc\4\2TTtt\4\2VVvv\4\2QQqq\4\2PPpp\4\2FFff\4\2DDdd\4\2"+
		"YYyy\4\2WWww\4\2EEee\4\2HHhh\4\2JJjj\4\2IIii\4\2RRrr\4\2[[{{\4\2ZZzz\4"+
		"\2XXxx\4\2SSss\5\2C\\aac|\5\2\13\f\17\17\"\"\4\2--//\3\2\62;\u03dc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\3\u00eb\3\2\2"+
		"\2\5\u00ed\3\2\2\2\7\u00ef\3\2\2\2\t\u00f1\3\2\2\2\13\u00f3\3\2\2\2\r"+
		"\u00f6\3\2\2\2\17\u00f8\3\2\2\2\21\u00fa\3\2\2\2\23\u00fd\3\2\2\2\25\u0104"+
		"\3\2\2\2\27\u0107\3\2\2\2\31\u010f\3\2\2\2\33\u0112\3\2\2\2\35\u0116\3"+
		"\2\2\2\37\u0119\3\2\2\2!\u011c\3\2\2\2#\u0124\3\2\2\2%\u0127\3\2\2\2\'"+
		"\u012b\3\2\2\2)\u0132\3\2\2\2+\u013a\3\2\2\2-\u013c\3\2\2\2/\u013e\3\2"+
		"\2\2\61\u0140\3\2\2\2\63\u0142\3\2\2\2\65\u0144\3\2\2\2\67\u014a\3\2\2"+
		"\29\u014c\3\2\2\2;\u014e\3\2\2\2=\u0151\3\2\2\2?\u0153\3\2\2\2A\u0156"+
		"\3\2\2\2C\u015d\3\2\2\2E\u0161\3\2\2\2G\u016a\3\2\2\2I\u016f\3\2\2\2K"+
		"\u0175\3\2\2\2M\u0178\3\2\2\2O\u017e\3\2\2\2Q\u0181\3\2\2\2S\u0184\3\2"+
		"\2\2U\u018a\3\2\2\2W\u0190\3\2\2\2Y\u0197\3\2\2\2[\u019b\3\2\2\2]\u019e"+
		"\3\2\2\2_\u01a4\3\2\2\2a\u01a9\3\2\2\2c\u01b0\3\2\2\2e\u01b6\3\2\2\2g"+
		"\u01b9\3\2\2\2i\u01c0\3\2\2\2k\u01c5\3\2\2\2m\u01cb\3\2\2\2o\u01d1\3\2"+
		"\2\2q\u01db\3\2\2\2s\u01e2\3\2\2\2u\u01e6\3\2\2\2w\u01eb\3\2\2\2y\u01f2"+
		"\3\2\2\2{\u01f8\3\2\2\2}\u01fe\3\2\2\2\177\u0203\3\2\2\2\u0081\u0208\3"+
		"\2\2\2\u0083\u020d\3\2\2\2\u0085\u0213\3\2\2\2\u0087\u0217\3\2\2\2\u0089"+
		"\u021e\3\2\2\2\u008b\u0226\3\2\2\2\u008d\u022f\3\2\2\2\u008f\u0232\3\2"+
		"\2\2\u0091\u0236\3\2\2\2\u0093\u023c\3\2\2\2\u0095\u0245\3\2\2\2\u0097"+
		"\u0248\3\2\2\2\u0099\u024f\3\2\2\2\u009b\u0258\3\2\2\2\u009d\u0260\3\2"+
		"\2\2\u009f\u0268\3\2\2\2\u00a1\u0270\3\2\2\2\u00a3\u0276\3\2\2\2\u00a5"+
		"\u0279\3\2\2\2\u00a7\u0281\3\2\2\2\u00a9\u0287\3\2\2\2\u00ab\u028b\3\2"+
		"\2\2\u00ad\u0292\3\2\2\2\u00af\u029c\3\2\2\2\u00b1\u02a3\3\2\2\2\u00b3"+
		"\u02ac\3\2\2\2\u00b5\u02bb\3\2\2\2\u00b7\u02c6\3\2\2\2\u00b9\u02cf\3\2"+
		"\2\2\u00bb\u02d9\3\2\2\2\u00bd\u02e5\3\2\2\2\u00bf\u02f0\3\2\2\2\u00c1"+
		"\u02f5\3\2\2\2\u00c3\u02fe\3\2\2\2\u00c5\u0306\3\2\2\2\u00c7\u030b\3\2"+
		"\2\2\u00c9\u0310\3\2\2\2\u00cb\u0316\3\2\2\2\u00cd\u031e\3\2\2\2\u00cf"+
		"\u0324\3\2\2\2\u00d1\u0326\3\2\2\2\u00d3\u0330\3\2\2\2\u00d5\u035e\3\2"+
		"\2\2\u00d7\u0360\3\2\2\2\u00d9\u0368\3\2\2\2\u00db\u036e\3\2\2\2\u00dd"+
		"\u0378\3\2\2\2\u00df\u0386\3\2\2\2\u00e1\u0391\3\2\2\2\u00e3\u03a1\3\2"+
		"\2\2\u00e5\u03b0\3\2\2\2\u00e7\u03b6\3\2\2\2\u00e9\u03bf\3\2\2\2\u00eb"+
		"\u00ec\7_\2\2\u00ec\4\3\2\2\2\u00ed\u00ee\7`\2\2\u00ee\6\3\2\2\2\u00ef"+
		"\u00f0\7+\2\2\u00f0\b\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2\n\3\2\2\2\u00f3"+
		"\u00f4\7<\2\2\u00f4\u00f5\7<\2\2\u00f5\f\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7"+
		"\16\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9\20\3\2\2\2\u00fa\u00fb\7=\2\2\u00fb"+
		"\22\3\2\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\t\3\2\2\u0100\u0101\t\2\2\2\u0101\u0102"+
		"\t\4\2\2\u0102\u0103\t\5\2\2\u0103\24\3\2\2\2\u0104\u0105\5\27\f\2\u0105"+
		"\u0106\5\31\r\2\u0106\26\3\2\2\2\u0107\u0108\t\6\2\2\u0108\u0109\t\2\2"+
		"\2\u0109\u010a\t\7\2\2\u010a\u010b\t\b\2\2\u010b\u010c\t\3\2\2\u010c\u010d"+
		"\t\t\2\2\u010d\u010e\t\n\2\2\u010e\30\3\2\2\2\u010f\u0110\t\13\2\2\u0110"+
		"\u0111\t\f\2\2\u0111\32\3\2\2\2\u0112\u0113\t\t\2\2\u0113\u0114\t\r\2"+
		"\2\u0114\u0115\t\16\2\2\u0115\34\3\2\2\2\u0116\u0117\t\f\2\2\u0117\u0118"+
		"\t\n\2\2\u0118\36\3\2\2\2\u0119\u011a\7<\2\2\u011a\u011b\7?\2\2\u011b"+
		" \3\2\2\2\u011c\u011d\t\17\2\2\u011d\u011e\t\5\2\2\u011e\u011f\t\13\2"+
		"\2\u011f\u0120\t\20\2\2\u0120\u0121\t\5\2\2\u0121\u0122\t\5\2\2\u0122"+
		"\u0123\t\r\2\2\u0123\"\3\2\2\2\u0124\u0125\t\2\2\2\u0125\u0126\t\6\2\2"+
		"\u0126$\3\2\2\2\u0127\u0128\t\r\2\2\u0128\u0129\t\f\2\2\u0129\u012a\t"+
		"\13\2\2\u012a&\3\2\2\2\u012b\u012c\t\2\2\2\u012c\u012d\t\6\2\2\u012d\u012e"+
		"\t\r\2\2\u012e\u012f\t\21\2\2\u012f\u0130\t\3\2\2\u0130\u0131\t\3\2\2"+
		"\u0131(\3\2\2\2\u0132\u0133\t\r\2\2\u0133\u0134\t\f\2\2\u0134\u0135\t"+
		"\13\2\2\u0135\u0136\t\r\2\2\u0136\u0137\t\21\2\2\u0137\u0138\t\3\2\2\u0138"+
		"\u0139\t\3\2\2\u0139*\3\2\2\2\u013a\u013b\7,\2\2\u013b,\3\2\2\2\u013c"+
		"\u013d\7\61\2\2\u013d.\3\2\2\2\u013e\u013f\7\'\2\2\u013f\60\3\2\2\2\u0140"+
		"\u0141\7-\2\2\u0141\62\3\2\2\2\u0142\u0143\7/\2\2\u0143\64\3\2\2\2\u0144"+
		"\u0145\7?\2\2\u0145\66\3\2\2\2\u0146\u0147\7>\2\2\u0147\u014b\7@\2\2\u0148"+
		"\u0149\7#\2\2\u0149\u014b\7?\2\2\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2"+
		"\2\u014b8\3\2\2\2\u014c\u014d\7>\2\2\u014d:\3\2\2\2\u014e\u014f\7>\2\2"+
		"\u014f\u0150\7?\2\2\u0150<\3\2\2\2\u0151\u0152\7@\2\2\u0152>\3\2\2\2\u0153"+
		"\u0154\7@\2\2\u0154\u0155\7?\2\2\u0155@\3\2\2\2\u0156\u0157\t\6\2\2\u0157"+
		"\u0158\t\5\2\2\u0158\u0159\t\3\2\2\u0159\u015a\t\5\2\2\u015a\u015b\t\22"+
		"\2\2\u015b\u015c\t\13\2\2\u015cB\3\2\2\2\u015d\u015e\t\t\2\2\u015e\u015f"+
		"\t\3\2\2\u015f\u0160\t\3\2\2\u0160D\3\2\2\2\u0161\u0162\t\16\2\2\u0162"+
		"\u0163\t\2\2\2\u0163\u0164\t\6\2\2\u0164\u0165\t\13\2\2\u0165\u0166\t"+
		"\2\2\2\u0166\u0167\t\r\2\2\u0167\u0168\t\22\2\2\u0168\u0169\t\13\2\2\u0169"+
		"F\3\2\2\2\u016a\u016b\t\23\2\2\u016b\u016c\t\n\2\2\u016c\u016d\t\f\2\2"+
		"\u016d\u016e\t\7\2\2\u016eH\3\2\2\2\u016f\u0170\t\20\2\2\u0170\u0171\t"+
		"\24\2\2\u0171\u0172\t\5\2\2\u0172\u0173\t\n\2\2\u0173\u0174\t\5\2\2\u0174"+
		"J\3\2\2\2\u0175\u0176\5M\'\2\u0176\u0177\5O(\2\u0177L\3\2\2\2\u0178\u0179"+
		"\t\25\2\2\u0179\u017a\t\n\2\2\u017a\u017b\t\f\2\2\u017b\u017c\t\21\2\2"+
		"\u017c\u017d\t\26\2\2\u017dN\3\2\2\2\u017e\u017f\t\17\2\2\u017f\u0180"+
		"\t\27\2\2\u0180P\3\2\2\2\u0181\u0182\5S*\2\u0182\u0183\5O(\2\u0183R\3"+
		"\2\2\2\u0184\u0185\t\f\2\2\u0185\u0186\t\n\2\2\u0186\u0187\t\16\2\2\u0187"+
		"\u0188\t\5\2\2\u0188\u0189\t\n\2\2\u0189T\3\2\2\2\u018a\u018b\t\3\2\2"+
		"\u018b\u018c\t\2\2\2\u018c\u018d\t\7\2\2\u018d\u018e\t\2\2\2\u018e\u018f"+
		"\t\13\2\2\u018fV\3\2\2\2\u0190\u0191\t\f\2\2\u0191\u0192\t\23\2\2\u0192"+
		"\u0193\t\23\2\2\u0193\u0194\t\6\2\2\u0194\u0195\t\5\2\2\u0195\u0196\t"+
		"\13\2\2\u0196X\3\2\2\2\u0197\u0198\t\n\2\2\u0198\u0199\t\f\2\2\u0199\u019a"+
		"\t\20\2\2\u019aZ\3\2\2\2\u019b\u019c\5Y-\2\u019c\u019d\t\6\2\2\u019d\\"+
		"\3\2\2\2\u019e\u019f\t\23\2\2\u019f\u01a0\t\5\2\2\u01a0\u01a1\t\13\2\2"+
		"\u01a1\u01a2\t\22\2\2\u01a2\u01a3\t\24\2\2\u01a3^\3\2\2\2\u01a4\u01a5"+
		"\t\f\2\2\u01a5\u01a6\t\r\2\2\u01a6\u01a7\t\3\2\2\u01a7\u01a8\t\27\2\2"+
		"\u01a8`\3\2\2\2\u01a9\u01aa\t\21\2\2\u01aa\u01ab\t\26\2\2\u01ab\u01ac"+
		"\t\16\2\2\u01ac\u01ad\t\t\2\2\u01ad\u01ae\t\13\2\2\u01ae\u01af\t\5\2\2"+
		"\u01afb\3\2\2\2\u01b0\u01b1\t\6\2\2\u01b1\u01b2\t\24\2\2\u01b2\u01b3\t"+
		"\t\2\2\u01b3\u01b4\t\n\2\2\u01b4\u01b5\t\5\2\2\u01b5d\3\2\2\2\u01b6\u01b7"+
		"\t\f\2\2\u01b7\u01b8\t\23\2\2\u01b8f\3\2\2\2\u01b9\u01ba\t\r\2\2\u01ba"+
		"\u01bb\t\f\2\2\u01bb\u01bc\t\20\2\2\u01bc\u01bd\t\t\2\2\u01bd\u01be\t"+
		"\2\2\2\u01be\u01bf\t\13\2\2\u01bfh\3\2\2\2\u01c0\u01c1\t\2\2\2\u01c1\u01c2"+
		"\t\r\2\2\u01c2\u01c3\t\13\2\2\u01c3\u01c4\t\f\2\2\u01c4j\3\2\2\2\u01c5"+
		"\u01c6\t\6\2\2\u01c6\u01c7\t\n\2\2\u01c7\u01c8\t\2\2\2\u01c8\u01c9\t\22"+
		"\2\2\u01c9\u01ca\t\13\2\2\u01cal\3\2\2\2\u01cb\u01cc\t\21\2\2\u01cc\u01cd"+
		"\t\r\2\2\u01cd\u01ce\t\2\2\2\u01ce\u01cf\t\f\2\2\u01cf\u01d0\t\r\2\2\u01d0"+
		"n\3\2\2\2\u01d1\u01d2\t\2\2\2\u01d2\u01d3\t\r\2\2\u01d3\u01d4\t\13\2\2"+
		"\u01d4\u01d5\t\5\2\2\u01d5\u01d6\t\n\2\2\u01d6\u01d7\t\6\2\2\u01d7\u01d8"+
		"\t\5\2\2\u01d8\u01d9\t\22\2\2\u01d9\u01da\t\13\2\2\u01dap\3\2\2\2\u01db"+
		"\u01dc\t\5\2\2\u01dc\u01dd\t\30\2\2\u01dd\u01de\t\22\2\2\u01de\u01df\t"+
		"\5\2\2\u01df\u01e0\t\26\2\2\u01e0\u01e1\t\13\2\2\u01e1r\3\2\2\2\u01e2"+
		"\u01e3\t\t\2\2\u01e3\u01e4\t\6\2\2\u01e4\u01e5\t\22\2\2\u01e5t\3\2\2\2"+
		"\u01e6\u01e7\t\16\2\2\u01e7\u01e8\t\5\2\2\u01e8\u01e9\t\6\2\2\u01e9\u01ea"+
		"\t\22\2\2\u01eav\3\2\2\2\u01eb\u01ec\t\21\2\2\u01ec\u01ed\t\6\2\2\u01ed"+
		"\u01ee\t\6\2\2\u01ee\u01ef\t\2\2\2\u01ef\u01f0\t\r\2\2\u01f0\u01f1\t\25"+
		"\2\2\u01f1x\3\2\2\2\u01f2\u01f3\t\r\2\2\u01f3\u01f4\t\21\2\2\u01f4\u01f5"+
		"\t\3\2\2\u01f5\u01f6\t\3\2\2\u01f6\u01f7\t\6\2\2\u01f7z\3\2\2\2\u01f8"+
		"\u01f9\t\23\2\2\u01f9\u01fa\t\2\2\2\u01fa\u01fb\t\n\2\2\u01fb\u01fc\t"+
		"\6\2\2\u01fc\u01fd\t\13\2\2\u01fd|\3\2\2\2\u01fe\u01ff\t\r\2\2\u01ff\u0200"+
		"\t\5\2\2\u0200\u0201\t\30\2\2\u0201\u0202\t\13\2\2\u0202~\3\2\2\2\u0203"+
		"\u0204\t\3\2\2\u0204\u0205\t\t\2\2\u0205\u0206\t\6\2\2\u0206\u0207\t\13"+
		"\2\2\u0207\u0080\3\2\2\2\u0208\u0209\t\22\2\2\u0209\u020a\t\t\2\2\u020a"+
		"\u020b\t\6\2\2\u020b\u020c\t\13\2\2\u020c\u0082\3\2\2\2\u020d\u020e\t"+
		"\t\2\2\u020e\u020f\t\3\2\2\u020f\u0210\t\2\2\2\u0210\u0211\t\t\2\2\u0211"+
		"\u0212\t\6\2\2\u0212\u0084\3\2\2\2\u0213\u0214\t\23\2\2\u0214\u0215\t"+
		"\f\2\2\u0215\u0216\t\n\2\2\u0216\u0086\3\2\2\2\u0217\u0218\t\22\2\2\u0218"+
		"\u0219\t\n\2\2\u0219\u021a\t\5\2\2\u021a\u021b\t\t\2\2\u021b\u021c\t\13"+
		"\2\2\u021c\u021d\t\5\2\2\u021d\u0088\3\2\2\2\u021e\u021f\t\n\2\2\u021f"+
		"\u0220\t\5\2\2\u0220\u0221\t\26\2\2\u0221\u0222\t\3\2\2\u0222\u0223\t"+
		"\t\2\2\u0223\u0224\t\22\2\2\u0224\u0225\t\5\2\2\u0225\u008a\3\2\2\2\u0226"+
		"\u0227\t\23\2\2\u0227\u0228\t\21\2\2\u0228\u0229\t\r\2\2\u0229\u022a\t"+
		"\22\2\2\u022a\u022b\t\13\2\2\u022b\u022c\t\2\2\2\u022c\u022d\t\f\2\2\u022d"+
		"\u022e\t\r\2\2\u022e\u008c\3\2\2\2\u022f\u0230\t\2\2\2\u0230\u0231\t\r"+
		"\2\2\u0231\u008e\3\2\2\2\u0232\u0233\t\f\2\2\u0233\u0234\t\21\2\2\u0234"+
		"\u0235\t\13\2\2\u0235\u0090\3\2\2\2\u0236\u0237\t\2\2\2\u0237\u0238\t"+
		"\r\2\2\u0238\u0239\t\f\2\2\u0239\u023a\t\21\2\2\u023a\u023b\t\13\2\2\u023b"+
		"\u0092\3\2\2\2\u023c\u023d\t\31\2\2\u023d\u023e\t\t\2\2\u023e\u023f\t"+
		"\n\2\2\u023f\u0240\t\2\2\2\u0240\u0241\t\t\2\2\u0241\u0242\t\16\2\2\u0242"+
		"\u0243\t\2\2\2\u0243\u0244\t\22\2\2\u0244\u0094\3\2\2\2\u0245\u0246\t"+
		"\f\2\2\u0246\u0247\t\r\2\2\u0247\u0096\3\2\2\2\u0248\u0249\t\24\2\2\u0249"+
		"\u024a\t\t\2\2\u024a\u024b\t\31\2\2\u024b\u024c\t\2\2\2\u024c\u024d\t"+
		"\r\2\2\u024d\u024e\t\25\2\2\u024e\u0098\3\2\2\2\u024f\u0250\t\3\2\2\u0250"+
		"\u0251\t\t\2\2\u0251\u0252\t\r\2\2\u0252\u0253\t\25\2\2\u0253\u0254\t"+
		"\21\2\2\u0254\u0255\t\t\2\2\u0255\u0256\t\25\2\2\u0256\u0257\t\5\2\2\u0257"+
		"\u009a\3\2\2\2\u0258\u0259\t\26\2\2\u0259\u025a\t\3\2\2\u025a\u025b\t"+
		"\26\2\2\u025b\u025c\t\25\2\2\u025c\u025d\t\6\2\2\u025d\u025e\t\32\2\2"+
		"\u025e\u025f\t\3\2\2\u025f\u009c\3\2\2\2\u0260\u0261\t\16\2\2\u0261\u0262"+
		"\t\5\2\2\u0262\u0263\t\23\2\2\u0263\u0264\t\t\2\2\u0264\u0265\t\21\2\2"+
		"\u0265\u0266\t\3\2\2\u0266\u0267\t\13\2\2\u0267\u009e\3\2\2\2\u0268\u0269"+
		"\t\n\2\2\u0269\u026a\t\5\2\2\u026a\u026b\t\13\2\2\u026b\u026c\t\21\2\2"+
		"\u026c\u026d\t\n\2\2\u026d\u026e\t\r\2\2\u026e\u026f\t\6\2\2\u026f\u00a0"+
		"\3\2\2\2\u0270\u0271\t\13\2\2\u0271\u0272\t\t\2\2\u0272\u0273\t\17\2\2"+
		"\u0273\u0274\t\3\2\2\u0274\u0275\t\5\2\2\u0275\u00a2\3\2\2\2\u0276\u0277"+
		"\t\t\2\2\u0277\u0278\t\6\2\2\u0278\u00a4\3\2\2\2\u0279\u027a\t\16\2\2"+
		"\u027a\u027b\t\5\2\2\u027b\u027c\t\22\2\2\u027c\u027d\t\3\2\2\u027d\u027e"+
		"\t\t\2\2\u027e\u027f\t\n\2\2\u027f\u0280\t\5\2\2\u0280\u00a6\3\2\2\2\u0281"+
		"\u0282\t\17\2\2\u0282\u0283\t\5\2\2\u0283\u0284\t\25\2\2\u0284\u0285\t"+
		"\2\2\2\u0285\u0286\t\r\2\2\u0286\u00a8\3\2\2\2\u0287\u0288\t\5\2\2\u0288"+
		"\u0289\t\r\2\2\u0289\u028a\t\16\2\2\u028a\u00aa\3\2\2\2\u028b\u028c\t"+
		"\20\2\2\u028c\u028d\t\2\2\2\u028d\u028e\t\r\2\2\u028e\u028f\t\16\2\2\u028f"+
		"\u0290\t\f\2\2\u0290\u0291\t\20\2\2\u0291\u00ac\3\2\2\2\u0292\u0293\t"+
		"\2\2\2\u0293\u0294\t\7\2\2\u0294\u0295\t\7\2\2\u0295\u0296\t\21\2\2\u0296"+
		"\u0297\t\13\2\2\u0297\u0298\t\t\2\2\u0298\u0299\t\17\2\2\u0299\u029a\t"+
		"\3\2\2\u029a\u029b\t\5\2\2\u029b\u00ae\3\2\2\2\u029c\u029d\t\6\2\2\u029d"+
		"\u029e\t\13\2\2\u029e\u029f\t\t\2\2\u029f\u02a0\t\17\2\2\u02a0\u02a1\t"+
		"\3\2\2\u02a1\u02a2\t\5\2\2\u02a2\u00b0\3\2\2\2\u02a3\u02a4\t\31\2\2\u02a4"+
		"\u02a5\t\f\2\2\u02a5\u02a6\t\3\2\2\u02a6\u02a7\t\t\2\2\u02a7\u02a8\t\13"+
		"\2\2\u02a8\u02a9\t\2\2\2\u02a9\u02aa\t\3\2\2\u02aa\u02ab\t\5\2\2\u02ab"+
		"\u00b2\3\2\2\2\u02ac\u02ad\t\22\2\2\u02ad\u02ae\t\t\2\2\u02ae\u02af\t"+
		"\3\2\2\u02af\u02b0\t\3\2\2\u02b0\u02b1\t\5\2\2\u02b1\u02b2\t\16\2\2\u02b2"+
		"\u02b3\t\f\2\2\u02b3\u02b4\t\r\2\2\u02b4\u02b5\5\u00c5c\2\u02b5\u02b6"+
		"\t\2\2\2\u02b6\u02b7\t\r\2\2\u02b7\u02b8\t\26\2\2\u02b8\u02b9\t\21\2\2"+
		"\u02b9\u02ba\t\13\2\2\u02ba\u00b4\3\2\2\2\u02bb\u02bc\5\u009fP\2\u02bc"+
		"\u02bd\5\u00c5c\2\u02bd\u02be\t\f\2\2\u02be\u02bf\t\r\2\2\u02bf\u02c0"+
		"\5\u00c5c\2\u02c0\u02c1\t\2\2\2\u02c1\u02c2\t\r\2\2\u02c2\u02c3\t\26\2"+
		"\2\u02c3\u02c4\t\21\2\2\u02c4\u02c5\t\13\2\2\u02c5\u00b6\3\2\2\2\u02c6"+
		"\u02c7\t\5\2\2\u02c7\u02c8\t\30\2\2\u02c8\u02c9\t\13\2\2\u02c9\u02ca\t"+
		"\5\2\2\u02ca\u02cb\t\n\2\2\u02cb\u02cc\t\r\2\2\u02cc\u02cd\t\t\2\2\u02cd"+
		"\u02ce\t\3\2\2\u02ce\u00b8\3\2\2\2\u02cf\u02d0\t\6\2\2\u02d0\u02d1\t\5"+
		"\2\2\u02d1\u02d2\t\22\2\2\u02d2\u02d3\t\21\2\2\u02d3\u02d4\t\n\2\2\u02d4"+
		"\u02d5\t\2\2\2\u02d5\u02d6\t\13\2\2\u02d6\u02d7\t\27\2\2\u02d7\u00ba\3"+
		"\2\2\2\u02d8\u02da\5\u00b7\\\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2"+
		"\u02da\u02db\3\2\2\2\u02db\u02dc\5\u00b9]\2\u02dc\u02dd\t\2\2\2\u02dd"+
		"\u02de\t\r\2\2\u02de\u02df\t\31\2\2\u02df\u02e0\t\f\2\2\u02e0\u02e1\t"+
		"\4\2\2\u02e1\u02e2\t\5\2\2\u02e2\u02e3\t\n\2\2\u02e3\u00bc\3\2\2\2\u02e4"+
		"\u02e6\5\u00b7\\\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e8\5\u00b9]\2\u02e8\u02e9\t\16\2\2\u02e9\u02ea\t\5\2"+
		"\2\u02ea\u02eb\t\23\2\2\u02eb\u02ec\t\2\2\2\u02ec\u02ed\t\r\2\2\u02ed"+
		"\u02ee\t\5\2\2\u02ee\u02ef\t\n\2\2\u02ef\u00be\3\2\2\2\u02f0\u02f1\t\22"+
		"\2\2\u02f1\u02f2\t\f\2\2\u02f2\u02f3\t\6\2\2\u02f3\u02f4\t\13\2\2\u02f4"+
		"\u00c0\3\2\2\2\u02f5\u02f6\t\22\2\2\u02f6\u02f7\t\f\2\2\u02f7\u02f8\t"+
		"\r\2\2\u02f8\u02f9\t\6\2\2\u02f9\u02fa\t\13\2\2\u02fa\u02fb\t\t\2\2\u02fb"+
		"\u02fc\t\r\2\2\u02fc\u02fd\t\13\2\2\u02fd\u00c2\3\2\2\2\u02fe\u02ff\t"+
		"\22\2\2\u02ff\u0300\t\f\2\2\u0300\u0301\t\3\2\2\u0301\u0302\t\3\2\2\u0302"+
		"\u0303\t\t\2\2\u0303\u0304\t\13\2\2\u0304\u0305\t\5\2\2\u0305\u00c4\3"+
		"\2\2\2\u0306\u0307\t\r\2\2\u0307\u0308\t\21\2\2\u0308\u0309\t\3\2\2\u0309"+
		"\u030a\t\3\2\2\u030a\u00c6\3\2\2\2\u030b\u030c\t\13\2\2\u030c\u030d\t"+
		"\n\2\2\u030d\u030e\t\21\2\2\u030e\u030f\t\5\2\2\u030f\u00c8\3\2\2\2\u0310"+
		"\u0311\t\23\2\2\u0311\u0312\t\t\2\2\u0312\u0313\t\3\2\2\u0313\u0314\t"+
		"\6\2\2\u0314\u0315\t\5\2\2\u0315\u00ca\3\2\2\2\u0316\u0317\t\21\2\2\u0317"+
		"\u0318\t\r\2\2\u0318\u0319\t\4\2\2\u0319\u031a\t\r\2\2\u031a\u031b\t\f"+
		"\2\2\u031b\u031c\t\20\2\2\u031c\u031d\t\r\2\2\u031d\u00cc\3\2\2\2\u031e"+
		"\u0320\7&\2\2\u031f\u0321\5\u00d7l\2\u0320\u031f\3\2\2\2\u0320\u0321\3"+
		"\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\7&\2\2\u0323\u00ce\3\2\2\2\u0324"+
		"\u0325\7)\2\2\u0325\u00d0\3\2\2\2\u0326\u032a\5\u00cfh\2\u0327\u0329\13"+
		"\2\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u032b\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\5\u00cf"+
		"h\2\u032e\u00d2\3\2\2\2\u032f\u0331\5\u00e9u\2\u0330\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u00d4\3\2"+
		"\2\2\u0334\u0336\5\u00e9u\2\u0335\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033d\7\60"+
		"\2\2\u033a\u033c\5\u00e9u\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u035f\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0342\7\60\2\2\u0341\u0343\5\u00e9u\2\u0342\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u035f\3\2"+
		"\2\2\u0346\u0348\5\u00e9u\2\u0347\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0352\3\2\2\2\u034b\u034f\7\60"+
		"\2\2\u034c\u034e\5\u00e9u\2\u034d\u034c\3\2\2\2\u034e\u0351\3\2\2\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2"+
		"\2\2\u0352\u034b\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\5\u00e7t\2\u0355\u035f\3\2\2\2\u0356\u0358\7\60\2\2\u0357\u0359"+
		"\5\u00e9u\2\u0358\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u0358\3\2\2"+
		"\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\5\u00e7t\2\u035d"+
		"\u035f\3\2\2\2\u035e\u0335\3\2\2\2\u035e\u0340\3\2\2\2\u035e\u0347\3\2"+
		"\2\2\u035e\u0356\3\2\2\2\u035f\u00d6\3\2\2\2\u0360\u0365\t\33\2\2\u0361"+
		"\u0364\t\33\2\2\u0362\u0364\5\u00e9u\2\u0363\u0361\3\2\2\2\u0363\u0362"+
		"\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u00d8\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5\u00d7l\2\u0369\u036a"+
		"\7\60\2\2\u036a\u036b\5\u00d7l\2\u036b\u00da\3\2\2\2\u036c\u036f\5\u00d7"+
		"l\2\u036d\u036f\5\u00d9m\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036f"+
		"\u0372\3\2\2\2\u0370\u0371\7]\2\2\u0371\u0373\7_\2\2\u0372\u0370\3\2\2"+
		"\2\u0373\u0374\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u00dc"+
		"\3\2\2\2\u0376\u0379\5\u00d7l\2\u0377\u0379\5\u00d9m\2\u0378\u0376\3\2"+
		"\2\2\u0378\u0377\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u037b\7\60\2\2\u037b"+
		"\u037d\5\u00d7l\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u037f\7\'\2\2\u037f\u0380\7V\2\2\u0380\u0381\7[\2\2\u0381"+
		"\u0382\7R\2\2\u0382\u0383\7G\2\2\u0383\u00de\3\2\2\2\u0384\u0387\5\u00d7"+
		"l\2\u0385\u0387\5\u00d9m\2\u0386\u0384\3\2\2\2\u0386\u0385\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u0389\7\'\2\2\u0389\u038a\7T\2\2\u038a\u038b\7Q\2"+
		"\2\u038b\u038c\7Y\2\2\u038c\u038d\7V\2\2\u038d\u038e\7[\2\2\u038e\u038f"+
		"\7R\2\2\u038f\u0390\7G\2\2\u0390\u00e0\3\2\2\2\u0391\u0392\7/\2\2\u0392"+
		"\u0393\7/\2\2\u0393\u0397\3\2\2\2\u0394\u0396\13\2\2\2\u0395\u0394\3\2"+
		"\2\2\u0396\u0399\3\2\2\2\u0397\u0398\3\2\2\2\u0397\u0395\3\2\2\2\u0398"+
		"\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039c\7\17\2\2\u039b\u039a\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\7\f\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\bq\2\2\u03a0\u00e2\3\2\2\2\u03a1\u03a2\7\61"+
		"\2\2\u03a2\u03a3\7,\2\2\u03a3\u03a7\3\2\2\2\u03a4\u03a6\13\2\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a7\u03a5\3\2"+
		"\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7,\2\2\u03ab"+
		"\u03ac\7\61\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\br\3\2\u03ae\u00e4\3\2"+
		"\2\2\u03af\u03b1\t\34\2\2\u03b0\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\bs"+
		"\4\2\u03b5\u00e6\3\2\2\2\u03b6\u03b8\7G\2\2\u03b7\u03b9\t\35\2\2\u03b8"+
		"\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03bc\5\u00e9"+
		"u\2\u03bb\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u00e8\3\2\2\2\u03bf\u03c0\t\36\2\2\u03c0\u00ea\3"+
		"\2\2\2\37\2\u00fd\u014a\u02d9\u02e5\u0320\u032a\u0332\u0337\u033d\u0344"+
		"\u0349\u034f\u0352\u035a\u035e\u0363\u0365\u036e\u0374\u0378\u037c\u0386"+
		"\u0397\u039b\u03a7\u03b2\u03b8\u03bd";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}