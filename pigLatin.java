import java.io.IOException;
import java.util.Scanner;

public class pigLatin {

    static boolean isWord(String word) {
        return !(word.contains(" "));
    }

    static String translate(String word) {
        String newWord = word.substring(1, word.length()) + word.substring(0, 1) + "ay";
        return newWord;
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("enter a word:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("bye")) {
                System.out.println(translate(input));
                System.out.println("stopping...");
                break;
            }
            if (isWord(input)){
                System.out.println(translate(input));
            } else {
                System.out.println("invalid. try again:");
            }
        }
        sc.close();
    }

}