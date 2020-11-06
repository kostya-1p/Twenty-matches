package service;

import entity.Computer;
import entity.Person;

public class GameService {
    private Person person = new Person();
    private Computer computer = new Computer();
    private ActivePlayerService activePlayerService = new ActivePlayerService();
    private MatchesService matchesService = new MatchesService();
    private PrintService printService = new PrintService();
    private ComputerService computerService = new ComputerService();
    private PersonService personService = new PersonService();

    private int moveNum = 0;

    public void computerMove(){
        activePlayerService.setActivePlayer(computer);
        printService.printMatchesLeft(matchesService.getMatchesCount());
        int computerMatches = computerService.pullMatches(moveNum, personService.getLastMove());
        printService.printComputerMove(computerMatches);
        matchesService.setMatchesCount(computerMatches);
    }

    public void personMove(){
        activePlayerService.setActivePlayer(person);
        printService.printMatchesLeft(matchesService.getMatchesCount());
        printService.printPersonMove();
        int personMatches = personService.pullMatches();
        matchesService.setMatchesCount(personMatches);

        if(personMatches == 0) {
            printService.incorrectMatchesNumber();
            personMove();
        }
    }

    public void startGame() {
        printService.printStartGame();
        while (matchesService.getMatchesCount() > 5) {
            computerMove();
            personMove();
            moveNum++;
        }

        computerMove();

        printService.printPlayerLoss(activePlayerService.getPassivePlayer());
    }
}
