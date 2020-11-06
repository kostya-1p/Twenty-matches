package service;

public class ComputerService {
    public int pullMatches(int moveNum, int lastPersonMove) {
        if (moveNum == 0) {
            return 3;
        } else {
            return 4 - lastPersonMove;
        }
    }
}
