import java.util.*;

class RecursionMethod {
// 1---------------Print reverse and forward number------------------

    // public static void printReverseNumber(int n){

    // if(n == 0){
    // return;
    // }
    // System.out.print(n + " ");
    // printReverseNumber(n - 1);
    // System.out.println();
    // System.out.print(n + " ");
    // }

    // public static void main(String[] arg){
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // printReverseNumber(n);
    // }

// 2------------------Print sum of n numbers of integer-------------

    // public static void printSum(int i, int num, int sum) {
    //     if(i == num){
    //         sum += i;
    //         System.out.print("Here is the Sum:- " + sum);
    //         return;
    //     }

    //     sum += i;
    //     printSum(i+1, num, sum);
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your number:-");
    //     int n = sc.nextInt();
    //     printSum(1, n, 0);
    // }

//3.------------------Caclculate n fectorial---------------

    // public static int factorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }

    //     int fact_nm1 = factorial(n-1);
    //     int fact = n*fact_nm1;

    //     return fact;
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your number:- ");
    //     int n = sc.nextInt();
    //     System.out.println("Here is the Factorial of " + n +":- ");
    //     int result = factorial(n);
    //     System.out.println(result);
        
    // }

//4.------------Fibonacci sequence-------------

    // public static void fibonacci(int a, int b, int n){

    //     if(n == 0){
    //         return;
    //     }

    //     int c = a+b;
    //     System.out.println(c);
    //     fibonacci(b, c, n-1);
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your Number:- ");
    //     int n = sc.nextInt();
    //     int a = 0;
    //     int b = 1;
    //     System.out.println(a);
    //     System.out.println(b);

    //     fibonacci(a, b, n-2);
    // }

// //------------------Power calculation stack height = n ------------
//     public static int calculatePower(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }

//         int xpowerNM1 = calculatePower(x, n-1);
//         int xPower = x * xpowerNM1;

//         return xPower;
//     }

//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter X:- ");
//         int x = sc.nextInt();
//         System.out.println("Enter N:- ");
//         int n = sc.nextInt();

//         int result = calculatePower(x, n);
//         System.out.println("Answer:- "+result);
//     }

//-----------------calculate power stack hieght = logn ---------------
    //  public static int calculatePower(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }

    //     if(n % 2 == 0){
    //         return calculatePower(x, n/2) * calculatePower(x, n/2);
            
    //     }else{
    //         return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
    //     }

    //  }

    //  public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter x:- ");
    //     int x = sc.nextInt();
    //     System.out.println("Enter N:- ");
    //     int n = sc.nextInt();

    //     int answer = calculatePower(x, n);
    //     System.out.println("Answer:- " + answer);
    //  }

    
// ------------------Tower of Hanoi----------------
    // public static void tower(int n, String s, String h, String d){
    //     if(n == 1){
    //         System.out.println("Transfer disk " + n + "From " + s +"to " + d);
    //         return;
    //     }

    //     tower(n-1, s, d, h);
    //     System.out.println("Transfer disk " + n + "From " + s +"to " + d);
    //     tower(n-1, h, s, d);
    // }


    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Number");
    //     int n = sc.nextInt();
    //     tower(n, "s", "h", "d");
        
    // }


    //-----------------Reverse string--------------
    // public static void reverseStrig(int n,String str){
    //     if(n < 0){
    //         return;
    //     }

    //     System.out.print(str.charAt(n)); 
    //     reverseStrig(n-1, str);

    // }


    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your string:-");
    //     String str = sc.next();
    //     reverseStrig(str.length() - 1, str);
    // }


    // public static String reverseString(String str, int idx){
    //     if(idx < 0){
    //         return "";
    //     }

    //     return  str.charAt(idx) + reverseString(str, idx-1);
    // }

    // public static void main(String[] arg) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Your String:- ");
    //     String str = sc.next();

    //     String fResult = reverseString(str, str.length() - 1);
    //     System.out.println("Result :- " + fResult);
    // }


// -------------First and last occurance---------------
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element){
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }


    //     char curChar = str.charAt(idx);
    //     if(curChar == element){
    //         if (first == -1) {
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx + 1, element);
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your String :- ");
    //     String str = sc.next();
    //     findOccurance(str, 0, 'a');
    // }

//---------------check List is Stricktly sorted-----------
    // public static boolean isSorted(int[] arr, int idx){
    //     if(idx == arr.length - 1){
    //         return true;
    //     }

    //     if(arr[idx] < arr[idx+1]){
    //         return isSorted(arr, idx+1);
    //     }else{
    //         return false;
    //     }
    // }

    // public static void main(String[] arg){
    //     int[] list = {1,2,3,4,5};
    //     boolean str = isSorted(list,0);
    //     System.out.println(str);
    // }


    // --------------Move all x to the end of the string--------
    // public static void moveAllX(String str, int idx,int count, String newString){
    //     if(idx == str.length()){

    //         for(int i = 0; i <= count; i++){
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }

    //     char curChar = str.charAt(idx);
    //     if(curChar == 'x'){
    //         count++;
    //         moveAllX(str,idx+1,count,newString);
    //     }else{
    //         newString += curChar;
    //         moveAllX(str,idx+1,count,newString);
    //     }
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string");
    //     String str = sc.next();
    //     moveAllX(str, 0, 0, "");
    // }


    //------------Remove all duplicats from string-----------
    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicats(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char curChar = str.charAt(idx);
    //     if(map[curChar - 'a'] == true){
    //         removeDuplicats(str, idx+1, newString);
    //     }else{
    //         newString += curChar;
    //         map[curChar - 'a'] = true;
    //         removeDuplicats(str, idx+1, newString);
    //     }
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string:- ");
    //     String str = sc.next();
    //     System.out.println("Here is your OutPut:-");
    //     removeDuplicats(str, 0, "");
    // }


    //---------------- print all subsequences-------------
    // public static void subsequences(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char curChar = str.charAt(idx);
    //     // to be
    //     subsequences(str, idx+1, newString+curChar);

    //     // not to be
    //     subsequences(str, idx+1, newString);
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string:- ");
    //     String str = sc.next();
    //     System.out.println("Here is your OutPut:-");
    //     subsequences(str, 0, "");
    // }

    //-------------unique sub sequense-----------
    // public static void uniqueSubSequence(String str, int idx, String newString, HashSet<String> set){

    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         }else{
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }

    //     char curChar = str.charAt(idx);

    //     //To be
    //     uniqueSubSequence(str, idx+1,newString+curChar, set);
    //     //Not to be
    //     uniqueSubSequence(str, idx+1, newString, set);

    // }

    // public static void main(String[] arg){
    //     HashSet<String> set = new HashSet<> ();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string:- ");
    //     String str = sc.next();
    //     System.out.println("Here is your OutPut:-");
    //     uniqueSubSequence(str, 0, "",set);
    // }


//------------Keypad combination------------
    // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    // public static void keypadCombination(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char curChar = str.charAt(idx);
    //     String mapping = keypad[curChar - '0'];
    //     for(int i = 0; i < mapping.length(); i++ ){
    //         keypadCombination(str, idx+1, newString+mapping.charAt(i));
    //     }
    // }

    // public static void main(String[] arg){

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your string:- ");
    //     String str = sc.next();
    //     System.out.println("Here is your OutPut:-");
    //     keypadCombination(str, 0, "");
    // }

    //-------------Permutation------------
    public static void printPerm(String str, String permutaString){
        if(str.length() == 0){
            System.out.println(permutaString);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i+1);
            printPerm(newString, permutaString+curChar);
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your string:-");
        String str = sc.next();
        printPerm(str, "");
    }

}