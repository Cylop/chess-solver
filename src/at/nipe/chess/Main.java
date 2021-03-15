package at.nipe.chess;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        if (!(args.length >= 4)) {
            System.out.println("Zu wenige argumente angegeben. X1, Y1, X2, Y2 angeben.");
            System.exit(0);
        }

        try{
            x1 = Integer.parseInt(args[0]);
            y1 = Integer.parseInt(args[1]);
            x2 = Integer.parseInt(args[2]);
            y2 = Integer.parseInt(args[3]);
        }catch(NumberFormatException ex) {
            System.out.println("Bitte nur zahlen angeben");
            System.exit(0);
        }

        int boardSize = 8;
        Node src = new Node(x1, y1);
        Node dest = new Node(x2, y2);

        Optional<Result> optional = Algorithms.BreathFirstSearch(src, dest, boardSize);

        if(!optional.isPresent()) {
            System.out.println("Es gab keinen Pfad zum Ziel.");
            System.exit(0);
            return;
        }

        Result result = optional.get();
        System.out.println("Minimale distanz beläuft sich auf: " + result.getResult());

        // Pfad auflisten
        // Zug von A1 -> B2 z.B.
    }
}