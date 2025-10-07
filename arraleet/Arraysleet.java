
import java.util.Arrays;
public class Arraysleet{
    //i/p=[2,3,4,5],target=7,o/p=[1,2]
    public static void twosum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("["+i+" "+j+"]");
                }
            }
        }
    }
    public static double med(int arr1[],int arr2[]){
        //merging 2 arrays and then sorting and then finding median
        int n1= arr1.length;
        int n2=arr2.length;
        int n3=n1+n2;
         double median;
        int merged[]=new int[n3];
        //merging
      for(int i=0;i<n1;i++){
        merged[i]=arr1[i];
      }
      for(int j=0;j<n2;j++){
        merged[j+n1]=arr2[j];
      }
//sorting
      Arrays.sort(merged);
//median
      if((n3%2)==0){
      median=(merged[n3/2]+merged[(n3/2)-1])/2.0;
      }
      else{
         median=merged[n3/2];
      }

        return median;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,2,4,3,2,1};
        int arr1[]=new int[]{1,2,3,4};
        int arr2[]=new int[]{5,6,7,8};
        twosum(arr,4);
        System.out.println(med(arr1,arr2));
    }
}
