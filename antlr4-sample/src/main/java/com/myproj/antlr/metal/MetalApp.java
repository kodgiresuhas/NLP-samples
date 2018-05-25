package com.myproj.antlr.metal;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.myproj.antlr.metal.generated.MetalLexer;
import com.myproj.antlr.metal.generated.MetalParser;
import com.myproj.antlr.metal.generated.MetalParser.MetalContext;

public class MetalApp {

	public static void main(String[] args) {
		MetalApp metalApp = new MetalApp();
		metalApp.printMetal("Aug 1234 strdl vs 1234 call x 1234 fut 1:1.5 ratio 112.5/$115.5 int offer 45 d");
		metalApp.printMetal("Aug 1234 strdl vs 1234 call x 1234 fut 1:1.5 112.5/$115.5 int offer");
	}

	private void printMetal(String MetalSentence) {
		// Get our lexer
		MetalLexer lexer = new MetalLexer(new ANTLRInputStream(MetalSentence));

		// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Pass the tokens to the parser
		MetalParser parser = new MetalParser(tokens);

		// Specify our entry point
		MetalContext MetalSentenceContext = parser.metal();

		// Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrMetalListener listener = new AntlrMetalListener();
		walker.walk(listener, MetalSentenceContext);
	}
}
