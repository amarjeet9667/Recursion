import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    public static Scanner sc = new Scanner(System.in);
    
    //.................Inputs.....................
    public static void inputArrays(int size, int[] elements){

        for(int i = 0; i < size; i++){
            elements[i] = sc.nextInt();
        }

    }

    //.................Output....................
    public static void outPutArrays(int[] elements){
        System.out.print("Here is the result:- ");

        for(int element : elements){
            System.out.print( element + " ");
        }
        System.out.println();

    }

    //..............Maximum number Minimum Number.........
    public static void findMaxAndMin(int[] element){
        int min = element[0];
        int max = element[0];

        for(int i = 0; i < element.length; i++){
            if(element[i] < min){
                min = element[i];
            }
            if(element[i] > max){
                max = element[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }


    public static void main(String[] arg){

        System.out.print("Please Enter Size of Element:- ");
        int sizeOfArray = sc.nextInt();
        System.out.println("Please Enter Elements of Array:- ");
        int[] elements = new int[sizeOfArray];

        inputArrays(sizeOfArray, elements);
        outPutArrays(elements);


    }
}
