import java.util.Scanner;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNum = genRandomInt(9);
        int count = 3;
        System.out.println("Загадано:" + randomNum);
        do {
            System.out.println("Введите число");
            int a = sc.nextInt();

            if (a == randomNum) {
                System.out.println("Верно! Ты победитель битвы экстрасенсов?");
                count = 0;
            } else if (a > randomNum) {
                System.out.println("не угадал! загадное число меньше твоего.");
            } else {
                System.out.println("не угадал! загадное число больше твоего.");
            }

            count--;

            if (count == 0) {
                System.out.println("Игра окончена, спасибо!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

                a = sc.nextInt();

                if (a == 1) {
                    count = 3;
                    System.out.println("Игра перезапущена!");
                    randomNum = genRandomInt(9);
                } else {
                    System.out.println("Игра совсем совсем окончена, спасибо!");
                    count = 0;

                }
            }
        } while (count > 0);
    }

    public static int genRandomInt(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}
