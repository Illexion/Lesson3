import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] unknownArray = new String[15];
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println(randomWord(words));

        for (int i = 0; i < unknownArray.length; i++) {
            unknownArray[i] = "#";
        }
        for (int i = 0; i < unknownArray.length; i++) {
            System.out.print(unknownArray[i]);
        }


        System.out.println(words.length);
        System.out.println(words[3].length());
        System.out.println(words[3].charAt(0));
        System.out.println("введи слово");
        String userAnswer = sc.nextLine();
        sc.close();
    }
    public static String randomWord(String[] wordArray){
        Random random = new Random();
        int randomWordNumber = random.nextInt(wordArray.length + 1);
        String guessWord = wordArray[randomWordNumber];
        System.out.println(guessWord);
        return guessWord;
    }
}
