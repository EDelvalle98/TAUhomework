package codealong;

import java.util.Random;
import java.util.Arrays;


public class ArraysExample {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        printTicket(ticket);

    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        //this is called an enhanced loop. It iterates through 'array' and each time assigns the current element to value
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        //if we've reached this point then the entire array searched and the value was not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        // Sort the array first
        Arrays.sort(array);

        // Perform binary search
        int index = Arrays.binarySearch(array, numberToSearchFor);

        // Check if the number was found
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

}
