package ru.mirea.task10;

import java.util.Comparator;

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    Student(String name, String surname, String specialty, int course, String group, double gpa){
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Specialty: " + specialty + ", Course: " + course + ", Group: " + group + ", GPA: " + gpa;
    }
}

class SortingStudentsByGPA implements Comparator <Student> {
    Student[] idNumber = new Student[5];

    public void setArray(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            idNumber[i] = arr[i];
        }
    }

    public void mergeSort(Student[] arr){
        sort(arr);
    }

    public void outArray(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getGpa() < s2.getGpa()){
            return -1;
        } else if (s1.getGpa() > s2.getGpa()) {
            return 1;
        }
        else return 0;
    }

    public void sort(Student [] array){
        if(array.length<2){
            return;
        }
        int mid = array.length/2;
        Student [] l = new Student[mid];
        Student [] r = new Student[array.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }

        sort(l);
        sort(r);

        merge(array, l, r);
    }

    public void merge(Student [] array, Student [] l, Student [] r){
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length){
            if(compare(l[i], r[j]) > 0){
                array[k++] = l[i++];
            }
            else{
                array[k++] = r[j++];
            }
        }
        while (i < l.length){
            array[k++] = l[i++];
        }
        while (j < r.length){
            array[k++] = r[j++];
        }
    }
}

class SortingStudentsBySurname extends SortingStudentsByGPA{
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getSurname().compareTo(s1.getSurname());
    }
}

class StudentMerge {
    public static Student[] mergeAndSort(Student[] list1, Student[] list2) {
        Student[] mergedList = new Student[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }
        int j = 0;
        for (int i = list1.length; i < mergedList.length; i++) {
            mergedList[i] = list2[j++];
        }
        SortingStudentsBySurname surname_sorting = new SortingStudentsBySurname();
        surname_sorting.mergeSort(mergedList);
        return mergedList;
    }
}

class Test{
    public static void main(String[] args) {

        Student[] arr1 = {new Student("Alice", "Smith", "Mathematics", 2, "A", 3.5),
                new Student("Bob", "Johnson", "Physics", 3, "B", 4.0),
                new Student("Charlie", "Williams", "Chemistry", 1, "C", 3.0),
                new Student("David", "Jones", "Biology", 3, "B", 2.5),
                new Student("Eva", "Brown", "Literature", 2, "A", 4.5)};
        Student[] arr2 = {new Student("Cindy", "Jackson", "Physics", 1, "Q", 3.23),
                new Student("Paul", "Johnson", "Mathematics", 3, "B", 4.0),
                new Student("Sandy", "Brown", "Chemistry", 2, "C", 2.1),
                new Student("Mary", "White", "Biology", 4, "M", 3.99),
                new Student("James", "Sanderland", "English", 1, "A", 4.6)};


        SortingStudentsByGPA gpa_sorting = new SortingStudentsByGPA();
        gpa_sorting.setArray(arr1);
        gpa_sorting.mergeSort(arr1);
        gpa_sorting.outArray(arr1);
        System.out.println();
        SortingStudentsByGPA surname_sorting = new SortingStudentsByGPA();
        surname_sorting.setArray(arr2);
        surname_sorting.mergeSort(arr2);
        surname_sorting.outArray(arr2);
        System.out.println();
        Student[] merged = StudentMerge.mergeAndSort(arr1, arr2);
        for (Student m : merged){
            System.out.println(m);
        }
    }
}
