package com.myproj.antlr.drink;

import com.myproj.antlr.drink.generated.DrinkBaseListener;
import com.myproj.antlr.drink.generated.DrinkParser.DrinkContext;
import com.myproj.antlr.drink.generated.DrinkParser.DrinkSentenceContext;
import com.myproj.antlr.drink.generated.DrinkParser.LocationContext;

public class AntlrDrinkListener extends DrinkBaseListener {

	@Override
	public void enterDrink(DrinkContext ctx) {
		System.out.println(ctx.getText());
	}

	@Override
	public void enterDrinkSentence(DrinkSentenceContext ctx) {
		System.out.println(ctx.getText());
		super.enterDrinkSentence(ctx);
	}

	@Override
	public void enterLocation(LocationContext ctx) {
		System.out.println(ctx.getText());
		super.enterLocation(ctx);
	}
}