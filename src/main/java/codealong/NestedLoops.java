package codealong;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all Students
        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for Test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + average);

        }
        scanner.close();

        System.out.println("Enter some text:");
        Scanner scanner2 = new Scanner(System.in);
        String text = scanner2.next();
        scanner2.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i = 0; !letterFound && i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }       if(letterFound) {
                    System.out.println("This text contains the letter 'A'");

                } else {
                    System.out.println("This text does not contain the letter 'A'");
                }
            }
        }