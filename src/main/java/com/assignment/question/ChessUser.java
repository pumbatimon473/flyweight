package com.assignment.question;

// Part 3: Refactor ChessUser to make it conform to Flyweight design pattern
public class ChessUser {
    // Code before refactor:
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Colour colour;
    private int currentGameStreak;
    private Byte[] photo;

    // Code after refactor: Commented
    /*
    private UserExtrinsicState game;
    
    // CTOR
    public ChessUser(String name, Integer age, String gender, String email, String phoneNumber, Byte[] photo, Colour colour, Integer currentGameStreak) {
        this.game = new UserExtrinsicState(name, age, gender, email, phoneNumber, photo, colour, currentGameStreak);
    }

    // Setters
    public void setColour(Colour colour) {
        this.game.setColour(colour);
    }

    public void setCurrentGameStreak(Integer currentGameStreak) {
        this.game.setCurrentGameStreak(currentGameStreak);
    }
    */
}