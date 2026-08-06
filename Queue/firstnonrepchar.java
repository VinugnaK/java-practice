package Queue;

import java.util.*;

public class firstnonrepchar {
    public static void nonrepchar(String s) {
        Queue<Character> q = new LinkedList<>();
        int[] freqcount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            freqcount[ch - 'a']++;
            while (!q.isEmpty() && freqcount[q.peek() - 'a'] > 1) {
                q.remove();
            }
        }
        // if u want to see the entire itr's thn put it inside for loop
        if (q.isEmpty()) {
            System.out.println(-1 + " ");
        } else {
            System.out.println(q.peek());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String s = "aabbcxzzc";
        nonrepchar(s);

    }

}
