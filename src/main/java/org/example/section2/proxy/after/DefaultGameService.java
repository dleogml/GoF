package org.example.section2.proxy.after;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() {
        System.out.println("소환사의 협곡에 오신걸 환영합니다");
    }
}
