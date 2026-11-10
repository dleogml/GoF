package org.example.section3.observer.java;

import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {
    // java 9부터는 Observer, Observable 은 deprecated 되었음
    // 이유는 Observable 에 자세히 적혀있음
    static class User implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }
    }

    static class Subject extends Observable {
        public void add(String message) {
            setChanged();
            notifyObservers(message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Java, Observer");
    }

}