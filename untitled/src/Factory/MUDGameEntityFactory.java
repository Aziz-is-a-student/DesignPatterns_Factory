package Factory;

public abstract class MUDGameEntityFactory {
    abstract IGameEntity  createEnity(String type,String param1,String param2);
}
