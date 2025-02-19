package com.assignment.question;

// Part 1.1 Define context independent properties (shared)

@IntrinsicState
public class GraphicIntrinsicState {
    private final GraphicType type;
    private final Image image;
    private final Integer width;
    private final Integer height;
    private final String color;

    // CTOR
    public GraphicIntrinsicState(GraphicType type, Image image, Integer width, Integer height, String color) {
        this.type = type;
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getters
    public GraphicType getType() {
        return this.type;
    }

    public Image getImage() {
        return this.image;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }
}