package HW_11012023;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        //задача 4 Вывести на экран СТРИМОМ самую длинную строку
        System.out.println("Вывести на экран СТРИМОМ самую длинную строку");

        Stream<String> stream =
                Stream.of("we", "wee", "qwer", "oooo", "стоматология", "медицина", "интересно", "иПрочаяДребедень", "важно");
        stream
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Map.Entry.<Integer, List<String>>comparingByKey())
                .ifPresent(e -> System.out.println(e.getValue()));
    }
}
