package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private String address;
        private String parents;
        private String grandParents;

        public Human(String name, boolean sex, int age, String address, String parents, String grandParents) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.parents = parents;
            this.grandParents = grandParents;
        }

        public Human(String name, boolean sex, int age, String address, String parents) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.parents = parents;
        }

        public Human(String name, boolean sex, int age, String grandParents) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.grandParents = grandParents;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Human(String parents) {
            this.parents = parents;
        }

        public Human(boolean sex, String grandParents) {
            this.sex = sex;
            this.grandParents = grandParents;
        }

        public Human(int age, String parents) {
            this.age = age;
            this.parents = parents;
        }

        public Human(int age, String address, String parents, String grandParents) {
            this.age = age;
            this.address = address;
            this.parents = parents;
            this.grandParents = grandParents;
        }
    }
}
