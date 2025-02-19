package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

// Part 2: Implement Flyweight Registry interface
public class FlyweightRegistryImpl implements FlyweightRegistry {
    private Map<String, UserIntrinsicState> flyweightRegistry;

    // CTOR
    public FlyweightRegistryImpl() {
        this.flyweightRegistry = new HashMap<>();
    }

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        this.flyweightRegistry.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return this.flyweightRegistry.get(email);
    }
    
}
