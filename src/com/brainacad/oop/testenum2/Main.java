package com.brainacad.oop.testenum2;

/**
 * Created by Yuriy on 04.04.2016.
 */
public class Main {
    public enum Suit {
        SPADE,
        DIAMOND,
        CLUB,
        HEART
    }

    public enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }


    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int count = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[count] = new Card(rank, suit);
                System.out.println(cards[count]);
                count++;
            }
        }
    }
}