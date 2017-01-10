package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        /*List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);*/

        HashMap<String, String> stringMap = new HashMap<String, String>();
        while (true) {
            System.out.println("city");
            String city = reader.readLine();
            if (city.isEmpty()) break;
            System.out.println("name");
            String name = reader.readLine();
            stringMap.put(city, name);
        }

        //read home number
        /*int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/

        System.out.println("keyCity");
        String keyCity = reader.readLine();

        for (Map.Entry<String, String> pair : stringMap.entrySet()) {
            if (keyCity.equals(pair.getKey())) {
                System.out.println("Value " + pair.getValue());
            }
        }
    }
}