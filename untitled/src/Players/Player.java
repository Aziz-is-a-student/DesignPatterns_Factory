/*import items.Inventory;
import items.Item;*/





package Players;

public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
   // private Inventory inventory;

    public Player(String playerName, int playerHealth, int playerExperience
/*,Inventory inventory*/) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerExperience = playerExperience;
        //this.inventory = inventory;
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

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", playerHealth=" + playerHealth +
                ", playerExperience=" + playerExperience +
                '}';
    }
}
