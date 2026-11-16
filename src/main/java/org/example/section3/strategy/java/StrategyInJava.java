package org.example.section3.strategy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyInJava {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);

        System.out.println(numbers);

        // 기본적으로 제공되는 Static 메서드가 존재함
        Collections.sort(numbers, Comparator.naturalOrder());
        Collections.sort(numbers, Comparator.reverseOrder());

        System.out.println(numbers);
    }
}
