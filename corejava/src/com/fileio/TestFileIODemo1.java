package com.fileio;

//1. Definition of File I/O
//File I/O (File Input/Output) is the process of creating, reading, writing, updating, and deleting data in files using a program.
//
//Input → Taking/reading data from a file
//
//Output → Sending/writing data to a file
//
//Simple definition for interview
//File I/O in Java is used to read data from files and write data to files using Java's file-handling classes and APIs.

//Real-world example
//Imagine you are building a Student Management System.
//
//You have 1,000 students, and you want to store their information:

import java.io.File;
import java.io.IOException;

public class TestFileIODemo1 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		/*
		 * File I/O means File Input/Output.
		 *
		 * Java provides the File class to work with files and directories.
		 *
		 * Here, we are creating a File object that represents the following file
		 * location:
		 *
		 * C:\Users\Lapcarts Electronics\Abhi Notepad\Abhi Test\FileIo.txt
		 *
		 * IMPORTANT: The File object does NOT create the actual file. It only
		 * represents the file path.
		 */
		File f = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test\\FileIo.txt");

		/*
		 * createNewFile() can throw IOException.
		 *
		 * IOException is a checked exception, so we must either:
		 *
		 * 1. Handle it using try-catch OR 2. Declare it using "throws IOException"
		 *
		 * Here, we are handling it using try-catch.
		 */
		try {

			System.out.println("Inside try block");

			/*
			 * exists() checks whether a file or directory already exists at the specified
			 * path.
			 *
			 * Returns: true -> file/directory exists false -> file/directory does not exist
			 */
			if (!f.exists()) {

				/*
				 * createNewFile() creates a new EMPTY file.
				 *
				 * It returns: true -> file was successfully created false -> file could not be
				 * created
				 *
				 * IMPORTANT: createNewFile() does NOT create missing parent directories. The
				 * parent directory must already exist.
				 */
				boolean flag = f.createNewFile();

				if (flag) {
					System.out.println("File has been created successfully!");
				} else {
					System.out.println("Something went wrong while creating the file.");
				}

			} else {

				/*
				 * This block executes when a file already exists with the same name and
				 * location.
				 */
				System.out.println("A file with this name already exists!");
			}

		} catch (IOException e) {

			/*
			 * If a file-related input/output operation fails, IOException may be thrown.
			 *
			 * printStackTrace() prints detailed information about where and why the
			 * exception occurred.
			 */
			System.out.println("Exception occurred while working with file.");
			e.printStackTrace();
		}

		System.out.println("Main method ended");
	}
}

