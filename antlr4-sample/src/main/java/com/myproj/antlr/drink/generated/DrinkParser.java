// Generated from Drink.g4 by ANTLR 4.5.3
package com.myproj.antlr.drink.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrinkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICLE=1, OF=2, IN=3, DRINKING_VESSEL=4, TEXT=5, WHITESPACE=6, LOCATION=7;
	public static final int
		RULE_drinkSentence = 0, RULE_drink = 1, RULE_location = 2;
	public static final String[] ruleNames = {
		"drinkSentence", "drink", "location"
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

	@Override
	public String getGrammarFileName() { return "Drink.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrinkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DrinkSentenceContext extends ParserRuleContext {
		public TerminalNode DRINKING_VESSEL() { return getToken(DrinkParser.DRINKING_VESSEL, 0); }
		public TerminalNode OF() { return getToken(DrinkParser.OF, 0); }
		public DrinkContext drink() {
			return getRuleContext(DrinkContext.class,0);
		}
		public TerminalNode IN() { return getToken(DrinkParser.IN, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ARTICLE() { return getToken(DrinkParser.ARTICLE, 0); }
		public DrinkSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drinkSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterDrinkSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitDrinkSentence(this);
		}
	}

	public final DrinkSentenceContext drinkSentence() throws RecognitionException {
		DrinkSentenceContext _localctx = new DrinkSentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_drinkSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_la = _input.LA(1);
			if (_la==ARTICLE) {
				{
				setState(6);
				match(ARTICLE);
				}
			}

			setState(9);
			match(DRINKING_VESSEL);
			setState(10);
			match(OF);
			setState(11);
			drink();
			setState(12);
			match(IN);
			setState(13);
			location();
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

	public static class DrinkContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DrinkParser.TEXT, 0); }
		public DrinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterDrink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitDrink(this);
		}
	}

	public final DrinkContext drink() throws RecognitionException {
		DrinkContext _localctx = new DrinkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_drink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(TEXT);
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
		public TerminalNode LOCATION() { return getToken(DrinkParser.LOCATION, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrinkListener ) ((DrinkListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(LOCATION);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\26\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\5\2\n\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\2\2\5\2\4\6\2\2\23\2\t\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\n\7\3\2\2"+
		"\t\b\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\6\2\2\f\r\7\4\2\2\r\16\5"+
		"\4\3\2\16\17\7\5\2\2\17\20\5\6\4\2\20\3\3\2\2\2\21\22\7\7\2\2\22\5\3\2"+
		"\2\2\23\24\7\t\2\2\24\7\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}