package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        //напишите тут ваш код
        map.put("Stal", new Date("JUNE 1 1980"));
        map.put("Llone", new Date("JANUARY 5 1985"));
        map.put("Tallo", new Date("JULY 8 1981"));
        map.put("Stone", new Date("JUNE 1 1980"));
        map.put("Serg", new Date("SEPTEMBER 27 1987"));
        map.put("Tne", new Date("JULY 2 1980"));
        map.put("One", new Date("JANUARY 1 1980"));
        map.put("Ne", new Date("JUNE 1 1980"));
        map.put("Salo", new Date("DECEMBER 12 1987"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            //получение пары элементов
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }
}