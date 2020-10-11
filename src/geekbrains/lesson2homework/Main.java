package geekbrains.lesson2homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        //Задание 1
        //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

            System.out.println("Задание 1");

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) arr[i] = 0;
                else arr[i] = 1;
            }
            System.out.println(Arrays.toString(arr));


        //Задание 2
        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

            System.out.println("Задание 2");

            // работу выполняю внутри одного метода, поэтому: arr, arr2, arr3...

            int[] arr2 = new int[8];
            int j = 0;
            for (int i = 0; i < arr2.length; i++, j = j + 3) {
                arr2[i] = j;
            }
            System.out.println(Arrays.toString(arr2));


        //Задание 3
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

            System.out.println("Задание 3");

            int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    arr3[i] = arr3[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr3));


        //Задание 4
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

            System.out.println("Задание 4");

            int[][] arr4 = new int[4][4];
            for (int i = 0; i < arr4.length; i++) {
                for (int h = 0; h < arr4.length; h++) {
                    if ((i == h)  || (i == arr4.length - 1 - h)) {
                        arr4[i][h] = 1;
                    }
                }
            }
            System.out.println(Arrays.toString(arr4));
            //Вроде бы сделал все логично но результат на выходе не тот который ожидаешь. Не могу сам разобратьс в чем ошибка

        //Заданние 5
        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы

            System.out.println("Задание 5");

            int[] arr5 = {3, 5, 3, 57, 23, -36, 52, 5, 7, 8, 1};
            int min = arr5[0];
            int max = arr5[0];
            for (int i = 0; i < arr5.length; i++) {
                min = (min < arr5[i]) ? min : arr5[i];
                max = (max > arr5[i]) ? max : arr5[i];
            }

        System.out.println("\n Минимальное число: " + min + "\n Максимальное число "  + max);
    }
}
