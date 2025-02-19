package com.assignment.question;

import lombok.Getter;

// Part 1.2: Define context dependent properties (must be calculated for each object)

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private UserIntrinsicState user;  // shared
    private Colour colour;
    private Integer currentGameStreak;
    private static FlyweightRegistry userRegistry = new FlyweightRegistryImpl();

    // CTOR
    public UserExtrinsicState(String name, Integer age, String gender, String email, String phoneNumber, Byte[] photo, Colour colour, Integer currentGameStreak) {
        this.user = UserExtrinsicState.userRegistry.getFlyweight(email);
        if (this.user == null) {
            this.user = new UserIntrinsicState(name, age, gender, email, phoneNumber, photo);
            UserExtrinsicState.userRegistry.addFlyweight(this.user);
        }
        
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
    }

    // Setters - Commented
    /*
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setCurrentGameStreak(Integer currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }
    */
}