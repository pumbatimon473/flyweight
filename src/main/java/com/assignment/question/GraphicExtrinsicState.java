package com.assignment.question;

// Part 1.2 Define context dependent properties (must be calculated for each object)

@ExtrinsicState
public class GraphicExtrinsicState {
    private GraphicIntrinsicState graphic;  // shared
    private Integer x, y;  // coordinates
    private static FlyweightRegistry graphicRegistry = new FlyweightRegistryImpl();

    public GraphicExtrinsicState(GraphicType type, Image image, Integer x, Integer y, Integer width, Integer height, String color) {
        // initializing intrinsic object (shared)
        this.graphic = GraphicExtrinsicState.graphicRegistry.getFlyweight(type);
        if (this.graphic == null) {
            this.graphic = new GraphicIntrinsicState(type, image, width, height, color);
            GraphicExtrinsicState.graphicRegistry.addFlyweight(this.graphic);
        }
        // initializing extrinsic properties
        this.x = x;
        this.y = y;
    }

    // Setters
    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Integer getWidth() {
        return this.graphic.getWidth();
    }

    public Integer getHeight() {
        return this.graphic.getHeight();
    }

    public String getColor() {
        return this.graphic.getColor();
    }

    public GraphicType getType() {
        return this.graphic.getType();
    }

    public Image getImage() {
        return this.graphic.getImage();
    }
}