//## Why do we need File I/O?
//
//**File I/O = File Input/Output.**
//
//A Java application often needs to communicate with files stored on the computer.
//For example, an application may need to:
//
//- Create a file
//- Read data from a file
//- Write data into a file
//- Append data to an existing file
//- Delete a file
//- Check whether a file exists
//- Get file size
//- Get file name/path
//- Create directories
//- Rename files
//- Store logs
//- Store configuration/data
//- Process uploaded/downloaded files
//
//For example, imagine a banking application. It may need to save transaction information, generate reports, read configuration files, or maintain logs.
//
//Without I/O, a program generally cannot persist information in ordinary files.
//
//---
//
//# Most important concept in your program
//
//### `File`
//
//```
//File f = new File("C:\\test\\FileIo.txt");
//```
//
//This is one of the most important things to understand:
//
//> **Creating a `File` object does NOT create a physical file.**
//
//It only creates a Java object representing a pathname.
//
//For example:
//
//```
//File f = new File("C:\\test\\abc.txt");
//```
//
//At this point, `abc.txt` may or may not exist.
//
//To actually create it:
//
//```
//f.createNewFile();
//```
//
//---
//
//# `exists()`
//
//```
//if (!f.exists()) {
//   // create file
//}
//```
//
//`exists()` checks whether the specified file/directory exists.
//
//### Returns:
//
//```
//true  → exists
//false → does not exist
//```
//
//Example:
//
//```
//if (f.exists()) {
//   System.out.println("File exists");
//} else {
//   System.out.println("File does not exist");
//}
//```
//
//---
//
//# `createNewFile()`
//
//```
//boolean flag = f.createNewFile();
//```
//
//This method creates a new empty file.
//
//Its return type is:
//
//```
//boolean
//```
//
//### If creation succeeds:
//
//```
//true
//```
//
//### If the file already exists:
//
//```
//false
//```
//
//It can also throw:
//
//```
//IOException
//```
//
//because file operations can fail due to things such as permissions, invalid paths, unavailable storage, etc.
//
//---
//
//# Why `if (!f.exists())` before `createNewFile()`?
//
//You technically don't have to do this.
//
//You could simply write:
//
//```
//boolean flag = f.createNewFile();
//```
//
//If the file already exists, `createNewFile()` returns `false`.
//
//So this:
//
//```
//if (!f.exists()) {
//   boolean flag = f.createNewFile();
//}
//```
//
//is useful when you specifically want to print different messages such as:
//
//```
//File doesn't exist → Creating file...
//File already exists → Don't create it again.
//```
//
//---
//
//# `IOException`
//
//This is another very important concept.
//
//```
//try {
//   f.createNewFile();
//} catch (IOException e) {
//   e.printStackTrace();
//}
//```
//
//File operations involve the operating system and external resources, so they can fail.
//
//For example:
//
//- File doesn't have permission
//- Directory doesn't exist
//- Disk/storage problem
//- Invalid path
//- File system error
//- Access denied
//
//Therefore, `createNewFile()` declares:
//
//```
//throws IOException
//```
//
//Since `IOException` is a **checked exception**, Java requires you to handle or declare it.
//
//### Option 1 — try/catch
//
//```
//try {
//   f.createNewFile();
//} catch (IOException e) {
//   e.printStackTrace();
//}
//```
//
//### Option 2 — throws
//
//```
//public static void main(String[] args) throws IOException {
//   f.createNewFile();
//}
//```
//
//---
//
//# Very important: Parent directory
//
//Suppose you have:
//
//```
//File f = new File("C:\\abc\\xyz\\test.txt");
//```
//
//If:
//
//```
//C:\abc
//```
//
//exists but:
//
//```
//C:\abc\xyz
//```
//
//doesn't exist, then:
//
//```
//f.createNewFile();
//```
//
//**will not automatically create `xyz`.**
//
//You need to create the directories first.
//
//For example:
//
//```
//File f = new File("C:\\abc\\xyz\\test.txt");
//
//File parent = f.getParentFile();
//
//if (!parent.exists()) {
//   parent.mkdirs();
//}
//
//f.createNewFile();
//```
//
//This distinction is frequently important in real projects.
//
//---
//
//# File vs File I/O
//
//Don't confuse these concepts.
//
//### `File`
//
//`File` mainly represents and provides information about a file or directory.
//
//Example:
//
//```
//File f = new File("test.txt");
//```
//
//You can use it to:
//
//```
//f.exists();
//f.createNewFile();
//f.delete();
//f.length();
//f.getName();
//f.getAbsolutePath();
//f.isFile();
//f.isDirectory();
//```
//
//### File I/O
//
//File I/O is the broader concept of **reading and writing data**.
//
//For example:
//
//```
//File
//↓
//FileInputStream       → read bytes
//FileOutputStream      → write bytes
//
//FileReader            → read characters
//FileWriter            → write characters
//
//BufferedReader        → efficient character reading
//BufferedWriter        → efficient character writing
//```
//
//---
//
//# Important Java File I/O classes
//
//A useful way to remember them:
//
//| Class | Main purpose |
//| --- | --- |
//| `File` | File/directory information and operations |
//| `FileInputStream` | Read bytes |
//| `FileOutputStream` | Write bytes |
//| `FileReader` | Read characters |
//| `FileWriter` | Write characters |
//| `BufferedReader` | Efficiently read text |
//| `BufferedWriter` | Efficiently write text |
//| `PrintWriter` | Convenient text output |
//| `Scanner` | Read formatted text/input |
//| `Files` | Modern file operations |
//| `Path` | Represents a file/directory path |
//
//For modern Java applications, you'll often see:
//
//```
//Path
//Files
//```
//
//from:
//
//```
//java.nio.file
//```
//
//rather than relying only on the older `File` API.
//
//---
//
//# `File` vs `Path`
//
//Your example uses the older-style:
//
//```
//File f = new File("test.txt");
//```
//
//Modern Java commonly uses:
//
//```
//Path path = Path.of("test.txt");
//```
//
//and:
//
//```
//Files.createFile(path);
//```
//
//Example:
//
//```
//Path path = Path.of("test.txt");
//
//if (!Files.exists(path)) {
//   Files.createFile(path);
//   System.out.println("File created");
//}
//```
//
//For learning Java File I/O, you should understand **both `File` and `Path/Files`**, but `Path`/`Files` are particularly important for newer Java code.
//
//---
//
//# Important methods of `File`
//
//You should know these:
//
//```
//f.exists()
//```
//
//Checks whether file/directory exists.
//
//```
//f.isFile()
//```
//
//Checks whether it is a file.
//
//```
//f.isDirectory()
//```
//
//Checks whether it is a directory.
//
//```
//f.createNewFile()
//```
//
//Creates a new empty file.
//
//```
//f.delete()
//```
//
//Deletes the file/directory.
//
//```
//f.length()
//```
//
//Returns file size in bytes.
//
//```
//f.getName()
//```
//
//Returns file name.
//
//```
//f.getAbsolutePath()
//```
//
//Returns absolute path.
//
//```
//f.getParent()
//```
//
//Returns parent path.
//
//```
//f.canRead()
//```
//
//Checks read permission.
//
//```
//f.canWrite()
//```
//
//Checks write permission.
//
//```
//f.canExecute()
//```
//
//Checks execute permission.
//
//---
//
//# Important interview points
//
//### 1\. Does `new File()` create a physical file?
//
//**No.**
//
//```
//File f = new File("abc.txt");
//```
//
//Only creates a `File` object representing the pathname.
//
//---
//
//### 2\. How do you create the physical file?
//
//```
//f.createNewFile();
//```
//
//---
//
//### 3\. What does `createNewFile()` return?
//
//```
//boolean
//```
//
//`true` if the file was created, `false` if it already exists.
//
//---
//
//### 4\. What exception can `createNewFile()` throw?
//
//```
//IOException
//```
//
//---
//
//### 5\. Why is `IOException` handled using try-catch?
//
//Because it is a **checked exception**.
//
//---
//
//### 6\. Does `createNewFile()` create parent directories?
//
//**No.**
//
//If parent directories don't exist, create them first using:
//
//```
//mkdirs()
//```
//
//---
//
//### 7\. What is the difference between `mkdir()` and `mkdirs()`?
//
//```
//mkdir()
//```
//
//Creates one directory.
//
//```
//mkdirs()
//```
//
//Creates the directory and any missing parent directories.
//
//Example:
//
//```
//File f = new File("C:\\A\\B\\C");
//
//f.mkdirs();
//```
//
//It can create:
//
//```
//A
//└── B
//     └── C
//```
//
//if they don't already exist.
//
//---
//
//### 8\. Does `createNewFile()` write data?
//
//No.
//
//It creates an **empty file**.
//
//To write data, you need something such as:
//
//```
//FileWriter
//```
//
//or:
//
//```
//FileOutputStream
//```
//
//or modern APIs such as:
//
//```
//Files.write(...)
//```
//
//---
//
//# The overall File I/O flow
//
//You can remember Java File I/O roughly like this:
//
//```
//                FILE I/O
//                   |
//       +-----------+-----------+
//       |                       |
//    INPUT                    OUTPUT
//    READ                      WRITE
//       |                       |
//       |                       |
//FileInputStream          FileOutputStream
//FileReader               FileWriter
//BufferedReader           BufferedWriter
//       |                       |
//       +-----------+-----------+
//                   |
//                Files / Path
//```
//
//And your current program is only doing the **file creation** part:
//
//```
//Create File object
//      ↓
//Check whether file exists
//      ↓
//If not exists
//      ↓
//createNewFile()
//      ↓
//Empty file created
//```
//
//## One key distinction to remember
//
//**File I/O is not just file creation.**
//
//Think of it as:
//
//> **Create → Read → Write → Append → Update → Delete**
//
//Once you understand your current `File` example, the natural next steps are **writing data with `FileWriter`, reading data with `FileReader`, and then understanding buffering and try-with-resources**.