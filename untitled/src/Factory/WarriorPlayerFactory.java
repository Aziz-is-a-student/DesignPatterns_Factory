package Factory;

import Players.Player;

public class WarriorPlayerFactory implements IPlayerFactory{
    @Override
    public Player createPlayer(String playerName) {
        int health = 100;
        int experience = 0;
        return new Player(playerName,health,experience);
    }
}
