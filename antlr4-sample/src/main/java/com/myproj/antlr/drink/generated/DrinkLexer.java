// Generated from Drink.g4 by ANTLR 4.5.3
package com.myproj.antlr.drink.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrinkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, OF=2, IN=3, DRINKING_VESSEL=4, TEXT=5, WHITESPACE=6, LOCATION=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARTICLE", "OF", "IN", "DRINKING_VESSEL", "TEXT", "WHITESPACE", "LOCATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'of'", "'in'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARTICLE", "OF", "IN", "DRINKING_VESSEL", "TEXT", "WHITESPACE", 
		"LOCATION"
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


	public DrinkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Drink.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\6\6\66\n\6\r"+
		"\6\16\6\67\3\7\6\7;\n\7\r\7\16\7<\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\2\2"+
		"\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\3\5\2\13\f\16\17\"\"M\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\34\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2"+
		"\r:\3\2\2\2\17@\3\2\2\2\21\22\7v\2\2\22\23\7j\2\2\23\30\7g\2\2\24\25\7"+
		"c\2\2\25\30\7p\2\2\26\30\7c\2\2\27\21\3\2\2\2\27\24\3\2\2\2\27\26\3\2"+
		"\2\2\30\4\3\2\2\2\31\32\7q\2\2\32\33\7h\2\2\33\6\3\2\2\2\34\35\7k\2\2"+
		"\35\36\7p\2\2\36\b\3\2\2\2\37 \7e\2\2 !\7w\2\2!\63\7r\2\2\"#\7r\2\2#$"+
		"\7k\2\2$%\7p\2\2%\63\7v\2\2&\'\7u\2\2\'(\7j\2\2()\7q\2\2)\63\7v\2\2*+"+
		"\7o\2\2+,\7w\2\2,\63\7i\2\2-.\7i\2\2./\7n\2\2/\60\7c\2\2\60\61\7u\2\2"+
		"\61\63\7u\2\2\62\37\3\2\2\2\62\"\3\2\2\2\62&\3\2\2\2\62*\3\2\2\2\62-\3"+
		"\2\2\2\63\n\3\2\2\2\64\66\4c|\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\f\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=>\3\2\2\2>?\b\7\2\2?\16\3\2\2\2@A\7K\2\2AB\7p\2\2BC\7f\2\2CD"+
		"\7k\2\2DE\7c\2\2E\20\3\2\2\2\7\2\27\62\67<\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}