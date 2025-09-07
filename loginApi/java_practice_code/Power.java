import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x:-");
        int x = sc.nextInt();
        System.out.print("Enter value of n:-");
        int n = sc.nextInt();

        int p = power(x,n);
        System.out.println("Here is the x^n:- " + p);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int pnm1 = power(x, n - 1);
        int fpr = x * pnm1;

        return fpr;
    }
    
}
