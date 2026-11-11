package com.constructors;

public class ThisOf_reverse {
    int id;
    String name;
    String course;
    String ccode;

    public ThisOf_reverse(int id, String name, String course, String ccode) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.ccode = ccode;
        System.out.println("4-Arg constructor");
    }

    public ThisOf_reverse(int id, String name, String course) {
        this(id, name, course, "DEFAULT");
        System.out.println("3-Arg constructor");
    }

    public ThisOf_reverse(int id, String name) {
        this(id, name, "JAVA", "DEFAULT");
        System.out.println("2-Arg constructor");
    }

    public ThisOf_reverse(int id) {
        this(id, "UNKNOWN", "JAVA", "DEFAULT");
        System.out.println("1-Arg constructor");
    }

    void dontDo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(course);
        System.out.println(ccode);
    }

    public static void main(String[] args) {
        ThisOf_reverse t = new ThisOf_reverse(9);
        t.dontDo();
    }
}


//public class ThisOf_reverse {
//	int id;
//	String name;
//	String course;
//	String ccode;
//	
//	
//
//	public ThisOf_reverse(int id, String name, String course, String ccode) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.course = course;
//		this.ccode = ccode;
//		System.out.println("4-Arg constructor");
//	}
//	
//
//
//
//	public ThisOf_reverse(int id,String name,String course) {
//		this(id,name);
//		System.out.println("3-Arg constructor");
//	}
//	
//
//	public ThisOf_reverse(int id, String name) {
//		this(id);
//		System.out.println("3-Arg constrfuctor");
//	}
//	
//
//	public ThisOf_reverse(int id) {
//		System.out.println("1-Arg constructor");
//		
//	}
//	void dontDo() {
//		System.out.println(id);
//		System.out.println(name);
//	}
//
//
//
//
//	public static void main(String[] args) {
//		ThisOf_reverse t = new ThisOf_reverse(9);
//        t.dontDo();
//	}
//
//} 
//why it's not printing the passing value
