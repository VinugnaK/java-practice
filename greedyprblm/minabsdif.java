package greedyprblm;

import java.util.*;

class minabsdif {
    public static void main(String[] args) {
        int A[] = { 1, 4, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);// tc:o(nlogn)
        Arrays.sort(B);
        int res = 0;
        for (int i = 0; i < A.length; i++) {// tc:O(N)
            res += Math.abs(A[i] - B[i]);
        }
        System.out.println(res);// total tc:o(NlogN)
    }
}