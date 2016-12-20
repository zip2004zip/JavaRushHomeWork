package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] masStrings = new String[10];
        int[] masInts = new int[10];

        for (int i = 0; i < masStrings.length; i++) {
            masStrings[i] = bufferedReader.readLine();
            masInts[i] = masStrings[i].length();
        }

        printMas(masInts);
    }

    private static void printMas(int[] initMas) {
        for (int i = 0; i < initMas.length; i++) {
            System.out.println(initMas[i]);
        }
    }
}