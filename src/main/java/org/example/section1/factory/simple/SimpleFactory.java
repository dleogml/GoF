package org.example.section1.factory.simple;

import org.example.section1.factory.factorymethod.Blackship;
import org.example.section1.factory.factorymethod.Whiteship;

public class SimpleFactory {
    public Object createProduct(String name) {
        if(name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")){
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
