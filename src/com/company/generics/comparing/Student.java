package com.company.generics.comparing;

// never become that fool who compare yourself with others
// here i'm using some real examples only because i used to be that fool
public class Student implements Comparable<Student> {
    float marks;
    int rollNo ;

    public Student(float marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return marks+ "";
    }

    @Override
    public int compareTo(Student otherStudent) {
        int difference = (int)(this.marks - otherStudent.marks);
        return difference;
    }
}
