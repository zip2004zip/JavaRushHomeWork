package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> evenArrayList = new ArrayList<Integer>(); //четные
        ArrayList<Integer> unevenArrayList = new ArrayList<Integer>(); // нечетные
        ArrayList<Integer> otherArrayList = new ArrayList<Integer>(); //остальные

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        printList(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            Integer x = arrayList.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                unevenArrayList.add(x);
                evenArrayList.add(x);
            } else if (x % 3 == 0) {
                unevenArrayList.add(x);
            } else if (x % 2 == 0) {
                evenArrayList.add(x);
            } else {
                otherArrayList.add(x);
            }
        }

        System.out.println("\nДелится на 3");
        printList(unevenArrayList);

        System.out.println("\nДелится на 2");
        printList(evenArrayList);

        System.out.println("\nОстальные");
        printList(otherArrayList);
    }

    private static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}