import java.util.*;

class RecursionMethod{
    public static void printDecreaseing(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printDecreaseing(n-1);
        System.out.println(n);
    }

    public static void main(String[] arg){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreaseing(n);
    }
}