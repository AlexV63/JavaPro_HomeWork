package HW_11012023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Task3 {

    //        вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ

    public static void main(String[] args) {
        int i = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Instinkt_ubiicy.txt"));
            String str;
            int upperCase = 0;
            int lowerCase = 0;
            while ((str = reader.readLine()) != null) {
                i++;
                System.out.println(i + " : string");
                for (int k = 0; k < str.length(); k++) {
                    if (Character.isUpperCase(str.charAt(k))) upperCase++;
                    if (Character.isLowerCase(str.charAt(k))) lowerCase++;
                }
                System.out.printf("Всего %d заглавных букв и %d прописных.", upperCase, lowerCase);
                System.out.println();

           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

