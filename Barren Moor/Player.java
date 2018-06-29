//import java.util.ArrayList;

import java.util.Scanner;

public class Player {
    private String name;
    private String location;
    private double toTreasure;

    Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getToTreasure() {
        return toTreasure;
    }

    public void setToTreasure(double toTreasure) {
        this.toTreasure = toTreasure;
    }


    public void run(){

        System.out.println("You awaken to find yourself in a barren moor\n" + "Try “look”");
        String playerInput = input.nextLine();

        if (playerInput.equals("look")) {
            System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.");
            System.out.println("Some black plants barely poke out of the shallow water.");
        }

        if (playerInput.equals("north")) {
            String location = this.getLocation();
            double toTreasure = 5.0;
            double toTreasure1 = this.toTreasureCalc(toTreasure, location);

            while (toTreasure1 > 0) {
                System.out.println("Your current position is: " + toTreasure1);
                toTreasure1 = this.toTreasureCalc(toTreasure1, this.getLocation());

                this.toTreasureCalc(toTreasure1, this.getLocation());
                toTreasure1 = this.toTreasureCalc(toTreasure1, this.getLocation());
            }
        }

        System.out.println("You notice a small watch-like device in your left hand.");
        System.out.println("It has hands like a watch, but the hands don’t seem to tell time.");
        System.out.println("");
        System.out.println("Try “north”,”south”,”east”,or “west”");
        playerInput =  input.nextLine();
        System.out.println(toTreasureCalc(5, location = playerInput));
    }


    public static void main(String[] args) {

        new Player("bob").run();
    }

    public double toTreasureCalc(double toTreasure, String location) {
        if (toTreasure == 5 && location.equalsIgnoreCase("north")) {
            toTreasure = 5 - 2.6;
            System.out.println("Your current toTreasure is " + toTreasure);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput =  input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                toTreasure = 5;
            } else {
                toTreasure = 5 - 2.6;
            }
            return toTreasure;
        }
        if (toTreasure == 5 && location.equalsIgnoreCase("south")) {
            toTreasure = 5 + 1;
            System.out.println("Your current toTreasure is " + toTreasure);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                toTreasure = 5;
            }
            return toTreasure;
        }
        if (toTreasure == 5 && location.equalsIgnoreCase("west")) {
            toTreasure = 5 + 1;
            System.out.println("Your current toTreasure is " + toTreasure);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                toTreasure = 5;
            }
            return toTreasure;
        }
        if (toTreasure == 5 && location.equalsIgnoreCase("east")) {
            toTreasure = 5 - 2.7;
            System.out.println("Your current toTreasure is " + toTreasure);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                toTreasure = 5;
            }
            return toTreasure;
        }
        return toTreasure;
    }
}