public class arrays {

    public static int linearsear(int numbers[],int key){
        //linear search TC:O(N)
      for(int i=0;i<numbers.length;i++){
        if(key==numbers[i]){
            System.out.println(i);
            return i;
        }
      }return -1;
    }
 
     //largest number in an array
    public static int largno(int numbers[],int y,int smallest){
      for(int i=0;i<numbers.length;i++){
        if(numbers[i]>y){
            y=numbers[i];
        }
        if(numbers[i]<smallest){
            smallest=numbers[i];
            
        }
        
      }System.out.println("smallest value is"+smallest);
      return y;
    }

    //binary search
    public static int binsear(int numbers[],int key){
      int start=0;int end=numbers.length-1;
      
        while(start<=end){
            int mid=(start+end)/2;                  
            if(numbers[mid]==key){
                System.out.println(mid);
            }
            if(key>numbers[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
          }return -1;
      
      
    }
    public static void main (String args[]){
     int numbers[]={2,4,6,8,10,12,14,16};
     //linear search
     int key=8;
    int x=linearsear(numbers,key);
    if(x==-1){
        System.out.println("not found");
    }
    //larg&small no in array
    int y=Integer.MIN_VALUE;//-infinity
    int smallest=Integer.MAX_VALUE;

    int z = largno(numbers, y,smallest);
    System.out.println(z);
    binsear(numbers,key);
}
}