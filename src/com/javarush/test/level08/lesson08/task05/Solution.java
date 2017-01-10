package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Jon", "Volt1");
        dictionary.put("Jimmi", "Volt2");
        dictionary.put("Tomas", "Volt3");
        dictionary.put("Killi", "Volt1");
        dictionary.put("Gimm", "Volt2");
        dictionary.put("Klon", "Volt3");
        dictionary.put("Edio", "Volt1");
        dictionary.put("Martin", "Volt8");
        dictionary.put("Yuolit", "Volt9");
        dictionary.put("Hrom", "Volt10");
        return (HashMap<String, String>) dictionary;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> x = new ArrayList<>(map.values());
        for (int i = 0; i < x.size() - 1; i++) {
            for (int j = i + 1; j < x.size(); j++) {
                if (x.get(i).equals(x.get(j))) {
                    removeItemFromMapByValue(map, x.get(i));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
