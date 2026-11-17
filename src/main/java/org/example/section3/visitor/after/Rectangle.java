package org.example.section3.visitor.after;

public class Rectangle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
