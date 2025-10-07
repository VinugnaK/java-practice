class sort{
    public static void bubblesort(int arr[]){
        int n=arr.length;
      for(int turn=0;turn<n-1;turn++){
          for(int j=0;j<n-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
          }
      }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }System.out.println();
    }

    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int minele=i;
            for(int j=i+1;j<=n-1;j++){
             if (arr[minele]>arr[j]) {
                minele=j; 
             }
            }
            int temp=arr[minele];
            arr[minele]=arr[i];
            arr[i]=temp;

        }
    }
    public static void insertionsort(int arr[]){
        for (int i=1;i<arr.length;i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
             arr[prev + 1] = curr;
        }
    }

    public static void countingsort(int arr[]){
        int largest =Integer.MIN_VALUE;

        // to find largest
         for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
         }

        // to count how many times repeated from 0 to n+1
        int count[]=new int[largest+1];    
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting them based on algo
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                count[i]--;
                arr[j]=i;
                j++;
                
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[]={5,4,7,2,1};
        selectionsort(arr);print(arr);
        
    }
}   