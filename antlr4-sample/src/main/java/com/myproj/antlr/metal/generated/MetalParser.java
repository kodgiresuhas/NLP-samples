// Generated from Metal.g4 by ANTLR 4.5.3
package com.myproj.antlr.metal.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MONTH=1, PRICE=2, STRDL=3, VS=4, CALLPUT=5, X=6, FUTOPT=7, DEC_COL_DEC=8, 
		RATIO=9, SLASH=10, INT=11, OFFER=12, D=13, DAYS=14, WHITESPACE=15;
	public static final int
		RULE_metalSentence = 0, RULE_metal = 1, RULE_strdl = 2;
	public static final String[] ruleNames = {
		"metalSentence", "metal", "strdl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'strdl'", "'vs'", null, "'x'", null, null, "'ratio'", 
		"'/'", "'int'", "'offer'", "'d'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MONTH", "PRICE", "STRDL", "VS", "CALLPUT", "X", "FUTOPT", "DEC_COL_DEC", 
		"RATIO", "SLASH", "INT", "OFFER", "D", "DAYS", "WHITESPACE"
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
	public String getGrammarFileName() { return "Metal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MetalSentenceContext extends ParserRuleContext {
		public MetalContext metal() {
			return getRuleContext(MetalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MetalParser.EOF, 0); }
		public MetalSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metalSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).enterMetalSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).exitMetalSentence(this);
		}
	}

	public final MetalSentenceContext metalSentence() throws RecognitionException {
		MetalSentenceContext _localctx = new MetalSentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_metalSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			metal();
			setState(7);
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

	public static class MetalContext extends ParserRuleContext {
		public StrdlContext strdl() {
			return getRuleContext(StrdlContext.class,0);
		}
		public MetalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).enterMetal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).exitMetal(this);
		}
	}

	public final MetalContext metal() throws RecognitionException {
		MetalContext _localctx = new MetalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_metal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(9);
			strdl();
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

	public static class StrdlContext extends ParserRuleContext {
		public TerminalNode MONTH() { return getToken(MetalParser.MONTH, 0); }
		public List<TerminalNode> PRICE() { return getTokens(MetalParser.PRICE); }
		public TerminalNode PRICE(int i) {
			return getToken(MetalParser.PRICE, i);
		}
		public TerminalNode STRDL() { return getToken(MetalParser.STRDL, 0); }
		public TerminalNode VS() { return getToken(MetalParser.VS, 0); }
		public TerminalNode CALLPUT() { return getToken(MetalParser.CALLPUT, 0); }
		public TerminalNode X() { return getToken(MetalParser.X, 0); }
		public TerminalNode FUTOPT() { return getToken(MetalParser.FUTOPT, 0); }
		public TerminalNode DEC_COL_DEC() { return getToken(MetalParser.DEC_COL_DEC, 0); }
		public TerminalNode SLASH() { return getToken(MetalParser.SLASH, 0); }
		public TerminalNode INT() { return getToken(MetalParser.INT, 0); }
		public TerminalNode OFFER() { return getToken(MetalParser.OFFER, 0); }
		public TerminalNode RATIO() { return getToken(MetalParser.RATIO, 0); }
		public TerminalNode DAYS() { return getToken(MetalParser.DAYS, 0); }
		public StrdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strdl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).enterStrdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetalListener ) ((MetalListener)listener).exitStrdl(this);
		}
	}

	public final StrdlContext strdl() throws RecognitionException {
		StrdlContext _localctx = new StrdlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_strdl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(MONTH);
			setState(12);
			match(PRICE);
			setState(13);
			match(STRDL);
			setState(14);
			match(VS);
			setState(15);
			match(PRICE);
			setState(16);
			match(CALLPUT);
			setState(17);
			match(X);
			setState(18);
			match(PRICE);
			setState(19);
			match(FUTOPT);
			setState(20);
			match(DEC_COL_DEC);
			setState(22);
			_la = _input.LA(1);
			if (_la==RATIO) {
				{
				setState(21);
				match(RATIO);
				}
			}

			setState(24);
			match(PRICE);
			setState(25);
			match(SLASH);
			setState(26);
			match(PRICE);
			setState(27);
			match(INT);
			setState(28);
			match(OFFER);
			setState(30);
			_la = _input.LA(1);
			if (_la==DAYS) {
				{
				setState(29);
				match(DAYS);
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\31\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\4\2\2\5\2\4\6\2\2!"+
		"\2\b\3\2\2\2\4\13\3\2\2\2\6\r\3\2\2\2\b\t\5\4\3\2\t\n\7\2\2\3\n\3\3\2"+
		"\2\2\13\f\5\6\4\2\f\5\3\2\2\2\r\16\7\3\2\2\16\17\7\4\2\2\17\20\7\5\2\2"+
		"\20\21\7\6\2\2\21\22\7\4\2\2\22\23\7\7\2\2\23\24\7\b\2\2\24\25\7\4\2\2"+
		"\25\26\7\t\2\2\26\30\7\n\2\2\27\31\7\13\2\2\30\27\3\2\2\2\30\31\3\2\2"+
		"\2\31\32\3\2\2\2\32\33\7\4\2\2\33\34\7\f\2\2\34\35\7\4\2\2\35\36\7\r\2"+
		"\2\36 \7\16\2\2\37!\7\20\2\2 \37\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\4\30 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}