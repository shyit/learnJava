package net.htwater.think.D09.D09_05_02;

/**
 * Created by 96955 on 2019/2/26.
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game game = factory.getGame();
        while (game.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(new ChessFactory());
        playGame(new CheckerFactory());
    }
}

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        moves++;
        return moves != MOVES;
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        moves++;
        return moves != MOVES;
    }
}

class ChessFactory implements GameFactory {

    @Override
    public Chess getGame() {
        return new Chess();
    }
}

class CheckerFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}
