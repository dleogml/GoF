package org.example.section1.factory.abstractfactory;

public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}
