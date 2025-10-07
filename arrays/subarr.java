class subarr{
    //pairs
    public static void pair(int numb[]){
     for(int i=0;i<numb.length;i++){
        int current=numb[i];
        for(int j=i+1;j<numb.length;j++){
          System.out.print("("+current+","+numb[j]+")");
        }System.out.println();
     }
    }
    //subarray
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
//sum of sub arrays
    public static void sumsubarr(int numb[]){
      for(int i=0;i<numb.length;i++){
        for(int j=i;j<numb.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum+=numb[k];
                 System.out.print(numb[k]+" ");
            }
            System.out.println("|||"+sum);
             System.out.println();
        }System.out.println();
      }
      
    }
//max sum of subarrays
   public static void maxsubarrsum(int numb[]){
    int maxsum=0;
        for(int i=0;i<numb.length;i++){
            for(int j=i;j<numb.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numb[k]+" ");
                    sum+=numb[k];
                    if(maxsum<sum){
                       maxsum=sum;
                    }
                }System.out.println("||"+sum);        
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxsum);
   }

//kadane's algo

public static void kadane(int numb[]){
    int cs=0;
    int ms=Integer.MIN_VALUE;
    for(int i=0;i<numb.length;i++){
        cs+=numb[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs, ms);
    }
    System.out.println(ms);
}
    public static void main(String[] args) {
        int numb []={-2,-3,4,-1,-2,1,5,-3};
        pair(numb);
        subarr(numb);
        sumsubarr(numb);
        maxsubarrsum(numb);
        kadane(numb);
    }
}