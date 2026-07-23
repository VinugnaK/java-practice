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

    public static void main(String args[]) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatbt(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}