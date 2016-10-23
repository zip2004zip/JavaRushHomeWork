package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        int[][] tabl = new int[11][11];
        for (int i = 1; i < tabl.length; i++)
        {
            for (int j = 1; j < tabl[i].length; j++)
            {
                tabl[i][j] =i*j;
                System.out.printf("%5d", tabl[i][j]);
            }
            System.out.println();
        }
    }
}