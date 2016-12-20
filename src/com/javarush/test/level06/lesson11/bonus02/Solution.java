package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("имя Дедушки");
        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        System.out.println("имя бабушки");
        String grandMatherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMatherName);

        System.out.println("имя папы");
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        System.out.println("имя мамы");
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        System.out.println("имя сына");
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        System.out.println("имя дочи");
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentFather == null && parentMother == null) {
                return "Cat name is " + name + ", no mother, no father";

            } else if (parentMother == null) {
                return "Cat name is " + name + ", no mother" + ", father is " + parentFather.name;

            } else if (parentFather == null) {
                return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";

            } else {
                return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            }
        }
    }
}
