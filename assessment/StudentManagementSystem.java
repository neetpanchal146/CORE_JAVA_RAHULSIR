package assessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Student {
    private int serialNumber;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private List<Subject> subjects;

    // Constructor, getters, and setters

    public Student(int serialNumber, String firstName, String lastName, String contactNumber) {
        this.serialNumber = serialNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.subjects = new ArrayList<>();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

class Subject {
    private String name;
    private int marks;
    private double fees;

    // Constructor, getters, and setters

    public Subject(String name, int marks, double fees) {
        this.name = name;
        this.marks = marks;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public double getFees() {
        return fees;
    }
}

class Counsellor {
    private List<Student> students;

    // Constructor, getters, and setters

    public Counsellor() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getSerialNumber() == studentId);
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println("Serial Number: " + student.getSerialNumber() +
                    ", Name: " + student.getFirstName() + " " + student.getLastName() +
                    ", Contact Number: " + student.getContactNumber());
        }
    }

    public void displaySpecificStudent(int studentId) {
        for (Student student : students) {
            if (student.getSerialNumber() == studentId) {
                System.out.println("Serial Number: " + student.getSerialNumber() +
                        ", Name: " + student.getFirstName() + " " + student.getLastName() +
                        ", Contact Number: " + student.getContactNumber());
                System.out.println("Subjects:");
                for (Subject subject : student.getSubjects()) {
                    System.out.println("  Subject: " + subject.getName() +
                            ", Marks: " + subject.getMarks() +
                            ", Fees: " + subject.getFees());
                }
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }
}

class Faculty {
    private List<Student> students;

    // Constructor, getters, and setters

    public Faculty(List<Student> students) {
        this.students = students;
    }

    public void addMarksToStudent(int studentId, String subjectName, int marks, double fees) {
        for (Student student : students) {
            if (student.getSerialNumber() == studentId) {
                student.addSubject(new Subject(subjectName, marks, fees));
                System.out.println("Marks added successfully for Student ID: " + studentId);
                return;
            }
        }
        System.out.println("Student not found with ID: " + studentId);
    }

    public void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println("Serial Number: " + student.getSerialNumber() +
                    ", Name: " + student.getFirstName() + " " + student.getLastName() +
                    ", Contact Number: " + student.getContactNumber());
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counsellor counsellor = new Counsellor();
        Faculty faculty = new Faculty(counsellor.getStudents());

        while (true) {
            System.out.println("Press 1 for Counsellor\nPress 2 for Faculty\nPress 3 for Student\nPress 4 to Exit");
            int roleChoice = scanner.nextInt();

            switch (roleChoice) {
                case 1:
                    handleCounsellor(counsellor, scanner);
                    break;
                case 2:
                    handleFaculty(faculty, scanner);
                    break;
                case 3:
                    // Handle Student operations (if needed)
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void handleCounsellor(Counsellor counsellor, Scanner scanner) {
        while (true) {
            System.out.println("Counsellor menu:");
            System.out.println("1. Add student\n2. Remove student\n3. View all student\n4. View specific student\n5. Go back");
            int counsellorChoice = scanner.nextInt();

            switch (counsellorChoice) {
                case 1:
                    addStudent(counsellor, scanner);
                    break;
                case 2:
                    removeStudent(counsellor, scanner);
                    break;
                case 3:
                    counsellor.displayAllStudents();
                    break;
                case 4:
                    viewSpecificStudent(counsellor, scanner);
                    break;
                case 5:
                    return; // Go back to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent(Counsellor counsellor, Scanner scanner) {
        System.out.println("Enter a Serial Number:");
        int serialNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter a First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter a Last Name:");
        String lastName = scanner.nextLine();

        // Validate contact number
        String contactNumber;
        while (true) {
            System.out.println("Enter a Contact Number:");
            contactNumber = scanner.nextLine();
            if (contactNumber.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Invalid contact number. Please enter a 10-digit number.");
            }
        }

        Student student = new Student(serialNumber, firstName, lastName, contactNumber);

        // Add subjects
        while (true) {
            System.out.println("Enter a Subject (or type 'done' to finish):");
            String subjectName = scanner.nextLine();
            if (subjectName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Enter Marks:");
            int marks = scanner.nextInt();

            System.out.println("Enter Fees:");
            double fees = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline character

            student.addSubject(new Subject(subjectName, marks, fees));
        }

        counsellor.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private static void removeStudent(Counsellor counsellor, Scanner scanner) {
        System.out.println("Enter the Serial Number of the student to remove:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Are you sure you want to remove this student? (Y/N)");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("Y")) {
            counsellor.removeStudent(studentId);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Removal canceled.");
        }
    }

    private static void viewSpecificStudent(Counsellor counsellor, Scanner scanner) {
        System.out.println("Enter the Serial Number of the student to view:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        counsellor.displaySpecificStudent(studentId);
    }

    private static void handleFaculty(Faculty faculty, Scanner scanner) {
        while (true) {
            System.out.println("Faculty menu:");
            System.out.println("1. Add marks to student\n2. View all student\n3. Go back");
            int facultyChoice = scanner.nextInt();

            switch (facultyChoice) {
                case 1:
                    addMarksToStudent(faculty, scanner);
                    break;
                case 2:
                    faculty.displayAllStudents();
                    break;
                case 3:
                    return; // Go back to the main menu
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addMarksToStudent(Faculty faculty, Scanner scanner) {
        System.out.println("Enter the Serial Number of the student:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the Subject:");
        String subjectName = scanner.nextLine();

        System.out.println("Enter Marks:");
        int marks = scanner.nextInt();

        System.out.println("Enter Fees:");
        double fees = scanner.nextDouble();

        faculty.addMarksToStudent(studentId, subjectName, marks, fees);
    }
}
