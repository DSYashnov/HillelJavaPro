package com.hillel.blackjack.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    public Player(String name, int numberOfGames, Integer startAmount) {
        this.name = name;
        this.startAmount = startAmount;
        this.numberOfGames = numberOfGames;
        this.amount = startAmount;
    }

    private String name;
    private int numberOfGames;
    private int numberOfWins;
    private Integer amount;
    private Integer startAmount;

    public void incrementNumberOfGames () {
        numberOfGames++;
    }
    public void incrementNumberOfWinGames(){
        numberOfWins++;
    }
    public void add(Integer add) {
        amount += add;
    }
    public void sub(Integer sub) {
        amount -= sub;
    }

    private List<Card> hand = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getPlayerResult () {
        return "Player " + name + " win" + numberOfWins + " game from " + numberOfGames +
                "\nplayer balance " + amount + " and player earn " + (amount - startAmount) + " UAH";
    }
}
