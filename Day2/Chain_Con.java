class Student {
    String name;
    int age;

    Student() {
        this("Darshan", 20);
        System.out.println("Default Constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Chain_Con {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}