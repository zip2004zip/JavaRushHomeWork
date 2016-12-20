package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] masBig = new int[20];
        int[] masSmall1 = new int[10];
        int[] masSmall2 = new int[10];

        for (int i = 0; i < masBig.length; i++) {
            masBig[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.arraycopy(masBig, 0, masSmall1, 0, 10);
        System.arraycopy(masBig, 10, masSmall2, 0, 10);

        /*for (int i = 0; i < masSmall1.length; i++) {
            masSmall1[i] = masBig[i];
        }

        for (int i = 0; i < masSmall2.length; i++) {
            masSmall2[i] = masBig[i + 10]++;
        }*/

        for (int i = 0; i < masSmall2.length; i++) {
            System.out.println(masSmall2[i]);
        }
    }
}