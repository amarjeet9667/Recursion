import java.util.ArrayList;
import java.util.Arrays;

//..............Bubble Sort............
class PracticeSortingAlgos{
    public static void  Bubblesort(int[] arr){
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

    //.................Selection Sort..............
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
            arr[minIndex] = arr[i+1];
            arr[i+1] = temp;
        }
    }


    //...........insersion sort.................
    public static void InsersionSort(int[] insersionArr){
        int n = insersionArr.length;
        for(int i = 1; i < n; i++){
            int current = insersionArr[i];
            int previous = i-1;
            while(previous >= 0 &&  insersionArr[previous] > current){
                insersionArr[previous + 1] = insersionArr[previous];
                previous--;
            }
            insersionArr[previous+1] = current;
        }
    }


    //..................merge sort..............
    public static void mergeSort(int[] arr, int st, int end){
        
        if(st < end){
            
            int mid = st + (end - st)/2;

            mergeSort(arr, st, mid);//Left side
            mergeSort(arr, mid+1, end);//Right side
            merge(arr,st,mid,end);
        }
    }

    private static void merge(int[] arr, int st, int mid,int end){

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
        while (i <= mid) {
            temp.add(arr[i]);
                i++;
        }

        while (j <= end) {
            temp.add(arr[j]);
                j++;
        }

        for(int ind = 0; ind < temp.size(); ind++){
            arr[ind + st] = temp.get(ind); 
        }
    }



    public static int ProductMaxThreeDigits(int[] sortedArray){
        int n = sortedArray.length;

        int product1 = sortedArray[0] * sortedArray[1] * sortedArray[n-1];
        int product2 = sortedArray[n-1] * sortedArray[n-2] * sortedArray[3];

        if(product1 > product2){
            return product1;
        }else{
            return product2;
        }
    }

    //............Quick Sort.....................

    public static void QuickSort(int[] arr, int st, int end){
        if(st<end){

            int pi = partition(arr, st, end);

            QuickSort(arr, st, pi-1); // left half
            QuickSort(arr, pi+1, end); // right half
        }
    }

    private static int partition(int[] arr, int st, int end){
        int pivit = arr[end];
        int index = st -1;// invalid state

        for(int j = st; j < end; j++){
            if(arr[j]< pivit){
                index++;//update invalid to valid state
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }

        }

        index++;

        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }




    public static void main(String[] arg){
        int[] list = {-30,-10,-20,-40,0,40,30,10,20};

        int[] copy1 = list.clone();
        Bubblesort(copy1);
        ProductMaxThreeDigits(copy1);
        System.err.println("Here is the result by bubble sort:- "+ Arrays.toString(copy1));
        System.err.println("Here is the Product by bubble sort:- "+ ProductMaxThreeDigits(copy1) + "\n");


        int[] copy2 = list.clone();
        SelectionSort(copy2);
        System.out.println("Here is the result of selection sort:- " + Arrays.toString(copy2));
        System.err.println("Here is the Product by selection sort:- "+ ProductMaxThreeDigits(copy2) + "\n");

        int[] copy3 = list.clone();
        InsersionSort(copy3);
        System.out.println("Here is the result of selection sort:- " + Arrays.toString(copy3));
        System.err.println("Here is the Product by selection sort:- "+ ProductMaxThreeDigits(copy3)+ "\n");

        int[] copy4 = list.clone();
        mergeSort(copy4,0, copy4.length-1);
        System.out.println("Here is the result of merge sort:- " + Arrays.toString(copy4));
        System.err.println("Here is the Product by merge sort:- "+ ProductMaxThreeDigits(copy4)+ "\n");

        int[] copy5 = list.clone();
        QuickSort(copy5,0, copy5.length-1);
        System.out.println("Here is the result of Quick sort:- " + Arrays.toString(copy4));
        System.err.println("Here is the Product by Quick sort:- "+ ProductMaxThreeDigits(copy5)+ "\n");
    }
}