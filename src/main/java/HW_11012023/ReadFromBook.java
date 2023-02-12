package HW_11012023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ReadFromBook {

    public static void main(String[] args) {

        List<String> text = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Instinkt_ubiicy.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArr = line.replaceAll("[„“°¦—«»…,–!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "")
                        .toLowerCase().split(" ");
                for (int i = 0; i < lineArr.length; i++) {
                    text.add(lineArr[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        text.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}


