class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Para_Con {
    public static void main(String[] args) {
        Student s = new Student("Darshan", 20);
        s.display();
    }
}