package Queue;

import java.util.*;

public class stackusingdeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int remove() {// for implementing queue u have to remove first
            return deque.removeLast();
        }

        public int peek() {// for implementing queue u do get first
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.remove();
        s.peek();
        System.out.println(s.peek());
    }
}
