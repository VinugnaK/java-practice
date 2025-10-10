class backtrack{
    public static void arrba(int arr[],int i,int val){
        //basecase
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recurssion
        arr[i]=val;
        arrba(arr, i+1, val+1);//function call
        arr[i]=arr[i]-2;//backtracking
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //find subets
    public static void subsets(String str,String ans,int i){
        //basecase
        if(i==str.length()){ 
            if(ans.length()==0){System.out.println("null");}
            System.out.println(ans);
            return;}
        //yes choice
        subsets(str, ans+str.charAt(i), i+1);
        //no choice
        subsets(str, ans, i+1);
    }
    //fingind permutations it means all possibilities

    public static void permu(String str,String ans){
        //basecase
        if(str.length()==0){System.out.println(ans);return;}
        //recursion
        for(int i=0;i<str.length();i++){
          char curr=str.charAt(i);
           
          //"abcde"=>"ab"+"de"="abde"
          String newstr=str.substring(0,i)+str.substring(i+1);

          permu(newstr, ans+curr);

        }
    }
    public static void main(String args[]){
        int arr[]=new int[5];
         arrba(arr, 0, 1);
         printarr(arr);
         //subsets
         String str="abc";
         subsets(str, "", 0);

         //permutation
         permu(str, "");

    }
}