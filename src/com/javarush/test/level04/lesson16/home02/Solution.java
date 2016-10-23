package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String y1 = reader.readLine();
        int a = Integer.parseInt(y1);
        String y2 = reader.readLine();
        int b = Integer.parseInt(y2);
        String y3 = reader.readLine();
        int c = Integer.parseInt(y3);
        if (a < b & b < c)
        {
            System.out.println(b);
        }
        if (b < a & a < c)
        {
            System.out.println(a);
        }
        if (c < b & b < a)
        {
            System.out.println(c);
        }
    }
}
