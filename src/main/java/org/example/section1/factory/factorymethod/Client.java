package org.example.section1.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        /*
        Ship whiteShip = WhiteshipFactory.orderShip("Whiteship", "daehee@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = WhiteshipFactory.orderShip("Blackship", "daehee@mail.com");
        System.out.println(blackShip);
        */

        Ship whiteShip = new WhiteshipFactory().orderShip("Whiteship", "daehee@email.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackshipFactory().orderShip("Blackship", "daehee@email.com");
        System.out.println(blackShip);

        Client client1 = new Client();
        client1.print(new WhiteshipFactory(), "whiteship", "daehee@email.com");
        client1.print(new BlackshipFactory(), "blackship", "daehee@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
