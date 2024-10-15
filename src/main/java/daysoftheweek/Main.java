package daysoftheweek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7 to get the day of the week (1 for Monday, 7 for Sunday):");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("The day of the week is: " + daysOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
