import Factory.IPlayerFactory;
import Factory.WarriorPlayerFactory;
import Players.Player;

public class Main {
    public static void main(String[] args) {

        IPlayerFactory playerFactory = new WarriorPlayerFactory();
        Player player = playerFactory.createPlayer("Aziz");
        System.out.println(player.toString());
    }
}