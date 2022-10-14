package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class HandDisplayTest {

    @Test
    void diplayFaceUpCardsInHand(){
        List<Card> cards = List.of(new Card(Suit.HEARTS, Rank.ACE), new Card(Suit.SPADES, Rank.KING));
        Hand hand = new Hand(cards);
        assertThat(ConsoleHand.displayFaceUpCard(hand)).isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }

    @Test
    void displayCardAsString(){
        List<Card> cards = List.of(new Card(Suit.HEARTS, Rank.ACE), new Card(Suit.SPADES, Rank.KING));
        Hand hand = new Hand(cards);
        assertThat(ConsoleHand.cardAsString(hand)).isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│K        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        K│[1B[11D└─────────┘");
    }
}
