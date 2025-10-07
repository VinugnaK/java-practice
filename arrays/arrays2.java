import java.util.*;

class arrays2 {
   
    public static void search(int matrix[][], int key) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is there at position (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void spiral(int[][] matrix) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        System.out.println("Spiral Order:");
        while (startrow <= endrow && startcol <= endcol) {
            // Top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // Right column
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // Bottom row
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }

            // Left column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
            }

            // Move to inner layer
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        System.out.println(); // Line break after spiral output
    }
     //diagonal sum 
     //tc=o(n^2)
     public static void diagsum(int matrix[][]){
      int risum=0;
      int lesum=0;
      int totsum=0;
     if(matrix.length==matrix[0].length){
        //ryt diag sum
         for(int i=0;i<=matrix.length-1;i++) {
            for(int j=0;j<=matrix.length-1;j++){
                if(i==j){
                    risum+=matrix[i][j];  
                }
        //left diag sum
               else if((i+j)==matrix.length-1){
                    lesum+=matrix[i][j];  
                }
            } 
         }System.out.println(risum);
         System.out.println(lesum);
          System.out.println("diagsum= "+(risum+lesum));

        
     }
     //tc:o(n)
     int sum=0;
     for(int i=0;i<matrix.length;i++){
        //pd
        sum+=matrix[i][i];
        //sd
        if(i!=matrix.length-i-1)
        sum+=matrix[i][matrix.length-1-i];
     
    
    } System.out.println(sum);
     
     
     }

     public static boolean staicasesearch(int[][]matrix){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key to search using staircasr sort");
        int key=sc.nextInt();
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at  "+ (row+1) +","+ (col+1));
                return true;
            }
            else if(key<matrix[row][col]){
              col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        //size of matrix user input
        System.out.println("enter row size");
        int row=sc.nextInt();
          System.out.println("enter col size");
        int col=sc.nextInt();
        // Creation and insertion of elements
        int[][] matrix = new int[row][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral print
        spiral(matrix);
        diagsum(matrix); 
        // Search element
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        search(matrix, key);
        //staircase search
        staicasesearch(matrix);
        // Print full matrix
        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
