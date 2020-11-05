package repository;

import entity.Player;

public class ActivePlayerRepository {
    Player activePlayer;
    Player passivePlayer;

    public Player getActivePlayer() {
        return activePlayer;
    }

    public Player getPassivePlayer() {
        return passivePlayer;
    }

    public void setActivePlayer(Player activePlayer) {
        this.passivePlayer = this.activePlayer;
        this.activePlayer = activePlayer;
    }
}
