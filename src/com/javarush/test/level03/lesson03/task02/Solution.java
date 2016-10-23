package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int eur1 = 5;
        int eur2 = 5;
        double course1 = 0.7;
        double course2 = 0.9;
        convertEurToUsd(eur1, course1);
        convertEurToUsd(eur2, course2);
    }

    public static double convertEurToUsd(int eur, double course)
    {
        //напишите тут ваш код
        double usa = eur * course;
        System.out.println(usa);
        return usa;
    }

}


