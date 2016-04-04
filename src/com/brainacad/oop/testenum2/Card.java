package com.brainacad.oop.testenum2;

/**
 * Created by Yuriy on 04.04.2016.
 */
public class Card {
    private Main.Rank cardRank;
    private Main.Suit cardSuit;

    public Card(Main.Rank cardRank, Main.Suit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return "The Card: "+
                cardRank +
                "_"+
                cardSuit;
    }
}
