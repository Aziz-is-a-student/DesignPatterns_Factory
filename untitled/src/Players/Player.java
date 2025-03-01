/*import items.Inventory;
import items.Item;*/





package Players;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private ArrayList<String> inventory;

    public Player(String playerName, int playerHealth, int playerExperience
,ArrayList inventory) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerExperience = playerExperience;
        this.inventory = inventory;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(int playerExperience) {
        this.playerExperience = playerExperience;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerHealth=" + playerHealth +
                ", playerExperience=" + playerExperience +
                '}';
    }
}
