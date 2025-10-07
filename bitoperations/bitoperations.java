class bitoperations{
    public static void odev(int x){
      //to check if a number is odd or even
        if((x&1)==0){
          System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    
    public static int ibit(int y,int i){
      int bitmask=1<<i;
      if((y&bitmask)==0){
        System.out.println("is 0");
      }
       else{
        System.out.println("is 1");
       }
       return y&bitmask;
    
    }
    //to set ith bit
    public static void sibit(int z,int i){
     
     int n=z|(1<<i);
     System.out.println(n);
    }
    //to clear ith bit
    public static void cbit(int n,int i){
      int bitmask=~(1<<i);
      int x=(n)&(bitmask);
    System.out.println(x);
    }
    //to update ith bit call clear+set
  public static int updibit(int n, int i, int newno) {
    n = n & ~(1 << i);          // Clear the bit at position i
    return n | (newno << i);    // Set it to newno (0 or 1)
}
//to clear last i bits
public static int cleibite(int n,int i){
 return n& (~0)<<i;
}
//to clear range of bits
public static int clrani(int n,int i,int j){
int a=(~0)<<(j+1);
int b=(1<<i)-1;
return n&(a|b);
}
//to tell whether a number is power of 2 or not
public static boolean ispower2(int n){
  if((n&(n-1))==0){
    return true;
  }
  else{
    return false;
  }
  //or
  //return (n&(n-1))==0;
}
//to check the number of setbit
public static void setbit(int n){
int count=0;
while(n>0){
  if((n&1)!=0){
   count++;
  }
  n=n>>1;
}
System.out.println(count);
}
//fast exponential i.e o(logn)
public static long fastexpo(int a, int n) {
    int ans = 1;

    while (n > 0) {
        if ((n & 1) != 0) {
            ans = ans * a;
        }
        a = a * a;
        n = n >> 1;
    }
    return ans;
}
//swapping without 3rd var
public static void swap(int a, int b) {
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
}


    public static void main(String[] args) {
        //bitwise and
        System.out.println(5&6);
        //bitwise or
        System.out.println(5|6);
        //bitwise XOR
        System.out.println(5^6);
        ////bitwise binary ones complement
        System.out.println(~6);
        System.out.println(~0);
        //binary left shift
        System.out.println(5<<2);
        //binary right shift
        System.out.println(6>>1);
        int x=19;
        odev(x);
        //to find ith bit
        ibit(10111111,6);
        // to set ith bit to 1
        sibit(10,2);
       //to clear ith bit to 0
       cbit(10,1);
       System.out.println(updibit(10, 2, 1));
       System.out.println(cleibite(15, 2));
       System.out.println((~0)<<11);
       System.out.println(clrani(10,2,4));
       System.out.println(ispower2(14));
       setbit(4);
       System.out.println(fastexpo(3, 6));  // Expected: 243
       swap(3,4);
    
         
       int p=6;
       System.out.println(p+" + "+1+" is "+-~p);
       p= -4;System.out.println(p+" + "+1+" is "+-~p);
       p=0;System.out.println(p+" + "+1+" is "+-~p);
       
           //converts all letters to lowercase
       for(char ch='A';ch<='Z';ch++)
        {System.out.println((char)(ch|' '));// prints abcdefghijklmnopqrstuvwxyz
        }
    }
}