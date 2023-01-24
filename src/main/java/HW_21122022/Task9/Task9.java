package HW_21122022.Task9;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        //задача  9  Дано String s = "AAGGTFFDDVVAA" или похожая.
        //  Вывести на экран кол-во повторений в таком виде "4A2G1T2F2D2V"

        String s = "AAGGTFFDDVVAA";
        String[] split = s.split("");

        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(split));
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        for (String s1 : hashSet) {
            int num = 0;
            for (int i = 0; i < split.length; i++) {
                if (s1.equals(split[i])) {
                    num++;
                }
            }
            hashMap.put(s1, num);
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getValue() + entry.getKey());
        }
    }
}

