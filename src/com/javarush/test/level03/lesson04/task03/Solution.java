package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name = "zerg";
        zerg2.name = "zerg";
        zerg3.name = "zerg";
        zerg4.name = "zerg";
        zerg5.name = "zerg";
        zerg6.name = "zerg";
        zerg7.name = "zerg";
        zerg8.name = "zerg";
        zerg9.name = "zerg";
        zerg10.name = "zerg";

        Protos protos1 = new Protos();
        Protos protos2 = new Protos();
        Protos protos3 = new Protos();
        Protos protos4 = new Protos();
        Protos protos5 = new Protos();
        protos1.name = "protos1";
        protos2.name = "protos2";
        protos3.name = "protos3";
        protos4.name = "protos4";
        protos5.name = "protos5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "terran1";
        terran2.name = "terran2";
        terran3.name = "terran1";
        terran4.name = "terran1";
        terran5.name = "terran1";
        terran6.name = "terran1";
        terran7.name = "terran1";
        terran8.name = "terran1";
        terran9.name = "terran1";
        terran10.name = "terran1";
        terran11.name = "terran1";
        terran12.name = "terran1";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}