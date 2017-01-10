package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        List<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        return arrayList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        List<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(2, "d");
        }
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        List linkedList = new LinkedList();

        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.add(i, String.valueOf(new Object()));
        }
        return linkedList;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        List<String> linkedList = new LinkedList<String>();

        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.remove(i);
        }
        return linkedList;
    }
}
