package ru.mirea.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    private static String[] createDeck() {
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
        String[] deck = new String[52];

        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks){
                deck[i] = rank + " of " + suit + "\n";
                i++;
            }
        }

        return deck;
    }

    private static void dealCards(String[] deck, int players) {
        Random rand = new Random();
        for (int i = 0; i < players; i++) {
            System.out.println("player " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int index;
                do {
                    index = rand.nextInt(0, 52);
                }while (deck[index].equals(""));
                System.out.print(deck[index]);
                deck[index] = "";
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dealCards(deck, n);
    }
}
