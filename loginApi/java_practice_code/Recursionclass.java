import java.util.*;

public class Recursionclass {

    /// ..........Display Element of array without iteration(using Recursion).
    // public static void main(String[] arg){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Length of array:- ");
    // int n = sc.nextInt();

    // int[] arr = new int[n];

    // System.out.println("Enter Elements of array:- ");
    // for(int i = 0; i < arr.length; i++){
    // arr[i] = sc.nextInt();
    // }

    // System.out.println(" ");
    // displayArray(arr,0);

    // }

    // public static void displayArray(int[] arr, int idx){
    // if(idx == arr.length){
    // return;
    // }

    // System.out.println(arr[idx]);
    // displayArray(arr, idx+1);

    // }

    /// ...............Display all elements of array reverse.
    // public static void main(String[] arg){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter length of array:-");
    // int n = sc.nextInt();

    // int[] arr = new int[n];

    // System.out.println("Enter Elements of array:-");
    // for(int i = 0; i < arr.length; i++){
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("Here is Reverse array:-");
    // displayReverseArray(arr,0);
    // }

    // public static void displayReverseArray(int[] arr, int idx){
    // if(idx == arr.length){
    // return;
    // }

    // displayReverseArray(arr, idx+1);
    // System.out.println(arr[idx]);
    // }

    /// ................Find max element from list of array.
    // public static void main(String[] arg){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Length of array:- ");
    // int n = sc.nextInt();
    // int[] arr = new int[n];

    // System.out.println("Enter Elements of array:- ");

    // for(int i = 0; i < arr.length; i++){
    // arr[i] = sc.nextInt();
    // }

    // int max = findMaxOfArray(arr,0);
    // System.out.println("Here is the max:- " + max);

    // }

    // public static int findMaxOfArray(int[] arr, int idx){
    // if(idx == arr.length - 1){
    // return arr[idx];
    // }

    // int misa = findMaxOfArray(arr, idx+1);

    // if(misa > arr[idx]){
    // return misa;
    // }else{
    // return arr[idx];
    // }

    // }

    /// ..............First Index proble(find first number from a list ex:-
    /// 1,2,3,2,4,4 find first 2 at which index)
    
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array:- ");
        int n = sc.nextInt();

        System.out.println("Enter Elemnets of Array:- ");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Which number you want to find(From array):-");
        int x = sc.nextInt();

        int fi = findFirstIndex(arr,0, x);
        System.out.println("Here is Your number:- " + fi);
    }

    public static int findFirstIndex(int[] arr, int ind, int x){
        if(ind == arr.length){
            return -1;
        }

        if(arr[ind] == x){
            return ind;
        }

        return findFirstIndex(arr, ind+1, x);
    }
}
