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
    
    //2 pointers
    public static int containwat(ArrayList<Integer> List){
        int maxwat=0;
        int lp=0;
        int rp=List.size()-1;

        while(lp<rp){
            int ht=Math.min(List.get(lp),List.get(rp));
            int width=rp-lp;
            int currrwat=ht*width;
            maxwat=Math.max(maxwat,currrwat);

            if(List.get(lp)<List.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwat;
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
        System.out.println(containwat(list));


    }
}
