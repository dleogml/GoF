package org.example.section3.visitor.after;

// Visitor 역할
public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
