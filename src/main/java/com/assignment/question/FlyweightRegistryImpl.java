package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry {
    private Map<GraphicType, GraphicIntrinsicState> graphicRegistry;

    // CTOR
    public FlyweightRegistryImpl() {
        this.graphicRegistry = new HashMap<>();
    }

    @Override
    public void addFlyweight(GraphicIntrinsicState flyweight) {
        this.graphicRegistry.put(flyweight.getType(), flyweight);
    }

    @Override
    public GraphicIntrinsicState getFlyweight(GraphicType graphicType) {
        return this.graphicRegistry.get(graphicType);
    }
    
}
