public class RoughWork {

    // public static void bubbleSort(int[] arr){
    // for(int i = 0; i < arr.length - 1; i++){
    // boolean swapped = false;
    // for(int j = 0; j < arr.length - i - 1; j++){
    // if(arr[j] > arr[j+1]){
    // int temp = arr[j+1];
    // arr[j+1] = arr[j];
    // arr[j] = temp;
    // swapped = true;
    // }
    // if(!swapped)break;
    // }
    // }

    // for(int i = 0; i < arr.length; i++){
    // System.out.print(arr[i] +" ");
    // }
    // }

    // public static void selectionSort(int[] arr){
    // for(int i = 0; i < arr.length - 1; i++){
    // int smallest = i;

    // for(int j = i+1; j < arr.length; j++){
    // if(arr[i] > arr[j]){
    // smallest = j;
    // }
    // }
    // int temp = arr[smallest];
    // arr[smallest] = arr[i];
    // arr[i] = temp;
    // }

    // for(int i = 0; i < arr.length; i++){
    // System.out.print(arr[i] +" ");
    // }
    // }

    // public static void insertionSort(int[] arr){
    // for(int i = 1; i < arr.length; i++){
    // int current = arr[i];
    // int j = i - 1;

    // while (j >= 0 && arr[j] >= current) {
    // arr[j+1] = arr[j];
    // j--;
    // }
    // arr[j+1] = current;
    // }
    // for(int i = 0; i < arr.length; i++){
    // System.out.print(arr[i] +" ");
    // }
    // }

    // public static void main(String[] arg){
    // int[] arr = {8,7,5,3,1,2,4,6};
    // System.out.println("Here is Bubble Sorting:- ");
    // bubbleSort(arr);
    // System.out.println();
    // System.out.println("Here is selection Sorting:- ");
    // selectionSort(arr);
    // System.out.println();
    // System.out.println("Here is Insertion Sorting:- ");
    // insertionSort(arr);
    // }

    // -------------Merge Sort-------------

        public static void divide(int[] arr, int si, int ei) {
            if (si >= ei) {
                return;
            }

            int mid = si + (ei - si) / 2;
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }

        public static void conquer(int[] arr, int si, int mid, int ei) {
            int[] merge = new int[ei - si + 1];

            int idx1 = si;
            int idx2 = mid + 1;
            int idxM = 0;

            while (idx1 <= mid && idx2 <= ei) {
                if (arr[idx1] <= arr[idx2]) {
                    merge[idxM++] = arr[idx1++];
                } else {
                    merge[idxM++] = arr[idx2++];
                }
            }

            while (idx1 <= mid) {
                merge[idxM++] = arr[idx1++];
            }

            while (idx2 <= ei) {
                merge[idxM++] = arr[idx2++];
            }

            for (int i = 0, j = si; i < merge.length; i++, j++) {
                arr[j] = merge[i];
            }
        }

        public static void main(String[] args) {
            int[] arr = { 3, 6, 9, 5, 2 };
            divide(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

    // Reverse string
    // public static void reverseString(String str) {
    // for (int i = str.length() - 1; i >= 0; i--) {
    // System.out.print(str.charAt(i));
    // }
    // }

    // public static void main(String[] arg) {
    // String str = "Jeet";
    // reverseString(str);
    // }
}
