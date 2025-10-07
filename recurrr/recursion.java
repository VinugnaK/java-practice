public class recursion{
//print ele in decresing oeder
    public static void printdec(int n){//f(n)=n+f(n-1)
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);

    }
//print ele in increasing order
    public static void printinc(int n){//f(n)=f(n-1)+n
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
        

    }
//factorial
    public static int factorial(int n){
        if(n==0){
            return 1;}
        int fn=n*factorial(n-1);
        return fn;

    }
// sum of n numbers
    public static int sumfn(int n){
        if(n==1){
           return 1;
        }
        int sum=n+sumfn(n-1);
        return sum;
    }
    //print n fibanocci series
    public static int fib(int n){
        if(n==0){
            return 0;
        }
         if(n==1){
            return 1;
        }
        int fin= fib(n-1)+fib(n-2);
        return fin;
    }

    //check if a given array is sorted or not
    public static boolean issor(int arr[],int i){
        if(i==arr.length-1){return true;}
        if(arr[i]>arr[i+1]){return false;}
            return issor(arr,i+1);
       
    }
    //first occurance of an element in an array
    public static int occe(int arr[],int i,int key){
       if(i==arr.length){return -1;}
       if(key==arr[i]){return i;}
       return occe(arr,i+1,key);

    }
    //last occurance of an element in an array
    public static int locce(int arr[],int key){
        int i=arr.length-1;
        if(i==0){return -1;}
       if(key==arr[i]){return i;}
       return occe(arr,i-1,key);

    }
    //to print power(x*power(x,n-1)) O(N)
    public static int power(int x,int n){
        if(n==0){return 1;}
      return x*power(x,n-1);
    }
    //power with less tcO(LOGN)
    public static int pow(int x,int n){
        if(n==0){return 1;}
        int hp=pow(x,n/2);
        int hpsq=hp*hp;
        if(n%2==0){ return hp*hp;}
        if(n%2!=0){return x*hp*hp;}
        return hp;

    }

    //tailing problem
    public static int taillingprblm(int n){
        if(n==1||n==0){return 1;}
        return taillingprblm(n-1)+taillingprblm(n-2);
    }

    //removing duplicates in a string using recursion
   public static String remdup(String str, int idx, StringBuilder newstr, boolean map[]) {
    if (idx == str.length()) {
        return newstr.toString();
    }

    char currchar = str.charAt(idx);

    if (map[currchar - 'a']==true) {
        return remdup(str, idx + 1, newstr, map);
    } else {
        map[currchar - 'a'] = true;
        return remdup(str, idx + 1, newstr.append(currchar), map);
    }
}
//friends pairing problem
 public static int friendpair(int n){
    if(n==1||n==2){return n;}
    return friendpair(n-1)+(n-1)*friendpair(n-2);
 }
 //binary strings prblm
 public static void bistpr(int n,int lastplace,String str){
    if(n==0){System.out.println(str);return;}
    if(lastplace==0){
        bistpr(n-1,0,str+"0");
        bistpr(n-1,1, str+"1");
    }
    else{
       bistpr(n-1, 0, str+"0");
    }
    
 }
 public static void mergesort(int arr[],int si,int ei){
    if(si>=ei){return;}
    int mid=si+(ei-si)/2;
    mergesort(arr, si, mid);
    mergesort(arr,(mid+1),ei);
    merge(arr,si,mid,ei);


 }

 public static void merge(int arr[],int si,int mid ,int ei){
    int temp[]=new int[ei-si+1];
    int i=si;//left
    int j=mid+1;//ryt
    int k=0;//temp array pointer
   
    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            k++;i++;
        }
        else{
            temp[k]=arr[j];
            k++;j++;
        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }

  
 }
 public static void printarr(int arr[]){
  for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
      
  }
 }

    public static void main(String[] args) {
        printdec(10);
        printinc(10);
        System.out.println(factorial(3));
        System.out.println(sumfn(8));
        System.out.println(fib(6));
        int arr[]=new int[]{2,3,9,5,6,-3,8};
        System.out.println(issor(arr, 0));
        System.out.println(occe(arr, 0, 3));
        System.out.println(locce(arr, 3));
        System.out.println(power(2,4));
         System.out.println(pow(2,4));
         System.out.println(taillingprblm(4));
         String str="aaappppppssss";
         System.out.println(remdup(str, 0, new StringBuilder(""), new boolean[26]));
         System.out.println(friendpair(3));
         bistpr(3,0,"");

         mergesort(arr, 0, arr.length-1);
         printarr(arr);

}

}