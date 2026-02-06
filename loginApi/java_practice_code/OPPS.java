class Student{
    String name;
    long roll_no;
    int marks;

    //...........Display Details.........
    public void displayDetails(){
        System.out.println("Name:- " + this.name);
        System.out.println("Roll No :- " + this.roll_no);
        System.out.println("Marks:- " + this.marks);
    }
}

class Car{
    String company;
    String color;
    String engine;
    String series;
    int model;

    //.................Default Constructor...............
    Car(){
        System.out.println("Default Constructore Called");
        System.out.println(this.company);
        System.out.println(this.color);
        System.out.println(this.engine);
        System.out.println(this.series);
        System.out.println(this.model);
        System.out.println("------------------");
    }

    //............Parameterized Constructor...........
    Car(String company, String color, String engine, String series, int model){
        this.company = company;
        this.color = color;
        this.engine = engine;
        this.series = series;
        this.model = model;

        System.out.println("Parameterized Constructore Called");
        System.out.println(this.company);
        System.out.println(this.color);
        System.out.println(this.engine);
        System.out.println(this.series);
        System.out.println(this.model);
    }
}

public class OPPS {

    public static void main(String[] arg){
        //............Student.........
        // Student s1 = new Student();
        // Student s2 = new Student();
        // s1.name = "Goku";
        // s1.roll_no = 272727837389L;
        // s1.marks = 100;
        // s1.displayDetails();

        // s1.name = "Gohan";
        // s1.roll_no = 272727837310L;
        // s1.marks = 90;

        Car c1 = new Car();

        Car c2 = new Car("BMW","black","Twin turbo fury V8","M",5);
        
        
    }
}