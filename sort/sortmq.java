class sortmqq{
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){return;}
     int mid=si+(ei-si)/2;
     mergesort(arr,si,mid);
     mergesort(arr,mid+1,ei);
     merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void qc(int []arr,int si,int ei){
        if(si>=ei) return;
       int pidx=partition(arr,si,ei);
       qc(arr,si,pidx-1); //left
       qc(arr,pidx+1,ei) ; //ryt
    }
 
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
 for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
      return i;
    }

    public static int searchrotatedarray(int arr[],int target,int si,int ei){
        //base case
        if(si>ei) return -1;
        //calculate mid
        int mid=si+(ei-si)/2;
        //bst case
        if(arr[mid]==target) return mid;
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a:Left
            if(arr[si]<=target && target<=arr[mid]){
                return searchrotatedarray(arr, target, si, mid-1);
            }
            else{
                //case b:ryt side
                return searchrotatedarray(arr, target, mid+1, ei);
            }
        }
        //mid on linre 2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                //case c ryt side
                return searchrotatedarray(arr, target, mid+1, ei);
            }
            else{
                //case d left side
                return searchrotatedarray(arr, target, si,mid-1);
            }
        }
        
    }
    public static void main(String[] args) {
    int arr[]={16,4,3,2,44,7,90};
    mergesort(arr,0,arr.length-1);
    printarr(arr);
    qc(arr,0,arr.length-1);
    System.out.println(" ");
    printarr(arr);
    int arr1[]={4,5,6,7,0,1,2};
    int target=0;
    int targid=searchrotatedarray(arr1, target, 0, arr1.length-1);
    System.out.println(" ");
    System.out.println(targid);

    }
}