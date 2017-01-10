package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static void main(String[] args) {
        String name = new String("Volt1");
        String lastName = new String("Jon");
        System.out.println(getCountTheSameFirstName(createMap(), name));
        System.out.println(getCountTheSameLastName(createMap(), lastName));
    }

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Jon", "Volt1");
        dictionary.put("Jimmi", "Volt2");
        dictionary.put("Tomas", "Volt3");
        dictionary.put("Killi", "Volt4");
        dictionary.put("Gimm", "Volt1");
        dictionary.put("Klon", "Volt6");
        dictionary.put("Edio", "Volt2");
        dictionary.put("Martin", "Volt8");
        dictionary.put("Yuolit", "Volt9");
        dictionary.put("Hrom", "Volt1");
        return (HashMap<String, String>) dictionary;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                countName++;
            }
        }
        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                countLastName++;
            }
        }
        return countLastName;
    }
}
