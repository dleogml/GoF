package org.example.section3.strategy.after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Faster());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("무~~ 궁~~ 화~~ 꽃 ~~ 이 ~~");
            }

            @Override
            public void redLight() {
                System.out.println("피씀돠!");
            }
        });
    }
}
