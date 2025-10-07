import java.util.*;
class Strings{
    //print all letters and if conditions like vowels are there u can check
    public static void printletters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            
        }
    }
    //to print palindrome or not
    public static boolean palindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
             //not a palindrome
             return false;
            }
        }
        return true;
    }
    //to print shortest path
    public static void shorpath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            //north
            if(s.charAt(i)=='N'){
                x++;
            }
            //east
            else if(s.charAt(i)=='E'){
                y++;
            }       
            //west
            else if(s.charAt(i)=='W'){
                x--;
            }  
            //south
            else{
                y--;
            }

        }
        //to find distance
        double shortest_path = Math.sqrt((x*x)+(y*y));
        System.out.println(shortest_path);
    }
    public static void substri(String s,int si,int ei){
        for(int i=si;i<ei;i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void largstrlexicogr(String s1[]){
        String largest = s1[0];
        for(int i=0;i<3;i++){
         if(s1[i].compareTo(largest)>0){
            largest=s1[i];
         }}
         System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]= {'a','b','c','d'};
        String str="abcd";
        String str2=new String("abcd");
        /*System.out.println("only one word will get printed");
        String name=sc.next();
        System.out.println(name);*/
       /*  System.out.println("one ful line will get printed");
        String nline=sc.nextLine();
        System.out.println(nline);*/
        //String concatenation
        String firstname="Hello Woreld";
        String lastname="racecar";
        String fullname=firstname+" "+lastname;
        printletters(fullname);
        System.out.println();
        System.out.println(palindrome(lastname));
        String X="WNEENESENNN";
        shorpath(X);
        substri(firstname,0,7);
        /* if return type is string
        firstname.substri(0,8);*/
        String fruits[]={"apple","mango","banana"};
        largstrlexicogr(fruits);
        //StringBuilder TC=O{26)...if u use string and add u will get tc as O(n^2*26)
        StringBuilder sb = new StringBuilder("vinnnnn");//or empty string also u can put...u can print 1-z using string builder to reduce the tc as it doesnnt duplicate that everytime
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
      //to convert 1st letter of each word in a line to be uppercase
      String str1="i am vinugna koduri";
      StringBuilder sb1 = new StringBuilder("");
      char ch = Character.toUpperCase(str1.charAt(0));
      sb1.append(ch);
      int n=str1.length();
      for(int i=1;i<str1.length();i++){
        if(str1.charAt(i)==' ' && i<n-1){
          sb1.append(str1.charAt(i));
          i++;
          sb1.append(Character.toUpperCase(str1.charAt(i)));

        }
        else{
            sb1.append(str1.charAt(i));
        }
      }
      System.out.println(sb1);
    
    }
} 