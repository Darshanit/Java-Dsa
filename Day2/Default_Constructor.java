class Student {
    String name;

    Student() {
        name = "Darshan";
        System.out.println("Default Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}