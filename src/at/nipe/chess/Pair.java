package at.nipe.chess;

public class Pair<Val1, Val2> {

    private final Val1 val1;
    private final Val2 val2;

    public Pair(Val1 val1, Val2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Val1 getVal1() {
        return val1;
    }

    public Val2 getVal2() {
        return val2;
    }
}
