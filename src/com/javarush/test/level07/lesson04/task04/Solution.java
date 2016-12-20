package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] ints = new int[10];
        initMas(ints);
        // newMas(ints);
        printMas(ints);
    }

    private static void initMas(int[] mas) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }

    /*private static void newMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int j = mas.length - i - 1;
        }
    }*/

    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int j = mas.length - i - 1;
            System.out.println(mas[j]);
        }
    }
}