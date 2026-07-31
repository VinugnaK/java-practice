package Queue;

import java.util.*;

public class queueusing2stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add an element
        public static void add(int data) {// O(N)
            // add s1's data to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // add the data to be added to s1
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        // to remove an element
        public static int remove() {// O(1)
            if (isEmpty()) {
                System.out.println("it is already empty bruh");
                return -1;
            }

            return s1.pop();

        }

        public static int peek() { // O(1)
            if (isEmpty()) {
                System.out.println("it is already empty bruh");
                return -1;
            }
            return s1.peek();

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
