package service;

import entity.Player;

public class PrintService {
    public void printStartGame() {
        System.out.println("Начало игры");
    }

    public void printMatchesLeft(int matchesLeft){
        System.out.println("На столе осталось " + matchesLeft + " спичек");
    }

    public void printComputerMove(int matchesPulledByComputer){
        System.out.println("Количество выбранных компьютером спичек = " + matchesPulledByComputer);
    }

    public void printPersonMove(){
        System.out.print("Ход игрока. Введите количество спичек: ");
    }

    public void printPlayerLoss(Player player){
        System.out.println(player.toString() + " проиграл!");
        System.out.println("Игра окончена.");
    }

    public void incorrectMatchesNumber(){
        System.out.println("Некорректное количество спичек!");
    }
}
