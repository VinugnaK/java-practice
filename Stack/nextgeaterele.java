package Stack;

//finding the next greater element
import java.util.*;

public class nextgeaterele {
    static void ng(int[] arr, int[] greater) {
        Stack<Integer> s = new Stack();
        for (int i = arr.length - 1; i >= 0; i--) {
            // runs till stack not empty and stack's top element <= the current element and
            // removes it, so that when we get the greater element than the current element
            // we can store in the array
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // after poping if the stack is not empty the array will store the top element
            if (s.isEmpty()) {
                greater[i] = -1;
            } else {
                greater[i] = arr[s.peek()];
            }
            // the stack will store the index of the greater element
            s.push(i);

        }

    }

    public static void main(String args[]) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] greater = new int[arr.length];
        ng(arr, greater);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(greater[i]);

        }
    }

}
