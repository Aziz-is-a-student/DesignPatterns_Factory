import java.util.Scanner;


/**
 * MUDController (Skeleton):
 * A simple controller that reads player input and orchestrates
 * basic commands like look around, move, pick up items,
 * check inventory, show help, etc.
 */
import Players.Player;
import Factory.*;
import NPCes.*;
import Rooms.*;
public class MUDController {

    private final Player player;
    private boolean running;
    private Room room;

    /**
     * Constructs the controller with a reference to the current player.
     */
    public MUDController(Player player,Room room) {
        // Initialize fields here (if needed)
        this.player = player;
        this.room = room;
    }

    /**
     * Main loop method that repeatedly reads input f   rom the user
     * and dispatches commands until the game ends.
     */
    public void runGameLoop() {
        // TODO: Implement a loop that:
        // 1) Prints a prompt (e.g., "> ")
        // 2) Reads user input
        // 3) Calls handleInput(input)
        // 4) Terminates when 'running' is set to false
        Scanner in = new Scanner(System.in);
        while (running) {
            System.out.println("Write command here >");
            String input = in.nextLine().toLowerCase();
            handleInput(input);
            if(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
                running = false;
            }
        }
    }

    /**
     * Handle a single command input (e.g. 'look', 'move forward', 'pick up sword').
     */
    public void handleInput(String input) {
        // TODO:
        // 1) Parse the input into a command and optionally an argument
        // 2) Use a switch/case (or if/else) to call the correct method below
        //    based on the command word
        String[] commandAndArgument = input.split(" ");
        String command = commandAndArgument[0];
        String argument = commandAndArgument[1];
        switch (command) {
            case "lookAround":
                 lookAround();
                 break;
            case "move":
                if (argument == null) {
                    System.out.println("Didn't find argument");
                }
                else {
                    move(argument);
                }
                break;
            case "pickUp":
                if(argument == null) {
                    System.out.println("Didn't find argument");
                }
                else {
                    pickUp(argument);
                }
                break;
            case "checkInventory":
                checkInventory();
                break;

            case "help":
                showHelp();
                break;
            case "exit":
                running = false;
                System.out.println("Game over");
                break;
        }

    }

    /**
     * Look around the current room: describe it and show items/NPCs.
     */
    private void lookAround() {
        // TODO: Print information about the player's current room
        room.describe();
    }

    /**
     * Move the player in a given direction (forward, back, left, right).
     */
    private void move(String direction) {
        // TODO: Attempt to move to the next room in the given direction
        //       If there's no room in that direction, print an error message
        //       If successfully moved, describe the new room
        if(direction.equalsIgnoreCase("left")|| direction.equalsIgnoreCase("right")|| direction.equalsIgnoreCase("back")|| direction.equalsIgnoreCase("forward")) {
            System.out.println("You moved the direction " + direction);
        }else {
            System.out.println("Your direction isn't a valid direction");
        }
    }

    /**
     * Pick up an item (e.g. "pick up sword").
     */
    private void pickUp(String arg) {
        // TODO:
        // 1) Parse out the item name if 'arg' starts with "up "
        // 2) Check if that item exists in the current room
        // 3) Remove from room, add to player's inventory
        String[] arguments = arg.split(" ");
        String item = "";
        if(arguments[0].equalsIgnoreCase("up")){
            item = arguments[1];
        }
        if(item.isEmpty()){
            System.out.println("Which item you want to pick up?");
        }else{
            System.out.println("You picked up " + item);
            player.getInventory().add(item);
        }
    }

    /**
     * Check the player's inventory.
     */
    private void checkInventory() {
        // TODO: List the items in the player's inventory
        //       If no items, indicate that the inventory is empty
        if(player.getInventory().size() == 0) {
            System.out.println("Your inventory is empty");
        }else{
            System.out.println("You have " + player.getInventory().size() + " items");
            int i = 1;
            for(String item : player.getInventory()) {
                System.out.print(i + ". " + item + " ");
            }
        }
    }

    /**
     * Show help commands
     */
    private void showHelp() {
        // TODO: Print a list of available commands and brief instructions
        System.out.println("You can see the help menu");
        System.out.println("lookAround:  describe room or place");
        System.out.println("move argument direction : move towards the direction");
        System.out.println("pickUp argument : pick up the item");
        System.out.println("checkInventory argument : check the inventory");
        System.out.println("help: show this help menu");
    }

    /**
     * (Optional) Add any other methods (e.g., attack, open door, talk, etc.)
     * if you want to extend the game logic further.
     */
}
