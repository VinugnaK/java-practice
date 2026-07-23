package Stack;

import java.util.*;

public class StackUsingArrLink {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isempty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }

}