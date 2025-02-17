package Factory;

public abstract class MUDGameEntityFactory {
    IGameEntity createEnity(String type,String param);
}
