import java.util.ArrayList;
import java.util.Scanner;

public class PracticeKeyBoard {
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:- ");
        String inputKey = sc.next();

        ArrayList<String> res = getKpc(inputKey);
        System.out.println(res);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKpc(String str){
        if(str.length() == 0){
            ArrayList<String> br = new ArrayList<>();
            br.add("str");
            return br;
        }


        char ch = str.charAt(0);
        String nextTwo = str.substring(1);

        ArrayList<String> twocharList = getKpc(nextTwo);
        ArrayList<String> newListForChar = new ArrayList<>();

        String codeForce = codes[ch - '0'];
        for(int i = 0; i < codeForce.length(); i++){
            char codeCh = codeForce.charAt(i);
            for(String rres : twocharList){
                newListForChar.add(codeCh + rres);
            }
        }
        return newListForChar;
    }
}
