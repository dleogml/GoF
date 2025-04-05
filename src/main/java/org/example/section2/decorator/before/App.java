package org.example.section2.decorator.before;

public class App {
    public static void main(String[] args) {
        Client client = new Client(new CommentService());
        client.writeComment("전략적 팀 전투");
        client.writeComment("시즌 14 사이버시티...!!");
        client.writeComment("http://tftps.com");
    }
}
