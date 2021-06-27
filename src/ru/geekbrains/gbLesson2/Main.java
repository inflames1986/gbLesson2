package ru.geekbrains.gbLesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //        zeroOne(); задание 1
        //        cycleOn(); задание 2
        //        sixDivide(); задание 3

//        int [][] arr = new int[3][3];

//        int[][] arr = {   //задаем двумерный массив
//                {6, 2, 4, 9, 8, 8, 6, 5},
//                {5, 5, 2, 7, 0, 9, 5, 0},
//                {6, 2, 4, 9, 8, 8, 6, 5},
//                {5, 5, 5, 5, 5, 5, 5, 4},
//                {6, 2, 4, 9, 8, 8, 6, 5},
//                {5, 5, 2, 7, 0, 9, 5, 0},
//                {5, 5, 5, 5, 5, 5, 5, 5},
//                {5, 4, 6, 5, 7, 5, 3, 2},
//        };
//
//        quOne(arr); // задание 4
//        printArr2d(arr); //печать двухмерного массива

//        minArrEl();//задание 5.1 минимальное число массива
//        maxArrEl();//задание 5.2 максимальное число массива

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

//          System.out.println(checkSumLR(arr)); //задание 6

        sdvLR(arr, n);



    }

    public static void zeroOne() { // Задание 1
        int[] arr = {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1}; //инициализируем массив, одновременно заполняя его
        int i = 0; // инициализируем переменную i, видимую внутри всего тела функции
        System.out.println(Arrays.toString(arr)); //выводим исходный массив на экран
        for (i = 0; i < arr.length; i++) { //
            if (arr[i] == 0) arr[i] = 1; //если элемент массива 0, то элемент массива 1
            else arr[i] = 0;//во всех остальных случаях (элемент массива 1) элемент массива 0
        }
        System.out.println(Arrays.toString(arr));//выводим получившийся массив
    }

    public static void cycleOn() { // Задание 2
        int[] arr = new int[8]; // задаем массив длинной 8
        for (int i = 0; i < arr.length; i++) {//от i равного нулю до i меньше длины массива, i + 1
            arr[i] = i * 3;//элемент массива равено номер элемента массива *3
        }
        System.out.println(Arrays.toString(arr));//выводим получившийся массив
    }

    public static void sixDivide() { // Задание 3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //инициализируем массив, одновременно заполняя его
        System.out.println(Arrays.toString(arr)); //выводим исходный массив на экран
        for (int i = 0; i < arr.length; i++) { //
            if (arr[i] < 6) arr[i] *= 2; //если элемент массива <6, то элемент массива *2
        }
        System.out.println(Arrays.toString(arr)); //выводим получившийся массив на экран
    }

    public static void printArr2d(int[][] arr) { // функция форматированной распечатки двумерного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);//печатаем всю строку из элементов массива
            }
            System.out.println();//переходим на новую строку
        }
    }

    public static void quOne(int[][] arr) { // Задание 4

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i + j == arr[i].length - 1)) arr[i][j] = 1;// если индексы равны 0 или сумма индексов
                // равна длине массива -1, arr[i][j]==1
            }
        }
    }

    public static void minArrEl() { // Задание 5/1

        int[] arr = {4, 5, 3, 0, 11, -10, 5, 2, 4, 8, 9, 6}; //инициализируем массив, одновременно заполняя его
        int min = 999999999; // максимальное возможное значение INT
        System.out.println(Arrays.toString(arr)); //выводим исходный массив на экран
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Минимальное число массива = " + min);// можно высести в отдельную функцию и возвращать число
    }

    public static void maxArrEl() { // Задание 5/2

        int[] arr = {4, 5, 3, 0, 250, -10, 5, 2, 4, 8, 9, 6}; //инициализируем массив, одновременно заполняя его
        int max = -999999999; // максимальное возможное значение INT
        System.out.println(Arrays.toString(arr)); //выводим исходный массив на экран
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Максимальное число массива = " + max);//можно высести в отдельную функцию и возвращать число
    }

    //либо в одну функцию загоняем макс мин и sout ("Максимальное число = " + max + "Минимальное число = " + min

    public static boolean checkSumLR(int[] arr) {// Задание 6

        int sumV = 0;// сумма всех элементов массива
        int sumL = 0;// сумма слева
        int sumR = 0;// сумма справа

        for (int i = 0; i < arr.length; i++) { // вычисляем сумму элементов массива
            sumV = sumV + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumL = sumL + arr[i];//вычисляем сумму элементов массива слева
            sumR = sumV - sumL;//вычисляем сумму элементов массива справа - сумма всех элементов минус сумма слева
            if (sumL == sumR) {// если сумма слева на данном шаге равна сумме справа
                break;// завершение цикла
            }
        }
        return (sumL == sumR);// возвращаем логическое значение функции
    }

    public static void sdvLR(int[] arr, int n) { //Задание №7 по состоянию на 19.00 27.06 в разработке,
                                                 // для быстроты проверки сдаю ДЗ, чтобы успеть на проверку до
                                                // понедельника, пытаюсь уловить логику дальше

        int temp1 = 0;
        int temp2 = 0;

        if (n > 0){
            for (int i = 0; i < n ; i++) {
                temp1 = arr[i];
                arr[arr.length-1] = temp1;
                    for (i = n; i < arr.length; i++) {
                    temp2 = arr[i];
                    arr[i - n] = temp2;
                }
                System.out.println(Arrays.toString(arr));//выводим получившийся массив
                break;
            }
        }


    }

}