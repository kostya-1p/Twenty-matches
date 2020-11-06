package service;

import entity.Player;
import repository.ActivePlayerRepository;

public class ActivePlayerService {
    private ActivePlayerRepository activePlayerRepository = new ActivePlayerRepository();

    public Player getActivePlayer() {
        return activePlayerRepository.getActivePlayer();
    }

    public Player getPassivePlayer() {
        return activePlayerRepository.getPassivePlayer();
    }

    public void setActivePlayer(Player activePlayer) {
        activePlayerRepository.setActivePlayer(activePlayer);
    }
}
