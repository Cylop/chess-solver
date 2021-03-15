package at.nipe.chess;

import java.util.*;

public class Algorithms {

    //Mögliche Züge
    private static final int[] row = {2, 2, -2, -2, 1, 1, -1, -1};
    private static final int[] col = {-1, 1, 1, -1, 2, -2, 2, -2};

    private static boolean isValid(int x, int y, int boardSize) {
        return x >= 0 && y >= 0 && x < boardSize && y < boardSize;
    }

    //Methode um minimale anzahl an Zügen zu suchen
    public static Optional<Result> BreathFirstSearch(Node src, Node dest, int N) {
        Result result = new Result();
        Set<Node> visited = new HashSet<>();

        Queue<Node> q = new ArrayDeque<>();
        q.add(src);

        while (!q.isEmpty()) {
            Node node = q.poll();

            int x = node.x;
            int y = node.y;
            int dist = node.dist;

            if (x == dest.x && y == dest.y) {
                result.setResult(dist);
                return Optional.of(result);
            }

            if (!visited.contains(node)) {
                visited.add(node);

                for (int i = 0; i < 8; i++) {

                    int x1 = x + row[i];
                    int y1 = y + col[i];

                    if (isValid(x1, y1, N)) {
                        Node newNode = new Node(x1, y1, dist + 1);
                        q.add(newNode);
                        result.move(node, newNode);
                    }
                }
            }
        }
        return Optional.empty();
    }
}
