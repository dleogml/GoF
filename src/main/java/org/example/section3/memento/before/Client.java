package org.example.section3.memento.before;

public class Client {
    public static void main(String[] args) {
        // 이 상태에서는 Client 가 Game 의 내부에 어떤 값이 있는지 어떤 걸 필요로 하는지
        // 알아야 하기 때문에 의존적이게 됨
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setBlueTeamScore(blueTeamScore);
        restoredGame.setRedTeamScore(redTeamScore);
    }
}
