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

    /*
     * // To find the duplicate parentheses
     * static boolean dupparen(String str) {
     * Stack<Character> s = new Stack<>();
     * for (int i = 0; i < str.length(); i++) {
     * if (str.charAt(i) != ')') {
     * s.push(str.charAt(i));
     * } else {
     * int count = 0;
     * while (s.peek() != '(') {
     * count++;
     * s.pop();
     * }
     * s.pop();
     * if (count < 1) {
     * return true;
     * }
     * 
     * }
     * }
     * return false;
     * 
     * }
     */
    static boolean dupparen(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String args[]) {
        String str = "(()";
        // false is invalid, true is valid
        System.out.println(validpar(str));
        String x = "((a+b))";
        // false is no duplicate paren, true is duplicate paren
        System.out.println(dupparen(x));

    }
}
