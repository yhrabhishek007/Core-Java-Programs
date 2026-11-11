package com.methods;
import java.util.Scanner;

public class MathProblems {

	
	public static void main(String[] args) {
		MathProblems m=new MathProblems();
		m.areaOfTriangle(0,0);
		System.out.println("*************************");
		m.areaOfSquare();
		System.out.println("*************************");
//		System.out.println(m.areaOfReactangle(4, 40));
//		System.out.println("*************************");
		m.areaOfCircle(0);
		System.out.println("*************************");
//		m.areaOfRhombus(5, 4);
		
		
		
//		Area of Rectangle outside method
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of rectangle");
		System.out.println("Enter lenght:");
		double len=sc.nextDouble();
		System.out.println("Enetr breadth:");
		double bre= sc.nextDouble();
		double arRec=len*bre;
		System.out.println("Area of rectangle is:"+ arRec);
		
		
	}
	double areaOfTriangle(float b,double h) {
//		If you want to read values inside the method using Scanner, make it a no-argument method:
//		reading values from console :using Scanner inside methods
		System.out.println("Area Of Triangle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base:");
		float base =sc.nextFloat();
		System.out.println("Enter a height:");
		double height=sc.nextDouble();
		double arTri=0.5*base*height;
		System.out.println("Area of triangle is:" +arTri);
		return arTri;
		
		}
	
	double areaOfSquare() {  //  double s, double s1 also we can give arguments 
//		if we are not using scanner for reading the values
	
		System.out.println("Area of Square");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides:");
		double side=sc.nextDouble();
		double arSuq=side*side;
		System.out.println("Area of square is: "+arSuq);
		return arSuq;
	
	}
	
	double areaOfReactangle(double l, double b) {
		System.out.println("Area of rectangle");
		System.out.println("Lenght is:"+l);
		System.out.println("Breadth is:"+b);
		double arRect=l*b;
		return arRect;
	}
	
	void areaOfCircle(double r) {
		System.out.println("Area of circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		float r1=sc.nextFloat();
		double arCir=Math.PI*r1*r1;
		System.out.println("Area of Circle is:"+arCir);
	}
	double areaOfRhombus(double d1,double d2) {
		System.out.println("Area of rhombus");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter d1:");
		double area=sc.nextDouble();
		System.out.println("Enter d2:");
		double area1=sc.nextDouble();
		double area3=d1*d2*0.5;
		System.out.println("Area of rhombus is:" +area3);
		return area3;
		
		
		
	}

}
