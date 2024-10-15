package pwdval;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your old password:");
        String oldPassword = scanner.nextLine();

        System.out.println("Enter your new password:");
        String newPassword = scanner.nextLine();

        if (isPasswordValid(newPassword, username, oldPassword)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }

   public static boolean isPasswordValid(String newPassword, String username, String oldPassword) {
        return isAtLeast8Chars(newPassword) && containsUppercaseLetter(newPassword) && containsSpecialCharacter(newPassword) && doesNotContainUsername(newPassword, username) && isNotSameAsOldPassword(newPassword, oldPassword);
    }

    public static boolean isAtLeast8Chars(String password) {
        return password.length() >= 8;
    }

    public static boolean containsUppercaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

   public static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-+=<>?{}[]";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    public static boolean doesNotContainUsername(String password, String username) {
        return !password.toLowerCase().contains(username.toLowerCase());
    }

    public static boolean isNotSameAsOldPassword(String password, String oldPassword) {
        return !password.equals(oldPassword);
    }
}