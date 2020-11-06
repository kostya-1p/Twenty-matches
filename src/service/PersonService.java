package service;

import java.util.Scanner;

public class PersonService {
    private int lastMove = 0;
    public int pullMatches() {
        Scanner scanner = new Scanner(System.in);
        int matches = scanner.nextInt();

        if(matches > 3 || matches < 1){
            return 0;
        }

        lastMove = matches;
        return matches;
    }

    public int getLastMove() {
        return lastMove;
    }
}
