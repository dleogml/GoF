package org.example.section3.command.after;

import org.example.section3.command.before.Game;

public class GameStartCommand implements Command{
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
