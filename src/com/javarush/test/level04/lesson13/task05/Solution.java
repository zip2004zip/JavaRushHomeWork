package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(n + " любит меня.");
        }
    }
}
