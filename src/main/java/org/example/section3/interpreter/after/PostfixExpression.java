package org.example.section3.interpreter.after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);

    static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static PostfixExpression variable(Character c) {
        return context -> context.get(c);
    }

    // 곱하기를 추가한다면 영향없이 가능함
    // 이런식으로도 가능하고 또 다른 구현체 클래스로도 가능
    // 단, Parser 는 영향을 받음(switch case 부분)
    static PostfixExpression multiply(PostfixExpression left, PostfixExpression right) {
        return context -> left.interpret(context) * right.interpret(context);
    }
}
