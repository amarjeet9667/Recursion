import java.util.*;
import java.util.Arrays;
import java.util.Vector;
// import java.util.HashMap;

// class Demo{
//     public int[] nums = {3,2,4};
//     int target = 6;
//     public int[] twoSum(int[] num, int target){
//         HashMap<Integer, Integer> seen = new HashMap<> ();

//         for(int i = 0; i < num.length; i++){
//             int complemet = target - num[i];

//             if(seen.containsKey(complemet)){
//                 return new int[] {seen.get(complemet),i};
//             }
//             seen.put(num[i],i);
//         }

//     return new int[]{};
// }

//     public static void main(String[] arg){
//         Demo demo = new Demo();
//         int[] result = demo.twoSum(demo.nums,demo.target);
//         System.out.println("Here is the result:- [" + result[0] + " , "+ result[1] +  "],");
//     }

// }

//...............Bubble sort..........
// class BubbleSort{

//     int[] sortingArrays(int[] arr){
//         int n = arr.length;

//         for(int i = 0; i < n-1; i++){
//             for(int j = 0; j < n - i - 1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         return arr;
//     }

//     public static void main(String[] arg){
//         int[] list = {-10,-50,-30,-20,-40,0,50,20,30,10,40};

//         BubbleSort sorter = new BubbleSort();
//         int[] sortArray = sorter.sortingArrays(list);
//         System.out.println("Here is the sorted array:- " + Arrays.toString(sortArray));
//     }
// }

//............selection sort...........
// class SortingAlgorithm{
//     int[] selectionSortMethod(int[] arr){
//         int n = arr.length;
//         for(int i = 0; i < n -1; i++){
//             int minIndex = i;
//             for(int j = i+1; j < n; j++){
//                 if(arr[minIndex] > arr[j]){
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;
//         }
//         return arr;
//     }

//     public static void main(String[] arg){
//         int[] list = {-1,-6,0,20,-17};

//         SortingAlgorithm sorter = new SortingAlgorithm();
//         int[] result = sorter.selectionSortMethod(list);
//         System.out.println("Here is the sorted array:- " + Arrays.toString(result));
//     }
// }

//..............production of array.........

// class ProductionOfArray{

//     int[] sortingAlgorithm(int[] arr){
//         int n = arr.length;
//         for(int i = 0; i < n-1; i++ ){
//             for(int j = 0; j < n-i-1; j++) {

//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }

//         return arr;
//     }

//     int productlogic(int[] sortedArray){
//         int length = sortedArray.length; 
//         int production1 = sortedArray[0] * sortedArray[1]* sortedArray[length-1];
//         int production2 = sortedArray[length - 1] * sortedArray[length - 2] * sortedArray[length - 3];

//         if(production1 > production2){
//             System.out.println("I am Production one:- " + production1);
//             return production1;

//         }else{
//             System.out.println("I am Production2:- " + production2);
//             return production2;
//         }

//     }

//     public static void main(String[] arg){
//         int[] list = {-10,-5,-20,-10,0,10,20,50};

//         ProductionOfArray product = new ProductionOfArray();
//         int[] sorted = product.sortingAlgorithm(list);
//         int result = product.productlogic(sorted);
//         System.out.println("Here is the product of three elements:- " + result);
//     }
// }

// //........Bubble sort 30/05/2025............
// class BubbleSortAlgorithm{

//     int[] sortingLogic(int[] arr){
//         int n = arr.length;
//         for(int i = 0; i < n  - 1; i++){
//             for(int j = 0; j < n - i - 1; j++){

//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];

//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }

//         }

//         return arr;
//     }

//     public static void main(String[] arg){
//         int[] list = {-4,-1,-5,-3,-2,0,5,2,4,3,1};
//         BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();

//         int[] sorted = bubbleSort.sortingLogic(list);
//         System.out.println("Here is sorted array with bubble sort algorithm:- " + Arrays.toString(sorted));

//     }
// }

//............selection sort 30/05/2025.............
// class SelectionSortAlgorithm{

