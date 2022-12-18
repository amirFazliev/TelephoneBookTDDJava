package org.example;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> hashMap = new HashMap<>();

    public boolean add(String phoneNumber, String name) {
        if (hashMap.isEmpty() || !hashMap.get(phoneNumber).equals(name)) {
            hashMap.put(phoneNumber, name);
            System.out.println("Количество контактов в телефонной книге - " + hashMap.size());
            return true;
        }
        System.out.println("Ошибка: попытка добавления одинакового контакта. Попробуйте еще раз");

        return false;
    }

    public String findByNumber(String phoneNumber) {
        return hashMap.get(phoneNumber);
    }

    public String findByName (String name) {
        for (String key : hashMap.keySet()) {
            if(hashMap.get(key).equals(name)){
                return key;
            }
        }
        return null;
    }

    public void printAllNames() {
        System.out.println("Hello");
    }
}
