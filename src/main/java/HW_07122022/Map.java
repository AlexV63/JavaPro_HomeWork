package HW_07122022;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        Test1 test1 = new Test1("Alex");
        Test1 test2 = new Test1("Bertha");
        Test1 test3 = new Test1("Otto");
        Test1 test4 = new Test1("Hans");
        Test1 test5 = new Test1("Karl");
        Test1 test6 = new Test1("Klara");
        Test1 test7 = new Test1("Elena");
        Test1 test8 = new Test1("Olga");
        Test1 test9 = new Test1("Natalia");
        Test1 test10 = new Test1("Didi");

        Test2 test01 = new Test2(45);
        Test2 test02 = new Test2(36);
        Test2 test03 = new Test2(29);
        Test2 test04 = new Test2(35);
        Test2 test05 = new Test2(26);
        Test2 test06 = new Test2(42);
        Test2 test07 = new Test2(38);
        Test2 test08 = new Test2(23);
        Test2 test09 = new Test2(21);
        Test2 test010 = new Test2(50);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alex", 45);
        map.put("Bertha", 36);
        map.put("Otto", 29);
        map.put("Hans", 35);
        map.put("Karl", 26);
        map.put("Klara", 42);
        map.put("Elena", 38);
        map.put("Olga", 23);
        map.put("Natalia", 31);
        map.put("Didi", 50);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }

        map.putIfAbsent("Karl", 26); //добавить если отсутствует
        System.out.println("***************************");
        System.out.println("Размер мапы " + map.size());

        System.out.println("***************************");
        System.out.println("найти по ключу " + map.get("Olga"));

    }
}
