package com.myproj.antlr.metal;

import com.myproj.antlr.metal.generated.MetalBaseListener;
import com.myproj.antlr.metal.generated.MetalParser.MetalContext;
import com.myproj.antlr.metal.generated.MetalParser.MetalSentenceContext;

public class AntlrMetalListener extends MetalBaseListener {

	@Override
	public void enterMetal(MetalContext ctx) {
		System.out.println(ctx.getText());
	}

	@Override
	public void enterMetalSentence(MetalSentenceContext ctx) {
		System.out.println(ctx.getText());
		super.enterMetalSentence(ctx);
	}
}