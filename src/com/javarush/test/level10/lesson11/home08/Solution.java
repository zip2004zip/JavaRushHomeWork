package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayList = new ArrayList[3];
        arrayList[0] = new ArrayList<>();
        arrayList[0].add("ren");
        arrayList[0].add("frog");
        arrayList[1] = new ArrayList<>();
        arrayList[1].add("bmw");
        arrayList[1].add("audi");
        arrayList[2] = new ArrayList<>();
        arrayList[2].add("cat");
        arrayList[2].add("hobbit");
        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}