import java.util.*;
public class containerwater {
    public static int storewater(ArrayList<Integer> ht){
        int maxwat=0;
        //bruteforce
        for(int i=0;i<ht.size();i++){
            for(int j=i+1;j<ht.size();j++){
               int htt=Math.min(ht.get(i),ht.get(j));
               int width=j-i;
               int currwwat=htt*width;
               maxwat=Math.max(currwwat,maxwat);

            }

        }return maxwat;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storewater(list));


    }
}
