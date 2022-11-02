import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkHashMap {

    public static HashMap<String, Integer> hashMap = new HashMap<>();

    public static HashMap<String, List<Integer>> hashMap2 = new HashMap<>();

    public static HashMap<String, Integer> listHashMap = new HashMap<>();

    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

    public static HashMap<Integer, String> integerStringHashMap = new HashMap<>();

    final static void getWorkHashMap(String line, int num) {
        if (String.valueOf((hashMap.get(line))) == "null") {
            hashMap.put(line, num);
        } else if (hashMap.get(line) == num) {
            throw new IllegalArgumentException("Повтор ключ-значения");
        } else {
            hashMap.put(line, num);
            System.out.println("Операция по добавлению - успех!");
        }
    }

    final static void getWorkHashMap2() {
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList());
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));

            hashMap2.put("string" + Integer.toString(i), list.get(i));
            System.out.println("string" + Integer.toString(i) + "->" + list.get(i));
            listHashMap.put("string" + Integer.toString(i), list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("string" + Integer.toString(i) + " -> " + listHashMap.get("string" + Integer.toString(i)));
        }
    }

    final static void getIntegerStringHashMap() {
        for (int i = 1; i <= 10; i++) {
            integerStringHashMap.put(i, ":string");
        }
        System.out.print(integerStringHashMap);
    }
}
