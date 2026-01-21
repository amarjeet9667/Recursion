import java.util.Scanner;

public class Test {
    public static boolean[] map = new boolean[26];
    public static void subsequences(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newStr+curChar);

        // Not to be
        subsequences(str, idx+1, newStr);
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:-");
        String str = sc.next();
        subsequences(str,0, "");
    }
}
