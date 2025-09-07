import java.util.Scanner;

public class Fcatorial {
    
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = sc.nextInt();
        int fact = showFactorial(num);

        System.out.println("Here is the Factorial:- " + fact);
    }

    public static int showFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = showFactorial(n - 1);
        int result = n * fnm1;

        return result;
    }
}

//BigInteger
// import java.math.BigInteger;
// import java.util.Scanner;

// public class Fcatorial {
    
//     public static void main(String[] arg){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number:- ");
//         int num = sc.nextInt();
//         BigInteger fact = showFactorial(num);

//         System.out.println("Here is the Factorial:- " + fact);
//     }

//     public static BigInteger showFactorial(int n){
//         if(n == 0 || n == 1){
//             return BigInteger.ONE;
//         }
//         BigInteger fnm1 = showFactorial(n - 1);
//         // BigInteger result = n * fnm1;

//         return BigInteger.valueOf(n).multiply(fnm1);
//     }
// }
