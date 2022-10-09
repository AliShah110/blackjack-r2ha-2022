package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardDisplayTest {

    @Test
    void displayTensAsString(){
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertThat(ConsoleCard.display(card)).isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│10       │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│       10│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    void displayNonTenAsString(){
        Card card = new Card(Suit.HEARTS, Rank.FIVE);
        assertThat(ConsoleCard.display(card)).isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│5        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        5│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    void displayKingAsString(){
        Card card = new Card(Suit.HEARTS, Rank.KING);
        assertThat(ConsoleCard.display(card)).isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│K        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        K│\u001B[1B\u001B[11D└─────────┘");
    }
}
