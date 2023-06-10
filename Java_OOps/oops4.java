class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool"; 
    }
}

public class oops4 {
    public static void main(String[] args) {
        Student.school = "AHPS";
        Student s1 = new Student();
        s1.name = "Abhishek";
        System.out.println(s1.school);
    }
}
