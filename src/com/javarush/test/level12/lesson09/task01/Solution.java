package com.javarush.test.level12.lesson09.task01;

/* Интерфейс Fly
Напиши свой public интерфейс Fly(летать). Добавь в него два метода.
*/

import java.sql.Driver;

public class Solution {
    public static void main(String[] args) {

    }

    //add an interface here - добавь интерфейс тут
    public interface Fly {
        void fly(String newAddress);

        void drive(Driver driver);
    }
}