import java.util.Scanner;

public class StringPrac {

    // Make a print function so we can avoid to call (System.out.println and print).
    public static void printNext(String msg){
        System.out.println(msg);
    }

    public static void printSameLine(String msg){
        System.out.println(msg);
    }
    
    
    // public static void main(String[] arg){
    //     Scanner cs = new Scanner(System.in);
    //     System.out.print("Enter String:- ");
    //     String userInput = cs.nextLine();
        

    //     for(int i = userInput.length()-1 ; i >= 0; i--){

    //         System.out.print(userInput.charAt(i));

    //     }
    // }

    // StringBuilder
    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     printSameLine("Enter Your String:- ");

    //     StringBuilder str = new StringBuilder(sc.nextLine());

    //     // Show Output
    //     printNext("You Entered: " + str);

    //     // Let's Ittret each element of StringBuilder
    //     printSameLine("Each Element");
    //     for(int i = 0; i < str.length(); i++){
    //         printNext(String.valueOf(str.charAt(i)));
    //     }


    //     // Insert charecter in str(StringBuilder)
    //     str.insert(0,"H");
    //     str.insert(1,"E");
    //     str.insert(2,"L");
    //     str.insert(3,"L");
    //     str.insert(4,"O ");

    //     printSameLine("Final str after insert:-" + str);

    //     /// Now set values
    //     /// (Note*-  setCharAt accept one character only and it replace the charactor with index one)
    //     /// (Note*-  Char = '', char is single quoted('') and String is Double quoted (""))
    //     str.setCharAt(0, 'M');
    //     printSameLine("Final str after Set:-" + str);

    //     // Append char in StringBuilder
    //     // Append take a string value and add in last.
    //     str.append(" Sir");
    //     printSameLine("Final str after Append:-" + str);

    //     // Delete In StringBuilder
    //     // Delete takes start value and end value which is integer and basically it takes range to delete
    //     str.delete(0, 4);
    //     printSameLine("Final str after Delete:-" + str);
    // }



    // Bubble sort
    public static void main(String[] arg){
        int arr[] = {8,6,4,2,7,5,3,1};

        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
            
        }
        printArray(arr);
    }

    public static void printArray(int list[]){
        for(int i = 0; i < list.length ; i++){
            System.out.print(list[i] + " ");
        }
    }
}
