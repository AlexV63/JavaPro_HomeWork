package HW_11012023;

import lombok.ToString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@ToString

public class Task5 {
    // задача 5  Отсортировать строки в алфавитном порядке стримом и в обратном

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Instinkt_ubiicy.txt"))){

            List<String> str = new ArrayList<String>();
            while ((reader.readLine()) != null) {
                str.add(String.valueOf(reader));
            }

            List<String> result = str.stream()
                    .sorted()
                    .toList();
            System.out.println(result.toString());

            List<String> reverse = str.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
//            System.out.println(reverse);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
//while ((str = reader.readLine()) != null) {
//        i++;
//        System.out.println(i + " : string");
//        for (int k = 0; k < str.length(); k++) {
//        if (Character.isUpperCase(str.charAt(k))) upperCase++;
//        if (Character.isLowerCase(str.charAt(k))) lowerCase++;
//        }