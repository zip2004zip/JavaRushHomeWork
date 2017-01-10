package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Лора");
        stringSet.add("Лор");
        stringSet.add("Лев");
        stringSet.add("Лось");
        stringSet.add("Люся");
        stringSet.add("Луна");
        stringSet.add("Лиза");
        stringSet.add("Лиса");
        stringSet.add("Лодка");
        stringSet.add("Лог");
        stringSet.add("Линь");
        stringSet.add("Лень");
        stringSet.add("Лоло");
        stringSet.add("Лала");
        stringSet.add("Лик");
        stringSet.add("Лана");
        stringSet.add("Липа");
        stringSet.add("Лека");
        stringSet.add("Лило");
        stringSet.add("Лил");
        return (HashSet<String>) stringSet;
    }
}
