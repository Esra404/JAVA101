package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkListClass {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
