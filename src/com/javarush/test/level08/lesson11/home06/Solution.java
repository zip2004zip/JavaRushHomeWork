package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> childrenSmall = new ArrayList<Human>();
        childrenSmall.add(new Human("СмолОля", false, 23));
        childrenSmall.add(new Human("СмолДима", true, 25));
        childrenSmall.add(new Human("СмолИра", false, 29));

        ArrayList<Human> parents = new ArrayList<Human>();
        parents.add(new Human("мама", false, 52, childrenSmall));
        parents.add(new Human("папа", true, 55, childrenSmall));

        ArrayList<Human> grandParents = new ArrayList<Human>();
        grandParents.add(new Human("дед1", true, 89, parents));
        grandParents.add(new Human("дед2", true, 91, parents));
        grandParents.add(new Human("бабка1", false, 88, parents));
        grandParents.add(new Human("бабка2", false, 90, parents));

        for (int i = 0; i < grandParents.size(); i++) {
            System.out.println(grandParents.get(i));
        }

        for (int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i));
        }

        for (int i = 0; i < childrenSmall.size(); i++) {
            System.out.println(childrenSmall.get(i));
        }
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
