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
        String guessWord = randomWord(words);

        Arrays.fill(unknownArray, "#");

        for (String s : unknownArray) {// посоветовала идея) такую конструкцию применять предпочтительнее обычного for ?
            System.out.print(s);
        }

        System.out.println(" Введи слово:");
        String userAnswer = sc.nextLine();


        while (!guessWord.equals(userAnswer)) {
            for (int i = 0; i < Math.min(guessWord.length(), userAnswer.length()); i++) { // Цикл по длинне минимальной строки
                if (userAnswer.charAt(i) == guessWord.charAt(i)) {
                    unknownArray[i] = String.valueOf(userAnswer.charAt(i));
                }
            }

            for (String s : unknownArray) {
                System.out.print(s);
            }

            System.out.println(" Введи еще слово:");
            userAnswer = sc.nextLine();

        }
        sc.close();
        System.out.println("Угадал! Это и правда - " + guessWord);
    }

    public static String randomWord(String[] wordArray) {
        Random random = new Random();
        int randomWordNumber = random.nextInt(wordArray.length + 1);
        String guessWord = wordArray[randomWordNumber];
        System.out.println("Программа загадала: " + guessWord);
        return guessWord;
    }
}
