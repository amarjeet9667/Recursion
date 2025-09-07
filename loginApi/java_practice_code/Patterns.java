public class Patterns {

    // ............square. patterns...............
    public static void Square(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
            ;
        }

    }

    // ...........Square Char.........
    public static void Alphabets(int num) {
        for (int i = 1; i <= num; i++) {
            char value = 'A';
            for (int j = 1; j < num; j++) {
                System.err.print(value);
                value++;
            }
            System.err.println(" ");
        }
    }

    // ..........stars Trangle...........
    public static void StarTrangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }

    // ..........Number Trangle...........
    public static void NumberTrangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println("");
        }
    }

    // ..........Alphabet Trangle...........
    public static void AlphabetTrangle(int num) {
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);

            }
            ch++;
            System.out.println("");
        }
    }

    //.............reverse counting...........
    public static void Counting(int num){

        for(int i = 1; i <= num; i++){
            //Space
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            //Number
            for(int j = i; j <= num; j++){
                System.out.print(i);
            }

            
            System.out.println(" ");
        }

    }

    public static void Pyramid(int num){
        for(int i = 1; i <= num; i++){

            //Space
            for(int j = i; j <= num-1; j++){
                System.out.print(" ");
            }

            //Number
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            //reverse number
            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println(" ");

        }
    }

    public static void main(String[] arg) {
        int num = 5;

        // System.out.println("Here is the Square:-");
        // Square(num);
        // System.out.println("");

        // System.out.println("Here is the Alphabet square:-");
        // Alphabets(num);

        // System.out.println("Here is the Star Trangle:-");
        // StarTrangle(num);

        System.out.println("Here is the Counting Trangle:-");
        Pyramid(num);

        // System.out.println("Here is the Alphabet Trangle:-");
        // AlphabetTrangle(num);
    }
}
