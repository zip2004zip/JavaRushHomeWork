package com.javarush.test.level08.lesson06.task02;

import java.util.*;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        Date start = new Date();
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        Date end = new Date();
        int time = (int) (end.getTime() - start.getTime());
        System.out.println("arrayList shows the next result: " + time);

        // LinkedList
        Date start2 = new Date();
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        Date end2 = new Date();
        int time2 = (int) (end2.getTime() - start2.getTime());
        System.out.println("LinkedList shows the next result: " + time2);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(i, new Object());
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i, new Object());
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}
