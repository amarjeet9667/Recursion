// Pattern 1st

import java.util.Scanner;

public class Patterns {

    // Solid ractangle
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Row: ");
    //     int row = sc.nextInt();
    //     System.out.print("Enter Column: ");
    //     int column = sc.nextInt();

    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < column; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // Void ractangle
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Row:- ");
    //     int row = sc.nextInt();
    //     System.out.print("Enter Column:- ");
    //     int col = sc.nextInt();

    //     for(int i = 0; i < row; i++){
    //         for(int j = 0; j < col; j++){
    //             if(i == 0 || j == 0 || i == row-1 || j == col-1) {
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
               
    //         }

    //         System.out.println();
    //     }
    // }

    // Start stair pattern
    // public static void main(String[] arg){
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number of rows:- ");
    //     int row = sc.nextInt();
        

    //     for(int i = 0; i < row; i ++){

    //         for(int j = 0; j < i+1; j++){
                
    //                 System.out.print("*");
                

    //         }
    //         System.out.println();
    //     }
    // }

    // Reverse pattern
    // public static void main(String[] arg){
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number of rows:- ");
    //     int row = sc.nextInt();
        

    //     for(int i = row; i > 0; i --){

    //         for(int j = 0; j < i; j++){
                
    //                 System.out.print("*");
                

    //         }
    //         System.out.println();
    //     }
    // }

    // mirror star stair
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter number of rows:- ");
    //     int row = sc.nextInt();

    //     for(int i = 0; i < row; i++){

    //         for(int j = 0; j < ( (row - 1) - i ); j++){

    //             System.out.print(" ");
    //         }

    //         for(int k = 0; k <= i ; k++){
    //             System.out.print("*");

    //         }

    //         System.out.println();
    //     }
    // }


    // Conting increase by 1;
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number of rows:- ");
    //     int row = sc.nextInt();

    //     for(int i = 0; i < row; i++){

    //         for(int j = 0; j < (i + 1 ); j++){

    //             System.out.print(j+1);
    //         }

    //         System.out.println();
    //     }
    // }

    // Conting increase by 1 Reverse;
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number of rows:- ");
    //     int row = sc.nextInt();

    //     for(int i = row; i >= 0; i--){

    //         for(int j = 0; j < i; j++){

    //             System.out.print(j+1 + " ");
    //         }

    //         System.out.println();
    //     }
    // }

    // print counting with row an coloumn;
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number of rows:- ");
    //     int row = sc.nextInt();
    //     int count = 1;

    //     for(int i = 0; i < row; i++){

    //         for(int j = 0; j < i + 1; j++){

    //             System.out.print(count++ + " ");
    //         }

    //         System.out.println();
    //     }
    // }

    // Print 1,0 bit;
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows:- ");
        int row = sc.nextInt();

        for(int i = 0; i < row; i++){

            for(int j = 0; j < i + 1; j++){
                int sum = i+j;

                if(sum % 2 == 0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }

                
            }

            System.out.println();
        }
    }
}
