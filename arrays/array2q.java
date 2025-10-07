
import java.util.Scanner;

class array2q{
    //to see how  many times a number is repeated in a 2d array
    public static void numbrepest(int[][]arr,int key,int row,int col){
        int count=0;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           if(arr[i][j]==key){
            count++;
           }
        }
     }
     System.out.println(key+" is repeated "+count+" times");
    }
    public static void sumsecrow(int [][]nums){
        int sum=0;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            if (i==1) {
               sum+=nums[i][j]; 
            }
        }
      }
      System.out.println("sum of 2nd row is"+sum);
    }
    public static void transpose(int [][] nums){
        int xyz[][]=new int[nums[0].length][nums.length];
        for(int i=0;i<xyz.length;i++){
            for(int j=0;j<xyz[0].length;j++){
                xyz[j][i]=nums[i][j];
            }
        }

        System.out.println("Transposed matrix");

        for(int i=0;i<xyz.length;i++){
            for(int j=0;j<xyz[0].length;j++){
                System.out.print(xyz[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //sum of 2nd row
        int[][] nums = { {1,4,9},{11,5,3},{2,0,3} };
        sumsecrow(nums);
        //transpose of a matrix
        transpose(nums);
        //no of rows and col
        System.out.println("enter no of rows");
        int row=sc.nextInt();
        System.out.println("enter no of cols");
        int col=sc.nextInt();

        // creation of 2d array
        int arr[][]=new int[row][col];

        //insertion of elements
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element to know how many times it is repeated");
        int key=sc.nextInt();
        numbrepest(arr, key, row, col);
    }
}