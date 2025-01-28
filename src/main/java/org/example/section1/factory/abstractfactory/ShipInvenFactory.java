package org.example.section1.factory.abstractfactory;

import org.example.section1.factory.factorymethod.Ship;
import org.example.section1.factory.factorymethod.ShipFactory;
import org.example.section1.factory.abstractfactory.WhiteshipFactory;

public class ShipInvenFactory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
