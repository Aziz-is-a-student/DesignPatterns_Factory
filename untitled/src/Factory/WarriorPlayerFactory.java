package Factory;

import Players.Player;

import java.util.ArrayList;

public class WarriorPlayerFactory implements IPlayerFactory{
    @Override
    public Player createPlayer(String playerName) {
        int health = 100;
        int experience = 0;
        ArrayList<String> inventory = new ArrayList<>();
        return new Player(playerName,health,experience,inventory );
    }
}
