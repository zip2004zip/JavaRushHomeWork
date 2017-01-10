package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Jon", "Volt1");
        dictionary.put("Jon", "Volt2");
        dictionary.put("Tomas", "Volt3");
        dictionary.put("Killi", "Volt4");
        dictionary.put("Gimm", "Volt1");
        dictionary.put("Klon", "Volt6");
        dictionary.put("Edio", "Volt2");
        dictionary.put("Martin", "Volt8");
        dictionary.put("Yuolit", "Volt9");
        dictionary.put("Hrom", "Volt1");
        return dictionary;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
