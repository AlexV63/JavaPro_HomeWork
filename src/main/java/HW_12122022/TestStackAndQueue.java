package HW_12122022;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackAndQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Nikolay");
        queue.add("Sergey");
        queue.add("Dmitriy");
        queue.add("Slawa");
        queue.add("Stas");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());

        Stack<String> stack = new Stack<>();
        stack.push("Alex");
        stack.push("Natalia");
        stack.push("Olga");
        stack.push("Oxana");
        stack.push("Sergey");

        System.out.println(stack);
        System.out.println("стек");
        System.out.println(stack.peek());
        System.out.println("после пик");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("после поп");
        System.out.println(stack);

    }
}
