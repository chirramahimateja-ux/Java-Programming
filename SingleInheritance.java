class Faculty {
    void show() {
        System.out.println("faculty is a parent class");
    }
}

class Student extends Faculty {
    void display() {
        System.out.println("student is a child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();    
        s.display();     }
}
