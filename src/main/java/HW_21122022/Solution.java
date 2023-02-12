package HW_21122022;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.Collections.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    private static String str;

    public static void main(String[] args) {

//      1.**** Создать стрим который принмает на вход Стрингу  * а на выходе выводит на экран кол-во слов и повторений данного слова:
//      <p>
//          inut-> my name is
//          out -> my : 1
//          name : 1
//          is : 1
//          <p>

//        String[] strArray = str.toLowerCase().split("[^а-яА-Я]+");
//        Arrays.stream(strArray)
//                .collect(Collectors.toMap(
//                        k -> k,
//                        v -> 1,
//                        (v1, v2) -> v1 + 1))
//                .forEach((key, value) -> System.out.println(key + " : " + value));



//        static void countWord(String str) {
//                System.out.println(
//                        Arrays.stream(str.replaceAll("\\p{Punct}", "").toLowerCase().split(" "))
//                                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
//                );
//            }


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


        // задача 5  Отсортировать строки в алфавитном порядке стримом и в обратном
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

        // задача 6    Дан массив интов - вывести на экран все четные числа
        int[] numbers = {4, 51, 32, 1, 21, 24, 5, 7, 89, 86, 5, 4, 12, 20, 2, 6, 71};
        System.out.println("Массив четных чисел");
        stream(numbers)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
        stream(numbers);

        // задача 7 Взять наш класс Student ( или сделать свой) изменить имена и фамилии на заглавные и
        // * сгруппировать по курсу стримом
        Student st1 = new Student("Uliana", 'f', 25, 2, 7.4);
        Student st2 = new Student("Elina", 'f', 24, 4, 8.4);
        Student st3 = new Student("Pavel", 'm', 27, 3, 9.4);
        Student st4 = new Student("Alexander", 'm', 30, 2, 6.5);
        Student st5 = new Student("Anatoli", 'm', 32, 5, 9.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println("класс Student");
        students.stream()
                .map(s -> {
                    s.setName(s.getName().toUpperCase());
                    return s;
                })
                .collect(Collectors.groupingBy(s -> s.getCourse()))
                .entrySet()
                .stream()
                .forEach(System.out::println);


        // задача 8 Вывести 7 самых больших чисел из массива чисел Стримом
        System.out.println("7 самых больших чисел из массива");
        List<Integer> list = Arrays.asList(14, 51, 32, 1, 21, 24, 5, 7, 89, 86, 5, 4, 12, 20, 2, 6, 71);
        List<Integer> sortedList = list.stream()
                .sorted(reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList.subList(0, 7));

        //задача  9  Дано String s = "AAGGTFFDDVVAA" или похожая.
        //  Вывести на экран кол-во повторений в таком виде "4A2G1T2F2D2V"
        String s = "AAGGTFFDDVVAA";
        char[] chars = s.toCharArray();

//        for (chars : s) {
//            int count = 0;
//            for (String s : list) {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) == character) {
//                        count++;
//                    }
//                }
//            }
//            System.out.println(character + " " + count);
//
//        }
    }
}


/**
 * First level: Итак:
 * <p>
 * 1.**** Создать стрим который принмает на вход Стрингу
 * а на выходе выводит на экран кол-во слов и повторений данного слова:
 * <p>
 * inut-> my name is
 * out -> my : 1
 * name : 1
 * is : 1
 * <p>
 * 2****. Написать 3 метода который который выводит на экран ЗНАЧЕНИЕ числа фибоначчи.
 * Как выглядит ряд - погуглите [0 1 1 2 3 5 8 13 21 44……]
 * input -> 5
 * out -> 3
 * <p>
 * input -> 8
 * out -> 13
 * <p>
 * НАПИСАТЬ 3-МЯ СПОСОБАМИ [просто цикл, стримом, рекурсией]
 * <p>
 * 3**. Дана стринга  String ss = "KikJhYggfTgf" ( это пример )
 * вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ
 * <p>
 * 4*. Дан стрим  Stream stream = Stream.of("we", "wee", "qwer", "oooo");
 * ( или любой другой…не суть )
 * Вывести на экран СТРИМОМ самую длинную строку.
 * Если несколько одинаковых, то значит несколько.
 * <p>
 * <p>
 * Отсортировать строки в алфавитном порядке стримом и в обратном
 * Дан массив интов - вывести на экран все четные числа
 * Взять наш класс Student ( или сделать свой) изменить имена и фамилии на заглавные и
 * сгруппировать по курсу стримом
 * Вывести 7  самых больших числе из массива чисел Стримом
 * <p>
 * <p>
 * 9*. Дано String s = "AAGGTFFDDVVAA" или похожая.
 * Вывести на экран кол-во повторений в таком виде
 * "4A2G1T2F2D2V"
 * <p>
 * **Если в стринге есть какие то другое символы кроме букв - выбросить исключение
 * <p>
 * <p>
 * Дана стринга String r = "otiwuklf'
 * Написать метод где вы вводите символ а метод возвращает индекс.
 * Если буквы нет то соответствующее сообщение
 * <p>
 * <p>
 * 11***. Дан массив интов. Написать метод в который вы передаете массив и еще одно число. Метод должен ВЕРНУТЬ ИНДЕКС ДВУХ ЧИСЕЛ СУММА КОТОРЫХ ДАЕТ ЭТО ЧИСЛО. ЕСЛИ ТАКОВЫХ НЕТ - СООБЩЕНИЕ.
 * <p>
 * 12 ** Написать метод который принимает стрингу из нескольких слов и возвращает перевернутое предложение. ВОЗВРАЩАЕМОЕ ЗНАЧЕНИЕ STRING!
 * input -> my name is
 * out -> is name my
 * <p>
 * 13**Написать метод
 * input -> int a =221
 * out -> 122
 * <p>
 * ipmut -> int b = -123
 * out -> -321
 * <p>
 * !!JПомните по диапазон интов!!
 * <p>
 * <p>
 * Все задачи сделать в отдельном проекте!
 * <p>
 * Каждая задача в отдельной папке с именем задачи ( модно номер)
 * <p>
 * ВСЕ МЕТОДЫ ДОЛЖНЫ ПРОВЕРЯТЬ ВХОДЯЩИЕ ЗНАЧЕНИЯ НА ВАЛИДНОСТЬ
 *
 *

 Java
 recIBPsGLatkPUDmc

 First level: 1. Сделать задачи по стримам ( которые лямбда ) используя не готовый стринг а текст полученный из файла.


 В задании где надо было посчитать кол- во слов стримом ( который лямбда ) подгрузить любую книгу с инета в текстовый файл и посчитать кол-во слов.


 *
 * по новой домашке от 180123
 *
 * int year = rnd.nextInt(LocalDate.now().getYear(), LocalDate.now().getYear() + 5);
 *         year_s = "" + year;
 *         String s = month_s + "/" + year_s.substring(2, 4);
 *          return s;
 */