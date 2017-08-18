package com.meirapentermann.cards;

public class Deck {
	int[] values = new int[13]; //optionally change values of enums;
	
	public Deck () {
		
	}
	
	public Deck(int[] values) {
		this();
		this.values = values;
	}

}
