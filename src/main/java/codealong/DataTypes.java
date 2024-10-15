package codealong;

public class DataTypes {
    public static void main(String[] args) {
//        countWords("I love Test Automation University");
//        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'smeEfrain");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

    }

    public static void reverseString(String text){
        for (int i = text.length()-1; i>0; i--){
            System.out.println(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder();

        for (int i = 0; i<modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        }
    }

