//OOPS contains four major concepts
//1. Abstraction
//2. Encapsulation
//3. Inheritance
//4. Polymorphism
//      a.) function overloading :- creating many functions of same name
//      b.) overriding :- 


class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing Something");
    }
    public void printcolor()
    {
        System.out.println("Color is " + this.color);
    }
    public void print_type()
    {
        System.out.println("Type is " + this.type);
    }
}

class Student{
    String name;
    int age;

    // public void print_info(){
    //     System.out.println("Student name : " + this.name);
    //     System.out.println("Student Age : " + this.age);
    // }
    
    //Constructer defined by coder
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    //Copy constructor defined by coder
    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }

    //creating a empty constructor for running the copy constructor
    // Student() {

    // }

    //Polymorphism
    //function overloading
    public void print_info(String name)
    {
        System.out.println(name);
    }

    public void print_info(int age)
    {
        System.out.println(age);
    }

    public void print_info(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class oops_1 {
    public static void main(String[] args){
        // Pen pen1 = new Pen();
        // pen1.color = "Black";
        // pen1.type = "Ball";

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "Gel";

        // pen1.write();
        // pen1.printcolor();
        // pen1.print_type();
        // pen2.printcolor();
        // pen2.print_type();

        //Studebt constructor
        //Student student1 = new Student("Abhishek Yadav", 20);
        //student1.name = "Abhishek Yadav";
        //student1.age = 20;
        //student1.print_info();

        //copy constructor
        // Student s1 = new Student();
        // s1.name = "Rahul Yadav";
        // s1.age = 21;

        // Student s2 = new Student(s1);
        // s2.print_info();

        //polymorphisms
        //function overloading
        Student s1 = new Student();
        s1.name = "Abhishek Yadav";
        s1.age = 20;
        s1.print_info(s1.name, s1.age);

    }
}
