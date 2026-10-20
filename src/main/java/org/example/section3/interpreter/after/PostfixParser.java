package org.example.section3.interpreter.after;

import java.util.Stack;

public class PostfixParser {

    // ex) xyz+- 형태의 123+-
    // 처음엔 VariableExpression 3개가 Stack 들어감(V, V, V)
    // + 를 만나고 2와 3을 꺼내서 PlusExpression 으로 만들어 다시 Stack 에 넣음(V, P)
    // - 를 만나고 1과 5를 꺼내서 MinusExpression 으로 만들어 다시 Stack 에 넣음(M)
    // Stack 에는 최종적으로 하나의 PostfixExpression 이 남게 되고 loop 가 끝나고 이걸 꺼내줌(parse 메서드의 마지막)
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }

        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);

        }
    }

    /*private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return PlusExpression.plus(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return MinusExpression.minus(left, right);
            default:
                return VariableExpression.variable(c);

        }
    }*/
}
