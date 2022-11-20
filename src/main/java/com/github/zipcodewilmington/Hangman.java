package com.github.zipcodewilmington;


import com.github.zipcodewilmington.sample.WordGuessGame;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
public static void main(String[] args){
    WordGuessGame game=new WordGuessGame();
    game.welcomeMessage();
    game.initialize_game_state();
    game.runGame();
}

}
