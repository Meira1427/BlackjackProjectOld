package com.meirapentermann.cards;

public enum Suit {
	  HEARTS("Hearts", 	'\u2665') 		//try also 2661
	, SPADES("Spades", 	'\u2660') 		//try also 2664
	, CLUBS("Clubs", 	'\u2663') 		//try also 2667
	, DIAMONDS("Diamonds", '\u2666'); 	//try also 2662
	
	public String displayText;
	public char displayChar;
	
	private Suit(String s, char c) {
		this.displayText = s;
		this.displayChar = c;
	}

	public String getDisplayText() {
		return displayText;
	}

	public char getDisplayChar() {
		return displayChar;
	}

}
