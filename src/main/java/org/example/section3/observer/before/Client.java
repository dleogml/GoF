package org.example.section3.observer.before;

public class Client {
    public static void main(String[] args) {
        // 채팅서버에 두 유저가 들어와 대화를 나누는 상황
        // 옵저버 패턴이 적용되지 않은 상태에서는 한 유저가 다른 유저의 채팅을 보려면
        // getter 를 통해 메세지를 가져와 확인해야되는 비효율적인 상황
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        user1.sendMessage("디자인패턴", "이번엔 옵저버 패턴입니다.");
        user1.sendMessage("롤드컵2026", "LCK 화이팅!");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("디자인패턴"));

        user1.sendMessage("디자인패턴", "예제 코드 보는 중...");
        System.out.println(user2.getMessage("디자인패턴"));
    }
}