//     int[] selectionSortMethod(int[] arr){
//         int n = arr.length;
//         for(int i = 0; i < n - 1; i++){
//             int minIndex = i;

//             for(int j = i+1; j < n; j++){
//                 if(arr[minIndex] > arr[j]){
//                     minIndex = j;
//                 }

//             }
//             int temp = arr[minIndex];

//                 arr[minIndex] = arr[i];
//                 arr[i] = temp;
//         }
//         return arr;
//     }

//     public static void main(String[] arg){
//         int[] list = {-4,-1,-5,-3,-2,0,5,2,4,3,1};

//         SelectionSortAlgorithm selectionSort = new SelectionSortAlgorithm();
//         int[] sorted = selectionSort.selectionSortMethod(list);
//         System.out.println("Here is the sorted arrya:- " + Arrays.toString(sorted));
//     }
// }

//..........Insertion sort 31/05/2025............
// class InsertionSortAlgorithm{

//     int[] insertionSortMethode(int[] arr){

//         int n = arr.length;

//         for(int i = 1; i < n; i++){
//             int current = arr[i];
//             int prev = i - 1;

//             while(prev >= 0 && arr[prev] > current){

//                 arr[prev + 1] = arr[prev];
//                 prev--;

//             }

//             arr[prev + 1] = current;
//         }

//         return arr;
//     }

//     public static void main(String[] arr){
//         int[] list = {-4,-1,-5,-3,-2,0,5,2,4,3,1};

//         InsertionSortAlgorithm insertion = new InsertionSortAlgorithm();
//         int[] sorted = insertion.insertionSortMethode(list);
//         System.out.println("Here is the sorted array:- " + Arrays.toString(sorted));
//     }
// }

//..............practice...........
// class InsertionSortAlgo{

//     int[] inserTionSortLogic(int[] arr){

//         int n = arr.length;

//         for(int i = 1; i < n; i++){
//             int curr = arr[i];
//             int prev = i - 1;

//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev + 1] = arr[prev];
//                 prev--;

//             }

//             arr[prev + 1] = curr;
//             System.out.println("Here is the every itration of sorted list:- " + Arrays.toString(arr));
//         }
//         return arr;
//     }

//     public static void main(String[] arg){
//         int[] list = {5, 2, 4, 6, 1, 3};

//         InsertionSortAlgo insertion = new InsertionSortAlgo();
//         int[] sorted = insertion.inserTionSortLogic(list);
//         System.out.println("Here is the sorted list:- " + Arrays.toString(sorted));
//     }
// }

//.................common method............
class sortingAlgorithm {

    // .............Bubble sort...........
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];

                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // .................selection sort...........

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // .....................Insertion sort...............

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int previous = i - 1;

            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;

        }
    }

    // .............Merge sort....................
    public static void mergeSort(int[] arr, int st, int end) {

        if (st < end) {
            int mid = st + (end - st) / 2;

            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, st, mid, end);
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

        while (i <= mid) {
            temp.add(arr[i]);
                i++;
        }
        while (j <= end) {
            temp.add(arr[j]);
                j++;
        }

        for(int ind = 0; ind < temp.size(); ind++){
            arr[ind+st] = temp.get(ind);
        }
        
    }

    // ...........................Main method......................
    public static void main(String[] arg) {

        int[] list = { 5, 2, 3, 6, 4, 1, 0, -3, -2, -1 };

        int[] copy1 = list.clone();
        bubbleSort(copy1);
        System.out.println("Here is the bubble sorted array:- " + Arrays.toString(copy1));

        int[] copy2 = list.clone();
        selectionSort(copy2);
        System.out.println("Here is the sorted selectionsort:- " + Arrays.toString(copy2));

        int[] copy3 = list.clone();
        selectionSort(copy3);
        System.out.println("Here is the sorted InsertionSort:- " + Arrays.toString(copy3));

        int[] copy4 = list.clone();
        mergeSort(copy4,0,copy4.length-1);
        System.out.println("Here is the sorted Mergesort:- " + Arrays.toString(copy4));

    }
}