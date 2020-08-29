package geekbrains.lesson3homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число");
        int range = 9;
        int number = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range);

        for (int i = 2; i >= 0; i--) {
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше! Осталось попыток: " + i );

            } else if (input_number < number) {
                System.out.println("Загаданное число больше! Осталось попыток: " + i);
            }
            if (i == 0) {
                System.out.println("Вы проиграли! Правильный ответ: " + number);
            }
        }


        System.out.println("Вы хотите играть снова? 1 - ДА / 0 - НЕТ");

            int newGame = scanner.nextInt();
            while (newGame > 1 || newGame < 0) {
                System.out.println("Вы ввели неверное число. Для продолжения нажите 1, для выхода из игры нажмите 0");
                newGame = scanner.nextInt();

                if (newGame == 1) {
                    System.out.println("Начало новой игры...");
                    newGame = scanner.nextInt();
                } else if (newGame == 0) {
                    System.out.println("До встречи!");
                }
                scanner.close();
            } while (true);
    }
}
