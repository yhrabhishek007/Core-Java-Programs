package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//Def->
//Deserialization is the process of converting a previously serialized byte stream back into a Java object.


public class TestDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("main method started");

		// Specify the location of the serialized file
		File f = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\Serialization.txt");

		// Used to read bytes from the file
		FileInputStream fis = new FileInputStream(f);

		// Used to convert the byte stream back into a Java object
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Read the serialized object from the file

		// Read the serialized Employee object
		Employee obj = (Employee) ois.readObject();

		// Access the Employee object's data
		System.out.println("Name: " + obj.name);
		System.out.println("Password: " + obj.password);

		// Close streams
		ois.close();
		fis.close();

		System.out.println("Deserialization completed");

	}
}



//The 5 lines I'd memorize for an interview
//Serialization: Object → Byte Stream.
//Deserialization: Byte Stream → Object.
//Interface: Serializable.
//Writing: ObjectOutputStream.writeObject().
//Reading: ObjectInputStream.readObject().


//Very Common Interview Questions
//1. What is serialization?
//Converting a Java object into a byte stream for storage or transmission.
//
//2. What is deserialization?
//Converting a serialized byte stream back into a Java object.
//
//3. Which interface is required?
//Serializable.
//
//4. Is Serializable a marker interface?
//Yes. It doesn't define methods that the implementing class must override.
//
//5. Which classes are commonly used?
//ObjectOutputStream for serialization and ObjectInputStream for deserialization.
//
//6. Which method serializes an object?
//writeObject().
//
//7. Which method deserializes an object?
//readObject().
//
//8. What exception occurs when a non-serializable object is serialized?
//NotSerializableException.
//
//9. What is serialVersionUID?
//A version identifier used to verify serialization compatibility during deserialization.
//
//10. What happens if the class changes after serialization?
//Deserialization may fail if the current class is incompatible with the serialized class version, potentially resulting in InvalidClassException.
//
//11. Does serialization save methods?
//No. Serialization primarily preserves the state of the object, such as its instance fields. The class definition/methods are not serialized as part of the object's state.
//
//12. Is static data serialized?
//No. Static fields belong to the class, not to an individual object, so they are not part of the object's serialized state.
//
//13. Is transient data serialized?
//No. A field marked transient is skipped during serialization.
