package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //  int a = Integer.parseInt(reader.readLine());
        //  int b = Integer.parseInt(reader.readLine());
        //  int minimum = min(a, b);
        //  System.out.println("Minimum = " + minimum);

        System.out.println("Ввести количество цифр для поиска минимального числа");
        int a = Integer.parseInt(reader.readLine());
        int[] array = new int[a];
        if (a > 0) {
            System.out.println("Введите " + a + " любых чисел");
            for (int i = 0; i < a; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
        }

        System.out.printf("Минимальное число " + String.valueOf(min(array)));
    }

    //public static int min(int a, int b) {
    //    return a < b ? a : b;
    //}

    public static int min(int[] array) {
        //int min = array[0];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }

        return min;
    }

}
