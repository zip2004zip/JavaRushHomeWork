package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<String>();

        System.out.println("Вводим пять слов");
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }

        System.out.println(stringArrayList.size());

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i) + " ");
        }

        System.out.println("Получаем результат:");
        for (int i = 0; i < stringArrayList.size(); i++) {
            //   Collections.sort(stringArrayList, Collections.reverseOrder()); // убывание
            Collections.sort(stringArrayList); //возрастание
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i) + " ");
        }
    }
}