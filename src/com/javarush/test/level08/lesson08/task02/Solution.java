package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static void main(String[] args) {
        HashSet<Integer> hs = createSet();
        hs = removeAllNumbersMoreThan10(hs);
        for (int x : hs) {
            System.out.println(x);
        }
    }

    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Random random = new Random();
        Set<Integer> integerSet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            integerSet.add(random.nextInt(50));
        }
        return (HashSet<Integer>) integerSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > 10) iterator.remove();
        }
        return set;
    }
}