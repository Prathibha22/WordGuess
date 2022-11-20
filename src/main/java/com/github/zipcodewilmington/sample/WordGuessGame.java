package com.github.zipcodewilmington.sample;

import java.util.Scanner;

public class WordGuessGame {
    public WordGuessGame() {
    }
    private String[] wordList={"cat","dog","farm","true","false","print","dad"};
    private char[] mysteryWord;
    private char[] playerGuesses;
    private  int mysteryWordLength;
    public void welcomeMessage() {
        System.out.println("Welcome to word guess!\nTry to guess word\n" );
    }
    public void initialize_game_state(){
        int randomIndex=(int) Math.random()*(this.wordList.length);
        this.mysteryWordLength=this.wordList[randomIndex].length()-1;
        mysteryWord=wordList[randomIndex].toCharArray();
        playerGuesses=new char[mysteryWord.length];
        System.out.println("Your mystery word is");
        for(int i=0;i<=mysteryWordLength;i++) {
            playerGuesses[i] = '-';
            System.out.print(playerGuesses[i]+" ");
        }

    }

    public char getUserInput(){
        System.out.println("Please enter your guessed character to find the mystery word");
        Scanner reader=new Scanner(System.in);
        char input=reader.next().charAt(0);
        return input;
    }

    public void runGame() {
        int counter=0;
        while(mysteryWordLength>=0){
            char guessedChar=getUserInput();
            for(int i=0;i<mysteryWord.length;i++) {
                if (guessedChar == mysteryWord[i]) {
                    playerGuesses[i] = guessedChar;
                    counter++;
                }
                System.out.print(playerGuesses[i]+" ");
            }
            System.out.println("You have left with "+mysteryWordLength+" attempts");
            if(counter== playerGuesses.length && mysteryWordLength==0)
                System.out.println("You won the game");
            else if(mysteryWordLength==0)System.out.println("You lost the game");
            mysteryWordLength--;
        }
    }
}
