package greedyprblm;

import java.util.*;

public class coin {
    public static void main(String[] args) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coin, Comparator.reverseOrder());
        int countofcoins = 0;
        int amo = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] <= amo) {
                while (coin[i] <= amo) {
                    countofcoins++;
                    ans.add(coin[i]);
                    amo -= coin[i];

                }
            }

        }
        System.out.println(+countofcoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }

    }

}
