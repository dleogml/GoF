package org.example.section3.interpreter.after;

import org.example.section3.interpreter.before.PostfixNotation;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");

        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
