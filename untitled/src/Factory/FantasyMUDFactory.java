package Factory;

public interface FantasyMUDFactory {
    IGameEntity createRoom();
    IGameEntity createNPC();
}
