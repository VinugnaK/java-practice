package gways;
public class gridways {
    public static int gridway(int i,int j,int n,int m){
      //basecase
      if(i==n-1 && j==m-1){
        return 1;
      }
      else if(i==n||j==m){//handling boundary case
        return 0;
      }

      int w1=gridway(i+1, j, n, m);
      int w2=gridway(i, j+1, n, m);
      return w1+w2;
    }

    public static int usingpermform(int n,int m){
      int sol=(fact(n-1+m-1))/(fact(n-1)*(fact(m-1)));
      return sol;
    }

    public static int fact(int n){
      if(n==0||n==1){return n;}
      return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=3;int m=4;
        System.out.println(gridway(0,0,n,m));
        System.out.println(usingpermform(n, m));
    }
}
