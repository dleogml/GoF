package org.example.section3.observer.after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("daehee");
        User user2 = new User("ledaekdl");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "난 이 게임을 해봤어요!");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");
    }
}
