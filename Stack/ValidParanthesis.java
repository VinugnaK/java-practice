package Stack;

import java.util.*;

public class ValidParanthesis {
    static boolean validpar(String str) {
        Stack<Character> s = new Stack();
        for (int i = 0; i < str.length(); i++) {
            // opening condition----push it
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            }
            // closing condition---pop it if the top ele of stack matches it
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == ')' && s.peek() == '(' || str.charAt(i) == '}' && s.peek() == '{'
                        || str.charAt(i) == ']' && s.peek() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str = "{{{{()}}}}";
        System.out.println(validpar(str));
    }
}
