package HW_21122022.Task6;

import static java.util.Arrays.stream;

public class Task6 {
    public static void main(String[] args) {
        // задача 6    Дан массив интов - вывести на экран все четные числа
        int[] numbers = {4, 51, 32, 1, 21, 24, 5, 7, 89, 86, 5, 4, 12, 20, 2, 6, 71};
        System.out.println("Массив четных чисел");
        stream(numbers)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
        stream(numbers);
    }
}
