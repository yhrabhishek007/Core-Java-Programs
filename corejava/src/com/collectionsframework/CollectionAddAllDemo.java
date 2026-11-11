package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

//Write a Java program using the Collection interface to perform the following operations:
//Create two collections of String elements. Add 5 student names to the first collection and 5 student
//names to the second collection using the add() method. Then add all the elements of the second 
//collection into the first collection using the addAll() method. Finally, display the elements of 
//both collections and the final collection after combining them.

public class CollectionAddAllDemo {

	public static void main(String[] args) {

		Collection<String> student = new ArrayList<>();

		student.add("Rakesh");
		student.add("Bhanu");
		student.add("Bhargav");
		student.add("Sudheer");
		student.add("Vamsi");

		System.out.println(student);

		Collection<String> student1 = new ArrayList<String>();

		student1.add("Hemanth");
		student1.add("Vivek");
		student1.add("Sridhar");
		student1.add("Shanmukh");
		student1.add("Swamy");

		System.out.println(student1);

		Collection<String> StdAll = new ArrayList<>();

		// addAll() - adds all elements of one collection to another
		StdAll.addAll(student);
		StdAll.addAll(student1);

		System.out.println(StdAll);

		// clear() - removes all elements from the collection
		// student.clear();

		System.out.println(student);
		System.out.println(StdAll);

		// contains() - checks whether the specified element exists in the collection
		System.out.println(StdAll.contains("Swamy"));
		System.out.println(StdAll.contains("vamsi"));

		// containsAll() - checks whether all elements of the specified collection exist
		System.out.println(StdAll.containsAll(student));
		System.out.println(StdAll.containsAll(student1));

		// remove() - removes the specified element from the collection
		System.out.println(StdAll.remove("Bhargav"));

		// removeAll() - removes all elements of the specified collection
		System.out.println(StdAll.removeAll(student));

		System.out.println(StdAll);

//		 *Core java 
//		 Write a Java program using the Collection interface to:
//		 Create a Collection<String> to store student names.
//		 Add 10 student names to the collection.
//		 Display all student names.
//		 Check whether a particular student name exists using contains().
//		 Remove a particular student name using remove().
//		 Display the size of the collection.
//		 Check whether the collection is empty using isEmpty().
//		 Finally, clear the collection using clear() and verify whether it is empty.

		Collection<Integer> student4 = new ArrayList<>();

		student4.add(10);
		student4.add(20);
		student4.add(30);
		student4.add(40);
		student4.add(50);
		student4.add(60);
		student4.add(70);
		student4.add(80);
		student4.add(90);
		student4.add(100);

		// Display the collection
		System.out.println(student4);

		// contains() - checks whether the specified student exists
		System.out.println(student4.contains(50));

		// remove() - removes the specified student from the collection
		student4.remove(30);

		// size() - returns the number of students in the collection
		System.out.println(student4.size());

		// isEmpty() - checks whether the collection is empty
		System.out.println(student4.isEmpty());

		// clear() - removes all students from the collection
		student4.clear();

		// Display the collection after clearing
		System.out.println(student4);

		// isEmpty() - verifies that the collection is empty
		System.out.println(student4.isEmpty());

	}

}
