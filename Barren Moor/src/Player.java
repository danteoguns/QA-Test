//import java.util.ArrayList;

import java.util.Scanner;

public class Player {
    private String name;
    private String distance;
    private double location;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public static void main(String[] args) {

        Player player = new Player("bob");
//      ArrayList<Compass> direction = new ArrayList<>();

        System.out.println("You awaken to find yourself in a barren moor\n" + "Try “look”");
        Scanner input = new Scanner(System.in);

        String playerInput = input.next();


        if (playerInput.equals("look")) {
            System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins.");
            System.out.println("Some black plants barely poke out of the shallow water.");
        }

        System.out.println("Try “north”,”south”,”east”,or “west”");

        if (playerInput.equals("north")) {
            String distance = player.getDistance();
            double location = 5.0;
            double location1 = player.distanceCalc(distance, location);

            while (player.distanceCalc() > 0) {
                System.out.println("Your current position is: " + player.distanceCalc);
                player.distanceCalc = distanceCalc1(player.distanceCalc, getLocation());

                distanceCalc(distance, getLocation());
                player.distanceCalc1 = distanceCalc(player.distanceCalc, getLocation());
            }

        }

        System.out.println("You notice a small watch-like device in your left hand.");
        System.out.println("It has hands like a watch, but the hands don’t seem to tell time.");
    }

    public double distanceCalc(double location, String distance) {
        // Round 1
        if (location == 5 && distance.equalsIgnoreCase("north")) {
            location = 5 - 2.6;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (enter.equalsIgnoreCase("b")) {
                location = 5;
            } else {
                location = 5 - 2.6;
            }
            return location;
        }
        if (location == 5 && distance.equalsIgnoreCase("south")) {
            location = 5 + 1;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.next();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 5;
            }
            return distance;
        }
        if (location == 5 && distance.equalsIgnoreCase("west")) {
            distance = 5 + 1;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (enter.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }
        if (location == 5 && distance.equalsIgnoreCase("east")) {
            location = 5 - 2.7;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }

        //Round 2

        if (location == 2.4 && distance.equals("north")) {
            System.out.println("You can not move forward it is dangerous");
            System.out.println("Your current location is still " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }

        if (location == 2.4 && (distance.equals("east"))) {
            location = 2.4 - 1.2;
            System.out.println("Your current distance is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (enter.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }

        if (location == 2.3 && distance.equalsIgnoreCase("north")) {
            location = 1;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 2.3;
            }
            return location;
        }

        if (location == 2.3 && distance.equalsIgnoreCase("east")) {
            System.out.println("You can not move forward it is dangerous");
            System.out.println("Your current location is still " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.next();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }

        if (location == 6 && (distance.equalsIgnoreCase("south")) || (distance.equalsIgnoreCase("west"))) {
            System.out.println("You can not move forward it is dangerous");
            System.out.println("Your current location is still " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 5;
            }
            return location;
        }

        //Round 3
        if (location == 1.2 && distance.equalsIgnoreCase("north")) {
            location = 0;
            System.out.println("You see a treasure in front of you, You made");
            return location;
        }
        if (location == 1.0 && distance.equalsIgnoreCase("east")) {
            location = 0;
            System.out.println("You see a treasure in front of you, You made");
            return location;
        }
        if (location == 6 && distance.equalsIgnoreCase("North")) {
            location = 6 - 1;
            System.out.println("Your current location is " + location);
            System.out.println("Do you wish to go back ENTER 'b', anything else means you wish to continue");
            String playerInput = input.nextLine();
            if (playerInput.equalsIgnoreCase("b")) {
                location = 6;
            }
            return location;
        }

        return location;
    }
}

//    public void movePlayer() {


//        System.out.print("Enter your name: ");
//        String name = input.next();
//
//        System.out.print("Enter north, east, south or west: ");

//        while (cp) {
//        for (int i = 0; i++;) {
//            int direction = input.nextInt();
//            if (direction == (5)) {
//                int north = input.nextInt();
//                System.out.println("The dial reads:" + north);
//            }
//
//            if (direction == (10)) {
//                int east = input.nextInt();
//                System.out.println("The dial reads: " + east);
//            }
//
//            if (direction == (15)) {
//                int south = input.nextInt();
//                System.out.println("The dial reads: " + south);
//            }
//
//            if (distance == (20)) {
//                int west = input.nextInt();
//                System.out.println("The dial reads: " + west);
//            }
//            System.out.println("Try again");
//        }


//    @Override
//    public String toString() {
//        return super.toString();
//    }

        //    public ArrayList<Compass> getDirection() {
//        return direction;
//    }
//
//    public void setDirection(ArrayList<Compass> direction) {
//        this.direction = direction;
//    }
