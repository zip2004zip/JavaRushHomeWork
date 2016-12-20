package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }

        int min = stringArrayList.get(0).length();

        for (int i = 0; i < stringArrayList.size(); i++) {
            if (min > stringArrayList.get(i).length()) {
                min = stringArrayList.get(i).length();
            }
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            if (min == stringArrayList.get(i).length()) {
                System.out.println(stringArrayList.get(i));
            }
        }
    }
}
