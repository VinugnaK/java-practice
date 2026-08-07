package Queue;

import java.util.*;

public class dequejcf {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addFirst(3);
        deq.addFirst(4);
        System.out.println(deq);
        deq.addLast(1);
        deq.addLast(2);
        System.out.println(deq);
        deq.removeFirst();
        deq.removeFirst();
        System.out.println(deq);
        deq.removeLast();
        deq.removeLast();
        System.out.println(deq);
        deq.getFirst();
        deq.getLast();
        System.out.println(deq);
    }
}
