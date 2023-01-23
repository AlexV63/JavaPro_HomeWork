package HW_21122022.Task5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    // задача 5  Отсортировать строки в алфавитном порядке стримом и в обратном

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Alex");
        words.add("Bertha");
        words.add("Otto");
        words.add("Hans");
        words.add("Karl");
        words.add("Klara");
        words.add("Elena");
        words.add("Olga");
        words.add("Natalia");
        System.out.println("Отсортированные списки");
        List<String> result = words.stream()
                .sorted()
                .toList();
        System.out.println(result);
        List<String> reverse = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverse);
    }
}
