package com.testaccessmodifiers;

import com.accessmodifiers.Student_TestingAM;
public class TestingStudent_Am {



	    public static void main(String[] args) {


	        Student_TestingAM s = new Student_TestingAM();

	        // Private variable
	        // Accessible only inside Student_TestingAM class.

	        // System.out.println(s.privateVar); // ❌ Compilation Error

	        // Default variable
	        // Accessible only within the same package.

	        // System.out.println(s.defaultVar); // ❌ Compilation Error

	        // Protected variable
	        // Cannot be accessed because this class is NOT a subclass
	        // and belongs to a different package.

	        // System.out.println(s.protectedVar); // ❌ Compilation Error

	        // Public variable
	        // Accessible from any package.

	        System.out.println(s.publicVar); // ✔ Works
	    }
	}