package homework1;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> phoneBook = new HashMap<>();

    public void addContact(String surnameName, String phoneNumber) {
        if (phoneBook.containsKey(surnameName) && phoneBook.containsKey(phoneNumber)) {
            throw new IllegalArgumentException("Такой контакт уже есть!");
        } else {
            phoneBook.put(surnameName, phoneNumber);
        }
    }

    public void removeContact(String surnameName) {
        System.out.println("Удален контакт: '" + surnameName + "' " + phoneBook.remove(surnameName));
    }

    public void getContact(String surnameName) {
        System.out.println("Номер телефона контакта '" + surnameName + "' " + phoneBook.get(surnameName));
    }

    public void getContainsValueContact(String surnameName) {
        System.out.println("Контакт '" + surnameName + "' " + phoneBook.containsValue(surnameName));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список контактов: ").append('\n');
        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            stringBuilder.append(contact).append('\n');
        }
        return stringBuilder.toString();
    }
}



