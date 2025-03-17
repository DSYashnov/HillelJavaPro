package com.hillel.blackjack.service;

import com.hillel.blackjack.exception.CardDeckEmptyException;
import com.hillel.blackjack.exception.CardDeckTotalException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckServiceTest {

    @Test
    void createDeck() {
        CardDeckService cds = new CardDeckService();
        cds.createDeck(1);
        assertEquals(52, cds.getTotalCardCount());
    }

    @Test
    void createEightDeck() {
        CardDeckService cds = new CardDeckService();
        cds.createDeck(8);
        assertEquals(8 * 52, cds.getTotalCardCount());
    }

    @Test
    void createZeroDeckException() {
        CardDeckService cds = new CardDeckService();
        CardDeckTotalException cardDeckTotalException = assertThrows(CardDeckTotalException.class,
                () -> cds.createDeck(0));
        assertEquals("Number of deck must be between 1 to 8", cardDeckTotalException.getMessage());
    }

    @Test
    void createNineDeckException() {
        CardDeckService cds = new CardDeckService();
        CardDeckTotalException cardDeckTotalException = assertThrows(CardDeckTotalException.class,
                () -> cds.createDeck(9));
        assertEquals("Number of deck must be between 1 to 8", cardDeckTotalException.getMessage());
    }


    @Test
    void getCard() {
        CardDeckService cds = new CardDeckService();
        cds.createDeck(1);
        assertEquals(52, cds.getTotalCardCount());
        cds.getCard();
        assertEquals(51, cds.getTotalCardCount());
    }
    @Test
    void createEmptyDeckException() {
        CardDeckService cds = new CardDeckService();
        CardDeckEmptyException cardDeckEmptyException = assertThrows(CardDeckEmptyException.class,
                () -> cds.getCard());
        assertEquals("No available card...", cardDeckEmptyException.getMessage());
    }

}