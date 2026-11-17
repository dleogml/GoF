package org.example.section3.visitor.after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        // accept 를 호출하면 첫번째로 Rectangle 에 있는 accept 를 찾아감
        // 두번째로 Phone 에 있는 print 를 호출하게 됨
        // 이렇게 구체적인 타입을 찾아가는 과정을 더블 디스패치라 부름
        rectangle.accept(device);

    }
}
