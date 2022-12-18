package org.example;

import java.util.Comparator;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> hashMap = new HashMap<>();

    public boolean add(String phoneNumber, String name) {
        try {
            if (hashMap.get(phoneNumber).equals(name)) {
                System.out.println("Ошибка: попытка добавления одинакового контакта. Попробуйте еще раз");
                return false;
            }
        } catch (NullPointerException e){
            hashMap.put(phoneNumber, name);
            System.out.println("Количество контактов в телефонной книге - " + hashMap.size());
            return true;
        }
        return false;
    }

    public String findByNumber(String phoneNumber) {
        try {
            return hashMap.get(phoneNumber);
        } catch (NullPointerException e) {
            System.out.println("Пустая телефонная книжка");
            return null;
        }
    }

    public String findByName (String name) {
        try {
            for (String key : hashMap.keySet()) {
                if (hashMap.get(key).equals(name)) {
                    return key;
                }
            }
            return null;
        } catch (NullPointerException e) {
            System.out.println("Пустая телефонная книжка");
            return null;
        }
    }

    public void printAllNames() {
        try {
            hashMap.values().stream()
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("Пустая телефонная книжка");
        }
    }
}
