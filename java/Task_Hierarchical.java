import java.util.Scanner;

class Person {
    public int id;
    String name;
    String address;
    long phone;

    void accepting_details(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLong();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}

class Student extends Person {
    int marks;
    String grade;
    String branch;

    void accepting_details(Scanner sc) {
        super.accepting_details(sc);
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Grade: ");
        grade = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Branch: " + branch);
    }
}

class Teacher extends Person {
    int salary;
    String subject;
    String qualification;

    void accepting_details(Scanner sc) {
        super.accepting_details(sc);
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Qualification: " + qualification);
    }
}

class NonTeachingStaff extends Person {
    int salary;

    void accepting_details(Scanner sc) {
        super.accepting_details(sc);
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

public class Task_Hierarchical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Enter Student Details ---");
        Student student = new Student();
        student.accepting_details(sc);

        System.out.println("\n--- Enter Teacher Details ---");
        Teacher teacher = new Teacher();
        teacher.accepting_details(sc);

        System.out.println("\n--- Enter Non-Teaching Staff Details ---");
        NonTeachingStaff staff = new NonTeachingStaff();
        staff.accepting_details(sc);

        System.out.println("\n--- Student Details ---");
        student.display();

        System.out.println("\n--- Teacher Details ---");
        teacher.display();

        System.out.println("\n--- Non-Teaching Staff Details ---");
        staff.display();

        sc.close();
    }
}
