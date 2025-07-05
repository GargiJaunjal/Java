//package OOPS ;
// Abstraction
abstract class Person {
    private String name;   // Encapsulation
    private int age;       // Encapsulation

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method (Abstraction)
    public abstract void showRole();
}

// Inheritance + Polymorphism (Overriding)
class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is a student studying " + course);
    }
}

// Inheritance + Polymorphism (Overriding)
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is a teacher of " + subject);
    }
}

// Polymorphism (Overloading)
class College {
    void welcome(Person p) {
        System.out.println("Welcome, " + p.getName());
    }

    void welcome(String name) {
        System.out.println("Welcome, Guest " + name);
    }
}

// Main class
public class AllOOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Riya", 21, "Mathematics");
        Teacher t1 = new Teacher("Dr. Mehta", 45, "Computer Science");

        s1.showRole(); // Overridden method
        t1.showRole(); // Overridden method

        College college = new College();
        college.welcome(s1);         // Overloaded method
        college.welcome("Visitor");  // Overloaded method
    }
}
