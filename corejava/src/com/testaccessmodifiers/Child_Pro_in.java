package com.testaccessmodifiers;

import com.accessmodifiers.Student_TestingAM;

// Child_Pro_in is inheriting Student_TestingAM using the 'extends' keyword.
// Because of inheritance, protected members are accessible even though
// this class is in a different package.
public class Child_Pro_in extends Student_TestingAM {

    public void show() {

        // private -> Cannot be accessed because it is available
        // only inside the Student_TestingAM class.
        // System.out.println(privateVar); // ❌ Compilation Error

        // default -> Cannot be accessed because default members
        // are accessible only within the same package.
        // System.out.println(defaultVar); // ❌ Compilation Error

        // protected -> Accessible because:
        // 1. Child_Pro_in extends Student_TestingAM (Inheritance)
        // 2. protected members are available to subclasses,
        //    even if they are in a different package.
        System.out.println(protectedVar); // ✔ Works using protected + inheritance

        // public -> Accessible from anywhere in the project.
        System.out.println(publicVar); // ✔ Works
    }

    public static void main(String[] args) {

        Child_Pro_in obj = new Child_Pro_in();

        // Calling the inherited method to demonstrate access.
        obj.show();
    }
}