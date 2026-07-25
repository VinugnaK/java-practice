//pushing the element at the bottom of the stack
package Stack;

import java.util.*;

class PushAtBottom {
    static void pushatbt(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbt(s, data);
        s.push(top);
    }

    public static void reversestack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbt(s, top);
    }

    // beacuse of this line , once stack is printed it is poped out.so the stack
    // becomes empty....and next time when we call/do an operation on stack, it is
    // empty
    public static void printstack(Stack<Integer> s) {
        while (!s.isEmpty()) {

            System.out.println(s.pop());
        }

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatbt(s, 4);
        /*
         * while (!s.isEmpty()) {
         * System.out.println(s.peek());
         * s.pop();
         * 
         * }
         */
        // comment one printstack and check it will work
        // printstack(s);
        reversestack(s);
        printstack(s);
    }
}