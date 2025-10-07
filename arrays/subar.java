//find max subarray sum with k elements in their array (use siding window)
public class subar {
public static void maxsubarrsum(int numb[]){
    int maxsum=0;
    int x=2;
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numb[k]+" ");
                    sum+=numb[k];
                    if(maxsum<sum){
                       maxsum=sum;
                    }

                }System.out.println("||"+sum);        
                
            }
            System.out.println();
        }
        System.out.println(maxsum);
   }
   public static void subarr(int numb[]){
        int totsubarr=(numb.length*(numb.length+1))/2; //print no.of subarays....one more method
        int ts=0;
        System.out.println(totsubarr);
      for(int i=0;i<numb.length;i++){
        for(int j=i;j<numb.length;j++){
            for(int k=i;k<=j;k++){
                 System.out.print(numb[k]+" ");
            }ts++;
             System.out.println();
        }System.out.println();
      }
      System.out.println(+ts+"  subarrays number");
    }
    public static void main(String[]args){
     int arr[]=new int[]{100,200,300,400};
     
     subarr(arr);
    }
}
