package org.example.section3.visitor.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorInJava {

    public static void main(String[] args) throws IOException {
        Path startingDirectory = Path.of("/Users/PC/Downloads/GoFDesignPattern");
        SearchFileVisitor searchFileVisitor =
                new SearchFileVisitor("Triangle.java", startingDirectory);
        Files.walkFileTree(startingDirectory, searchFileVisitor);
    }
}
