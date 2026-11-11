package com.methods;

class Student {
    int sid;
    String sname;
    double marks;
}

public class FactoryMethod {

    Student getStudentInfo() {
        Student s = new Student();
        s.sid = 101;
        s.sname = "Abhi";
        s.marks = 96;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("main method started");

        FactoryMethod f = new FactoryMethod();
        Student s = f.getStudentInfo();  //doubt 

        System.out.println(s.sid);
        System.out.println(s.sname);
        System.out.println(s.marks);

    }
}