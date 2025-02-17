package Factory;

import Players.Player;

public interface IPlayerFactory {
    Player createPlayer(String name);
}
