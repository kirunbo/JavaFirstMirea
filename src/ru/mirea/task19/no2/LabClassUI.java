package ru.mirea.task19.no2;

import java.util.InputMismatchException;
import java.util.Scanner;

class LabClass{
    private Student[] students;
    private int count;

    public LabClass(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
    }

    public Student findName(String name) throws EmptyStringException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("name can't be empty");
        }

        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        throw new NoStudentFoundException("found no student with such name");
    }

    public void sortStudentsByGPA() {
        quickSort(students, 0, students.length-1);
    }

    public void quickSort(Student[] list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private int partition(Student[] list, int low, int high) {
        Student pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j].getGpa() < pivot.getGpa()) {
                i++;
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        Student temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }

    public Student[] getStudents(){
        return students;
    }
}

public class LabClassUI {
    private LabClass labClass;
    Scanner sc = new Scanner(System.in);

    LabClassUI(){
        System.out.println("input the size of the lab class");
        while (true){
            try {
                int size = sc.nextInt();
                if(size <= 0){
                    throw new InputMismatchException("size can't be 0 or less");
                }
                labClass = new LabClass(size);
                break;
            } catch (InputMismatchException e) {
                System.out.println("error: " + e.getMessage() + "\ntry again");
                sc.nextLine();
            }
        }
        sc.nextLine();
    }

    public void go(){
        while (true) {
            System.out.println("choose an option:\n" +
                    "to add a student input 'add'\n" +
                    "to find s student by name input 'find'\n" +
                    "to sort students by GPA  input 'sort'\n" +
                    "to exit input 'exit'\n");
            String option = sc.nextLine();

            switch (option) {
                case "add":
                    try {
                        System.out.print("input student's name: ");
                        String name = sc.nextLine();
                        System.out.print("input student's GPA: ");
                        double gpa = sc.nextDouble();
                        labClass.addStudent(new Student(name, gpa));
                    } catch (EmptyStringException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "find":
                    try {
                        System.out.print("input name of student you wish to find: ");
                        String name = sc.nextLine();
                        Student student = labClass.findName(name);
                        System.out.println("student found: " + student.getName() + ", student's GPA: " + student.getGpa());
                    } catch (NoStudentFoundException| EmptyStringException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "sort":
                    labClass.sortStudentsByGPA();
                    for (Student student : labClass.getStudents()) {
                        System.out.println("name: " + student.getName() + ", GPA: " + student.getGpa());
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("incorrect input, try again");
                    sc.nextLine();
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        LabClassUI labClassUI = new LabClassUI();
        labClassUI.go();
    }
}
