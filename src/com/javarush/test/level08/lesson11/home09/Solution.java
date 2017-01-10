package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static String START_DATE = "JANUARY 1 2017";

    public static void main(String[] args) {
        System.out.println(START_DATE + " = " + isDateOdd(START_DATE));
    }

    public static boolean isDateOdd(String date) {
        Date startDate = new Date(date);
        Date currentDate = new Date();
        long time = currentDate.getTime() - startDate.getTime();
        long msInDay = 1000 * 60 * 60 * 24;
        int daysToToday = (int) (time / msInDay);
        return (daysToToday % 2 == 0);
    }
}