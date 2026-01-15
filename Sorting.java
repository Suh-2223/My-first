public class Sorting {
    public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
    
//BUBBLE SORT(Compares the alternate alements & swap them if they are not in order)
  public static void main(String[] args) {
      int arr[]={5,4,1,3,2};
    for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
    //swap
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
    }
    }
    printArr(arr);
  }
}

//SELECTION SORT(Select the smallest element & swap with first element)
public static void main(String[] args) {
    int arr[]={7,4,1,3,2};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
        for(int j=i+1;j<arr.length;j++){
    if(arr[smallest]>arr[j]){
        smallest=j;
    }}
    int temp=arr[smallest];
    arr[smallest]=arr[i];
    arr[i]=temp;
        }
        printArr(arr);
      }
    }

//INSERTION SORT(It picks elements from unsorted array & place it at correct position in sorted array)
public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    for(int i=1;i<arr.length;i++){ //unsorted array
        int current=arr[i];
        int j=i-1; //last part of sorted array
        while(j>=0 && arr[j]>current){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }
    printArr(arr);

//tc: O(n^2) in worst & average case
 
//RECURSION
public static void printNum(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printNum(n-1);
}
public static void main(String[] args) {
    int n=5;
    printNum(n);
}
}
public static void printNum(int n){
    if(n==6){
        return;
    }
    System.out.println(n);
    printNum(n+1);
}
public static void main(String[] args) {
    int n=1;
    printNum(n);
}
}
public static void printSum(int i,int n,int  sum){
    if(i==n){
        sum=sum+i;
        System.out.println(sum);
        return;
    }
    sum=sum+i;
    printSum(i+1,n,sum);}
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
public static int printFact(int n){
    if(n==0||n==1){
        return 1;}
         int a=printFact(n-1);
        int fact=n*a;
        return fact;
    }
   public static void main(String[] args) {
       int n=5;
printFact(n);
System.out.println(printFact(n));
   }
}
//fibonacci sequence
    public static void printfib(int a/*(2nd last element)*/,int b/*(last element)*/,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;//no of elements after 0 &1
        printfib(a,b,n-2);//its n-2 becoz 0 and 1 is already define in fibonacci sequence
    }
}

//MERGE SORT(divides the array into 2 halves until single element is left & then merges them in sorted order)
public static void conquer(int arr[],int si,int mid,int ei){
    int merged[]=new int[ei-si+1];
    int index1=si;
    int index2=mid+1;
    int x=0;
    while(index1<=mid && index2<=ei){
        if(arr[index1]<=arr[index2]){
            merged[x++]=arr[index1];
        }else{
            merged[x++]=arr[index2];
        }
    }
    while(index1<=mid){
        merged[x++]=arr[index1++];
    }
    while(index2<=ei){
        merged[x++]=arr[index2++];
    }
    for(int i=0,j=si;i<merged.length;i++,j++){
        arr[j]=merged[i];
    }
}
public static void divide(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    conquer(arr,si,mid,ei);
}
public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    int n=arr.length;
    divide(arr,0,n-1);
    for (int i = 0; i<n; i++) {
        System.out.println(arr[i]+"");
    }
    System.out.println();
}
}
//tc: O(nlogn) in all cases

//QUICK SORT(here we see the pivot element and see if the no issmaller(left side) or larger(right side) than pivot element and place them accordingly)
public static int partition(int arr[],int low,int high){
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    return i;
}
public static void quickSort(int arr[],int low,int high){
    if(low<high){
        int pidx=partition(arr,low,high);
        quickSort(arr,low,pidx-1);
        quickSort(arr,pidx+1,high);
    }
}
public static void main(String[] args) {
    int arr[]={5,4,9,3,2};
    int n=arr.length;
    quickSort(arr,0,n-1);
    for (int i = 0; i<n; i++) {
        System.out.println(arr[i]+"");
    }
   System.out.println();
} }
//tc: O(nlogn) in average case & O(n^2) in worst case(occurs pivot is always the smallest or largest element)
//tc: O(nlogn) in average case & O(n^2) in worst case(occurs pivot is always the smallest or largest element)
