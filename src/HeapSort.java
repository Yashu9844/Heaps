public class HeapSort {
    public static void Heapify(int arr[] , int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxId = i;


        if (left < size && arr[left] > arr[maxId]){
            maxId = left;
        }
        if (right < size && arr[right] > arr[maxId]){
            maxId = right;
        }
        if (maxId != i){
            int temp = arr[i];
            arr[i] = arr[maxId];
            arr[maxId] = temp;
            Heapify(arr,maxId,size);
        }
    }
    public static  void heapSort(int arr[]){
        int n =arr.length;
        for (int i=n/2;i>= 0 ;i--){
            Heapify(arr,i,n);
        }

        for (int i =n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] =temp;

            Heapify(arr,0,i); //here we are vomiting the maximum Element
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        heapSort(arr);
        for (int i =0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
