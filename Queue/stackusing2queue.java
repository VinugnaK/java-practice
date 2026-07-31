package Queue;

import java.util.*;

class stackusing2queue {
    static class stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // to push the element
        public static void push(int data) {// O(1)
            // checking which queue has data an dadding the data to it
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {// O(N)
            // checking if it is empty
            if (isEmpty()) {
                System.out.println("it is emptyy");
                return -1;
            }
            // initializing the top value
            int top = -1;

            // case 1: if elements are in queue 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    // we are removeing the elements from q1 only if q1 has elements
                    top = q1.remove();
                    // if q1 is empty thenn it will break and the element will be poped
                    // automatically
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {// if elements are in queue 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;

        }

        public static int peek() {// O(N)
            if (isEmpty()) {
                System.out.println("it is emptyy");
                return -1;
            }

            int top = -1;

            // case 1: if elements are in queue 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {// if elements are in queue 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;

        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}