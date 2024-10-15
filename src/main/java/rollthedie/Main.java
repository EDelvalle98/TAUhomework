package rollthedie;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Initialize variables
        int currentPosition = 0;
        int maxPosition = 20;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to the Roll the Die Game!");
        System.out.println("Your goal is to reach exactly space 20 within 5 rolls.");

        for (int roll = 1; roll <= maxRolls; roll++) {
            int dieRoll = random.nextInt(6) + 1;
            currentPosition += dieRoll;

            if (currentPosition == maxPosition) {
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You've reached space 20. You win!");
                return;
            } else if (currentPosition > maxPosition) {
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You've gone past space 20. You lose.");
                return;
            } else {
                int spacesLeft = maxPosition - currentPosition;
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You're now on space " + currentPosition +
                        ". You have " + spacesLeft + " more spaces to go.");
            }
        }

        if (currentPosition != maxPosition) {
            System.out.println("You've used all 5 rolls but didn't land on space 20. You lose.");
        }
    }
}