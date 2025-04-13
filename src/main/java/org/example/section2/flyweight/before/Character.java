package org.example.section2.flyweight.before;

public class Character {
    private char value;
    private String color;
    private String frontFamily;
    private int fontSize;

    public Character(char value, String color, String frontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.frontFamily = frontFamily;
        this.fontSize = fontSize;
    }
}
