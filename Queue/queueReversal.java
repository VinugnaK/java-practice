package Queue;

import java.util.*;

public class queueReversal {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {// or u can use while loop
            s.push(q.remove());
        }
        for (int i = 0; i < size; i++) {// or u can use wgile loop
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        reverse(q);
    }

}
