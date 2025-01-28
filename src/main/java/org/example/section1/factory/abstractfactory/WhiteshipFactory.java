package org.example.section1.factory.abstractfactory;

import org.example.section1.factory.factorymethod.Ship;
import org.example.section1.factory.factorymethod.ShipFactory;

public class WhiteshipFactory implements ShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
