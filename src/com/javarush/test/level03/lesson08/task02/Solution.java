package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     //   System.out.println("Имя");
        String name = reader.readLine();

       // System.out.println("Получает");
        String sUsa = reader.readLine();
        int nUsa = Integer.parseInt(sUsa);

       // System.out.println("лет");
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.print(name + " получает " + sUsa + " через " + sAge + " лет.");
    }
}