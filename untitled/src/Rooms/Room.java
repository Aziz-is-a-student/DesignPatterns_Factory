package Rooms;

import Factory.IGameEntity;

public class Room implements IGameEntity {
    String name;
    String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void describe() {
        System.out.println(name + " " + description);
    }
}
