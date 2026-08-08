package greedyprblm;

import java.util.*;

public class fractionalknapsak {
    public static void using2darray(int value[], int weight[], int capacity) {

        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        // ascending order sort to desc sort
        Arrays.sort(ratio, Comparator.comparingDouble((double[] o) -> o[1]).reversed());
        int res = 0;
        for (int i = 0; i < value.length; i++) {
            if (capacity >= weight[i]) {
                capacity = capacity - weight[i];
                res += value[i];
            } else {
                res += (ratio[i][1] * capacity);
            }

        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;
        int ratio[] = new int[value.length];

        for (int i = 0; i < value.length; i++) {
            ratio[i] = value[i] / weight[i];
        }
        int out = 0;
        for (int i = 0; i < value.length; i++) {
            if (capacity >= weight[i]) {
                capacity = capacity - weight[i];
                out += value[i];
            } else {
                out += (ratio[i] * capacity);
            }
        }
        System.out.println(out);
        System.out.println("----------------------------------------------------");
        int cap = 50;
        using2darray(value, weight, cap);
    }
}
