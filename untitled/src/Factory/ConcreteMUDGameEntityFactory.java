package Factory;

import NPCes.NPC;
import Rooms.Room;

public class ConcreteMUDGameEntityFactory extends MUDGameEntityFactory {
    @Override
    public IGameEntity createEnity(String type, String param1,String param2) {
        switch (type){
            case "room":
                return new Room(param1,param2);
            case "npc":
                return new NPC(param1,param2);
            default:
                return null;
        }
    }
}
