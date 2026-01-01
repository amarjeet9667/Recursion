import java.util.ArrayList;
import java.util.Arrays;

class Sorting_Practice2{
//1......Bubble sort............
    public static void BubbleSort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


//2................selection sort...........
    public static void SelectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j= i+1; j < n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

//3.................Insersion soert.............
    public static void InsersionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int current = arr[i];
            int previous = i-1;

            while(previous >= 0 && arr[previous] >= current){
                    arr[previous+1] = arr[previous];
                    previous--;
                
            }
            arr[previous+1] = current;
        }
    }

//4...........Merge Sort.............
    public static void MergeSort(int[] arr, int st, int end){
        if(st < end){
            int mid = st + (end-st)/2;

            MergeSort(arr, st, mid);
            MergeSort(arr, mid+1, end);
            merge(arr,st,mid,end);
        }
    }

    private static void merge(int[] arr, int st, int mid, int end){

        ArrayList<Integer> temp = new ArrayList<>();
        int i = st; int j = mid+1;

        while (i <= mid && j <= end) {

            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
            
        }

        while (i<= mid) {

            temp.add(arr[i]);
                i++;
            
        }

        while (j <= end) {

            temp.add(arr[j]);
                j++;
        }

        for(int index = 0; index < temp.size(); index++){
            arr[st+index] = temp.get(index);
        }
    }

//5..................Quick Sort.............
    public static void QuickSort(int[] arr, int st, int end){
        if(st <= end){
            int pi = partition(arr,st,end);

            QuickSort(arr,st,pi-1);//Left Half
            QuickSort(arr, pi+1, end);
        }
    }

    private static int partition(int[] arr, int st, int end){

        int pivit = arr[end];
        int index = st-1;

        for(int j = st; j < end; j++){
            if(arr[j] < pivit){
                index++;
                int temp = arr[index];
            
                arr[index] = arr[j];
                arr[end]=temp;
            }
        }

        index++;
        int temp = arr[index];
            
                arr[index] = arr[end];
                arr[end]=temp;

        return index;
    }





    //..................Main Method............
    public static void main(String[] arg){
        int[] list = {-50,-10,-40,-20,-30,0,50,10,40,30,20};

        int[] copy1 = list.clone();
        BubbleSort(copy1);
        System.out.println("Here is the Bubble sort result:- " + Arrays.toString(copy1) + "\n");

        int[] copy2 = list.clone();
        SelectionSort(copy2);
        System.out.println("Here is the Selection sort result:- " + Arrays.toString(copy2) + "\n");

        int[] copy3 = list.clone();
        InsersionSort(copy3);
        System.out.println("Here is the Insertion sort result:- " + Arrays.toString(copy3) + "\n");

        int[] copy4 = list.clone();
        MergeSort(copy4,0,copy4.length-1);
        System.out.println("Here is the Merge sort result:- " + Arrays.toString(copy4) + "\n");

        int[] copy5 = list.clone();
        QuickSort(copy5,0,copy5.length-1);
        System.out.println("Here is the Quick sort result:- " + Arrays.toString(copy5) + "\n");
    }
}