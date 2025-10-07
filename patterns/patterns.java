
public class patterns {


  public static void basic(int n){
    /* ****
       ****
       ****
       ****  */
     for(int i=0;i<=n;i++){
      for(int j=0;j<=n;j++){
        System.out.print("*");
      }System.err.println();
     }
  }

  public static void ryt(int n){
    /* *
       * *
       * * *
       * * * * 
     */
    for(int i=1;i<=n;i++){

      for(int j=1;j<=i;j++){
        System.out.print("*");
      }System.out.println();
    }
  }

  public static void revryt(int n){
    /* 
      * * * *
       * * *
       * *
       * 
     */
    for(int i=n;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }System.out.println();
    }
  }

  public static void half1(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
      }System.out.println();
    }
  }

  public static void char1(int n){
    char x='A';
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(x+" ");
        x++;
      }System.out.println();
    }
  }

  public static void holrect(int n,int m){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(i==1||j==1||i==n||j==m){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }System.out.println();
    }
  }
  public static void rytpy(int n){

    for(int i=1;i<=n;i++){
     for(int j=1;j<=n-i;j++){
      System.out.print(" ");
     }
     for(int j=1;j<=i;j++){
      System.out.print("*");
     }System.out.println();
    }
  }
  public static void inv1(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i+1;j++){
        System.out.print(j);
      }System.out.println();
    }
  }
  public static void triang01(int n){
    for(int i=1;i<=n;i++){
      for(int j=0;j<=i;j++){
        if((i%2==0&&j%2==0)||(i%2!=0&&j%2!=0)){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      }System.out.println();
    }
  }
  public static void floyd(int n){
    int count=0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        count++;
        System.out.print(count+" ");

      }System.out.println();
    }
  }
  public static void butterfly(int n){
    //crt
    for(int i=0;i<=n;i++){
      //stars
       for(int j=0;j<=i;j++){
        System.out.print("*");
       }

      //spaces
      for(int j=0;j<=2*(n-i);j++){
        System.out.print(" ");
      }
 
      //stars
      for(int j=0;j<=i;j++){
        System.out.print("*");
       }System.out.println();
    }
    //inverted
    for(int i=n;i>=1;i--){
      //stars
       for(int j=0;j<=i;j++){
        System.out.print("*");
       }

      //spaces
      for(int j=0;j<=2*(n-i);j++){
        System.out.print(" ");
      }
 
      //stars
      for(int j=0;j<=i;j++){
        System.out.print("*");
       }System.out.println();
    }

  }

  public static void solrhom(int n){
    for(int i=1;i<=n;i++){
      //spaces
      for(int j=0;j<=n-i;j++){
        System.out.print(" ");
      }
      //stars
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }System.out.println();
    }
  }
  public static void hol_rhom(int n){
    for(int i=1;i<=n;i++){
      //spaces
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        if(i==1||j==1||j==n||i==n){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }System.out.println();
    }
  }
  public static void main(String[] args) {
    basic(3);  
    ryt(3);
    revryt(3);
    half1(4);
    char1(4);
    holrect(10,7);
    rytpy(5);
    inv1(5);
    triang01(4);
    floyd(5);
    butterfly(3);
    solrhom(6);
    hol_rhom(4);
  }
}
