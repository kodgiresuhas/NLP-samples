// Generated from Metal.g4 by ANTLR 4.5.3
package com.myproj.antlr.metal.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetalParser}.
 */
public interface MetalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetalParser#metalSentence}.
	 * @param ctx the parse tree
	 */
	void enterMetalSentence(MetalParser.MetalSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetalParser#metalSentence}.
	 * @param ctx the parse tree
	 */
	void exitMetalSentence(MetalParser.MetalSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetalParser#metal}.
	 * @param ctx the parse tree
	 */
	void enterMetal(MetalParser.MetalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetalParser#metal}.
	 * @param ctx the parse tree
	 */
	void exitMetal(MetalParser.MetalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetalParser#strdl}.
	 * @param ctx the parse tree
	 */
	void enterStrdl(MetalParser.StrdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetalParser#strdl}.
	 * @param ctx the parse tree
	 */
	void exitStrdl(MetalParser.StrdlContext ctx);
}