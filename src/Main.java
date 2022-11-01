import homework1.PhoneBook;
import ProductRecipe.Product;
import ProductRecipe.ProductList;
import ProductRecipe.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Main {

    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Колесников Владимир", "+7 (921) 922-02-65");
        phoneBook.addContact( "Колесников Дмитрий", "+7 (921) 922-02-65");
        phoneBook.addContact("Кожевникова Анна", "+7 (910) 971-39-99");
        phoneBook.addContact("Трофимов Тимофей", "+7 (955) 256-04-73");
        phoneBook.addContact("Филиппов Антон", "+7 (922) 987-50-19");
        phoneBook.addContact("Попова Валерия", "+7 (967) 688-02-37");
        phoneBook.addContact("Козин Арсений", "+7 (997) 795-30-65");
        phoneBook.addContact("Кузнецова Алина", "+7 (916) 416-75-17");
        phoneBook.addContact("Сергеева Полина", "+7 (936) 961-02-22");
        phoneBook.addContact("Крючкова Вероника", "+7 (968) 522-55-64");
        phoneBook.addContact("Захарова Амина", "+7 (987) 440-15-74");
        phoneBook.addContact("Попов Кирилл", "+7 (980) 503-57-69");
        phoneBook.addContact("Власова Мария", "+7 (963) 308-06-95");
        phoneBook.addContact("Соколова Вера", "+7 (950) 274-85-56");
        phoneBook.addContact("Моргунов Артём", "+7 (941) 469-24-87");
        phoneBook.addContact("Парфенов Илья", "+7 (984) 130-91-47");
        phoneBook.addContact("Кузнецов Илья", "+7 (925) 143-94-54");
        phoneBook.addContact("Антонова Варвара", "+7 (929) 935-84-50");
        phoneBook.addContact("Волкова Варвара", "+7 (931) 132-04-58");
        phoneBook.addContact("Еремеев Дмитрий","+7 (991) 405-63-85");
        phoneBook.addContact("Марков Александр ", "+7 (967) 713-45-59");
        System.out.println(phoneBook);

        System.out.println();

        phoneBook.getContact("Волкова Варвара");
        System.out.println();
        phoneBook.removeContact("Волкова Варвара");
        System.out.println();
        phoneBook.getContact("Волкова Варвара");
        System.out.println();
        phoneBook.getContainsValueContact("Волкова Варвара");

        System.out.println();

        Product banana = new Product("банан", 50.0f, 2);
        Product fish = new Product("рыба", 134.0f, 1);
        ProductList productList = new ProductList();
        productList.addProduct(banana, 2);
        productList.addProduct(fish,3);
        //System.out.println(productList);

        //Product banana2 = new Product("банан", 31.0f, 7);
        //productList.addProduct(banana2);
        //Recipe recipe = new Recipe("Каша", Set.of(banana, fish));

        //_________________________Задание_3_________________________

        HashMap("str1", 4);
        HashMap("str2", 3);
        HashMap("str2", 2);
        HashMap("str2", 7);

        //_________________________Д3_2_________________________

        //_________________________Задание_1_________________________
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        HashMap<String, Integer> listHashMap = new HashMap<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList());
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));

            hashMap.put("string" + Integer.toString(i), list.get(i));
            System.out.println("string" + Integer.toString(i) + "->" + list.get(i));
            listHashMap.put("string" + Integer.toString(i), list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("string" + Integer.toString(i) + " -> " + listHashMap.get("string" + Integer.toString(i)));
        }

        System.out.println();

        //_________________________Задание_2_________________________
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            integerStringHashMap.put(i, ":string");
        }
        System.out.print(integerStringHashMap);
    }

    private static void HashMap(String line, int num) {

        String Result = String.valueOf((hashMap.get(line)));
        if (Result == "null") {
            hashMap.put(line, num);
        } else if (Integer.parseInt(Result) == num) {
            throw new IllegalArgumentException("Повтор ключ-значения");
        } else {
            hashMap.put(line, num);
        }
    }
}