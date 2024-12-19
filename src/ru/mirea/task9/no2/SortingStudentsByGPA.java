package ru.mirea.task9.no2;

import java.util.Comparator;

class Student{
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "name='" + name + "', gpa=" + gpa;
    }
}

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.gpa, s1.gpa);
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
            if (compare(list[j], pivot) < 0) {
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
}

class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.5),
                new Student("Bob", 3.8),
                new Student("Charlie", 2.9),
                new Student("David", 3.7),
                new Student("David", 3.7),
                new Student("Eva", 4.0)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Студенты, отсортированные по итоговым баллам (GPA):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}