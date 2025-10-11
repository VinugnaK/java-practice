package arrlis;
import java.util.ArrayList;
public class multidim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        //adding this list to main list
        mlist.add(list1);
         ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mlist.add(list2);
       
// to print main list or do manipulations in lists present in main list
        for(int i=0;i<mlist.size();i++){
            ArrayList<Integer> currlis = mlist.get(i);
            for(int j=0;j<currlis.size();j++){
                  System.out.print(currlis.get(j)+" ");
            }System.out.println();
        }

         System.out.println(mlist);
//another example of main list 
    ArrayList<ArrayList<Integer>> ml1=new ArrayList<>();
    ArrayList<Integer> lis1 = new ArrayList<>();
    ArrayList<Integer> lis2 = new ArrayList<>();
    ArrayList<Integer> lis3 = new ArrayList<>();

    for(int i=1;i<5;i++){
        lis1.add(i);
        lis2.add(2*i);
        lis3.add(3*i);
    }
    lis2.remove(2);
    ml1.add(lis1);
    ml1.add(lis2);
    ml1.add(lis3);

    for(int i=0;i<ml1.size();i++){
        ArrayList<Integer> curr = ml1.get(i);
        for(int j=0;j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }System.out.println();
    }
    System.out.println(ml1);
    
    }
}
