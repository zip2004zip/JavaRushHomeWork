package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String y = reader.readLine();
        int yAge = Integer.parseInt(y);
        String m = reader.readLine();
        int mAge = Integer.parseInt(m);
        String d = reader.readLine();
        int dAge = Integer.parseInt(d);
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + dAge + "." + mAge + "." + yAge);
    }
}
