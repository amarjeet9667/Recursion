import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:-");
        String str = sc.next();

        // ires = initial Result
        ArrayList<String> ires = gos(str);
        System.out.println(ires);
    }

    public static ArrayList<String> gos(String st){

        if(st.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = st.charAt(0);
        String ros = st.substring(1);
        ArrayList<String> rres = gos(ros);

        ArrayList<String> mres = new ArrayList<>();

        for(String fres : rres){
            mres.add("" + fres);
        }

        for(String sres : rres){
            mres.add(ch + sres);
        }

        return mres;


    }
}
