import java.util.ArrayList;
import java.util.Scanner;

public class KeyBoard {

    public static void main(String[] arg)throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number:- ");
        String str = sc.next();

        ArrayList<String> words = getKpc(str);
        System.out.println(words);
    }

    static String[] code = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKpc(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String nextNum = str.substring(1);

        ArrayList<String> rres = getKpc(nextNum);
        ArrayList<String> mres = new ArrayList<>();

        String codeForce = code[ch - '0'];
        for(int i = 0; i < codeForce.length(); i++){
            char chCode = codeForce.charAt(i);
            for(String rstr : rres){
                mres.add(chCode + rstr);
            }
        }
        return mres;
    }
    
}
