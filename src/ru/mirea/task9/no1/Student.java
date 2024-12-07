package ru.mirea.task9.no1;

public class Student  implements Comparable<Student>{
    public Integer id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.id.compareTo(student.id);
    }

    @Override
    public String toString(){
        return this.id + " " + this.name;
    }
}

class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(2,"Mary"),
                new Student(1,"Alice"),
                new Student(3,"Kate"),
        } ;
        for (Student student : students){
            System.out.println(student);
        }
        System.out.println();

        InsertionSort.insertionSort(students);

        for (Student student : students){
            System.out.println(student);
        }
    }
}

class InsertionSort{
    public static void insertionSort(Comparable[] list){
        int n = list.length;
        for (int i = 1; i < n; i++) {
            Comparable key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j = j -1;
            }
            list[j + 1] = key;
        }
    }
}
