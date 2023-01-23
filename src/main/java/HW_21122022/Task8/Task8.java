package HW_21122022.Task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Task8 {
    public static void main(String[] args) {
        // задача 8 Вывести 7 самых больших чисел из массива чисел Стримом
        System.out.println("7 самых больших чисел из массива");
        List<Integer> list = Arrays.asList(14, 51, 32, 1, 21, 24, 5, 7, 89, 86, 5, 4, 12, 20, 2, 6, 71);
        List<Integer> sortedList = list.stream()
                .sorted(reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList.subList(0, 7));
    }
}
