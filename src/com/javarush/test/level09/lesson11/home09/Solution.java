package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<String, Cat>();
/*        catMap.put(String.valueOf(catMap), new Cat("Volt1"));
        catMap.put(String.valueOf(catMap), new Cat("Volt2"));
        catMap.put(String.valueOf(catMap), new Cat("Volt3"));
        catMap.put(String.valueOf(catMap), new Cat("Volt4"));
        catMap.put(String.valueOf(catMap), new Cat("Volt1"));
        catMap.put(String.valueOf(catMap), new Cat("Volt6"));
        catMap.put(String.valueOf(catMap), new Cat("Volt2"));
        catMap.put(String.valueOf(catMap), new Cat("Volt8"));
        catMap.put(String.valueOf(catMap), new Cat("Volt9"));
        catMap.put(String.valueOf(catMap), new Cat("Volt1"));*/
        String catName = "Volt";
        for (int i = 0; i < 10; i++) {
            catMap.put(catName + i, new Cat(catName + i));
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> mapSet = new HashSet<Cat>(map.values());
        return mapSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
