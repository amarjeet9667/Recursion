import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndices {

    public static void main(String[] arg) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of array:- ");
        // Take input from user.
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter Elements of array:- ");
        // Make List with given input n.
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter x:- ");
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr,0,x,0);

        if(iarr.length == 0){
            System.out.println();
        }

        System.out.println("New array:- ");

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }

    }

    public static int[] allIndices(int[] arr, int ind, int x, int fsf){
        if(ind == arr.length){
            return new int[fsf];
        }

        if(arr[ind] == x){
            int[] iarr = allIndices(arr, ind + 1, x, fsf + 1);
            iarr[fsf] = ind;
            return iarr;
        }else{
            int[] iarr = allIndices(arr, ind + 1, x, fsf);
            return iarr;
        }
    }
    
}
