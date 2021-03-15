package at.nipe.chess;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private int result = 0;
    private List<Pair<Node, Node>> moves = new ArrayList<>();

    private void addMove() {
        this.result ++;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public List<Pair<Node, Node>> getMoves() {
        return moves;
    }

    public void move(Node from, Node to) {
        moves.add(new Pair<>(from, to));
        this.addMove();
    }
}
