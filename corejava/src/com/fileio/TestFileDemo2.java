package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad\\Abhi Test2");

//		Creates the directory named by this abstract pathname.

		boolean flag = f.mkdir();

		if (flag) {
			System.out.println("Created a New Directory or Folder");
		} else {
			System.out.println("Something went wrong");
		}

//		creating txt file in new directory
		File f1 = new File(f, "FileIo.txt");
		f1.createNewFile();

		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());

		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());

		System.out.println("Free Space: " + f1.getFreeSpace());
		System.out.println("Total Space: " + f1.getTotalSpace());

		File f2 = new File("C:\\Users\\Lapcarts Electronics\\Abhi Notepad");
		String[] files = f2.list();
		int count = 0;

		for (String filename : files) {
			System.out.println(filename);
			count++;
		}
		System.out.println("Total Files Count : " + count);
		System.out.println("Total Files :" + files.length);
	}

}

/*
 * FILE I/O: File I/O means File Input/Output.
 *
 * It is used to create, read, write, update and delete files and directories.
 *
 * Real-world example: In a Student Management System, we can store student
 * details in a file and later read those details.
 */

/*
 * File class represents a file or directory path.
 *
 * IMPORTANT: Creating a File object does NOT create the actual file or folder.
 *
 * It only represents the given path.
 */

/*
 * mkdir() = make directory
 *
 * It creates ONE directory/folder.
 *
 * Returns: true -> directory created successfully false -> directory was not
 * created
 *
 * IMPORTANT: mkdir() does not create missing parent directories.
 *
 * Example: C:\A\B\C
 *
 * If A and B do not exist, mkdir() will not create all of them.
 */

/*
 * mkdirs()
 *
 * Creates the directory AND any missing parent directories.
 *
 * Example: C:\A\B\C
 *
 * mkdirs() can create A, B and C if they don't exist.
 *
 * Example:
 *
 * File folder = new File("C:\\A\\B\\C"); folder.mkdirs();
 */

/*
 * Creating a File object inside the newly created directory.
 *
 * new File(parent, child) creates a path using the parent File object and the
 * child file name.
 *
 * Here: f -> Abhi Test2 folder FileIo.txt -> file name
 *
 * IMPORTANT: This line only creates the File object. It does NOT create the
 * physical file.
 */

/*
 * createNewFile()
 *
 * Actually creates the physical file.
 *
 * Returns: true -> file was created false -> file already exists
 *
 * It creates an EMPTY file.
 */

/*
 * canExecute()
 *
 * Checks whether the file can be executed.
 *
 * Returns: true -> execution is allowed false -> execution is not allowed
 *
 * Mostly useful for executable files and permissions.
 */

/*
 * canRead()
 *
 * Checks whether we have permission to read the file.
 *
 * true -> file can be read false -> file cannot be read
 */

/*
 * canWrite()
 *
 * Checks whether we have permission to write data into the file.
 *
 * true -> file can be written false -> file cannot be written
 */

/*
 * getAbsolutePath()
 *
 * Returns the complete/absolute path of the file.
 *
 * Example: C:\Users\Lapcarts Electronics\Abhi Notepad\ Abhi Test2\FileIo.txt
 */

/*
 * getCanonicalPath()
 *
 * Returns the normalized/canonical path.
 *
 * It resolves things like: . -> current directory .. -> parent directory
 *
 * For a simple path, absolute path and canonical path may look the same.
 */

/*
 * length()
 *
 * Returns the size of the FILE in bytes.
 *
 * IMPORTANT: length() = file size
 *
 * Example: If FileIo.txt contains 100 bytes:
 *
 * f1.length() -> 100
 */

/*
 * getFreeSpace()
 *
 * Returns the approximate FREE space available on the disk/file system.
 *
 * The value is returned in BYTES.
 *
 * IMPORTANT: This is NOT the size of our file.
 */

/*
 * getTotalSpace()
 *
 * Returns the TOTAL storage space of the disk/file system.
 *
 * The value is returned in BYTES.
 *
 * Example:
 *
 * getTotalSpace() -> total disk capacity getFreeSpace() -> free disk space
 * length() -> size of our file
 */

/*
 * getUsableSpace()
 *
 * Returns the amount of space that is available for the current Java
 * application/user.
 *
 * Value is returned in BYTES.
 */

/*
 * getName()
 *
 * Returns only the name of the file.
 *
 * Example: FileIo.txt
 */

/*
 * getParent()
 *
 * Returns the parent directory path.
 *
 * Example: C:\Users\Lapcarts Electronics\Abhi Notepad\Abhi Test2
 */

/*
 * getParentFile()
 *
 * Same concept as getParent(), but returns the parent as a File object.
 *
 * getParent() -> String getParentFile() -> File
 */

/*
 * exists()
 *
 * Checks whether the file or directory exists.
 *
 * true -> exists false -> does not exist
 */

/*
 * isFile()
 *
 * Checks whether the given path represents a FILE.
 *
 * true -> it is a file false -> it is not a file
 */

/*
 * isDirectory()
 *
 * Checks whether the given path represents a DIRECTORY.
 *
 * true -> it is a directory false -> it is not a directory
 */

/*
 * ------------------------------------------------------- LISTING FILES AND
 * DIRECTORIES -------------------------------------------------------
 *
 * Let's take another folder:
 */

/*
 * list()
 *
 * Returns the names of files and directories inside the given directory.
 *
 * Return type: String[]
 *
 * IMPORTANT: list() returns BOTH files and folders.
 */

/*
 * IMPORTANT:
 *
 * The above count is NOT necessarily the number of files.
 *
 * Why?
 *
 * list() returns:
 *
 * Files + Directories
 *
 * So it is better to call them:
 *
 * Total Items
 *
 * instead of:
 *
 * Total Files
 */

/*
 * ------------------------------------------------------- listFiles()
 * -------------------------------------------------------
 *
 * listFiles() returns File objects instead of String names.
 *
 * list() -> String[] listFiles() -> File[]
 *
 * listFiles() is generally more useful because we can directly call File
 * methods on each item.
 */

/*
 * Check whether the item is a file.
 */

/*
 * Check whether the item is a directory.
 */

/*
 * ------------------------------------------------------- delete()
 * -------------------------------------------------------
 *
 * Deletes a file or an empty directory.
 *
 * Returns: true -> successfully deleted false -> deletion failed
 *
 * Example:
 *
 * if (f1.delete()) { System.out.println("File deleted"); }
 *
 * NOTE: A directory generally needs to be empty before it can be deleted using
 * File.delete().
 */

/*
 * ------------------------------------------------------- renameTo()
 * -------------------------------------------------------
 *
 * Used to rename or move a file/directory.
 *
 * Example:
 *
 * File newFile = new File(f, "NewFile.txt"); f1.renameTo(newFile);
 *
 * FileIo.txt ↓ NewFile.txt
 */

/*
 * ------------------------------------------------------- lastModified()
 * -------------------------------------------------------
 *
 * Returns the last modified time of the file.
 *
 * The returned value is in milliseconds.
 *
 * It can be converted into a readable Date.
 */

/*
 * ------------------------------------------------------- IMPORTANT FILE
 * METHODS TO REMEMBER -------------------------------------------------------
 *
 * exists() -> Checks whether file/folder exists
 *
 * createNewFile() -> Creates a new empty file
 *
 * mkdir() -> Creates one directory
 *
 * mkdirs() -> Creates directory + missing parents
 *
 * delete() -> Deletes file/empty directory
 *
 * isFile() -> Checks whether path is a file
 *
 * isDirectory() -> Checks whether path is a directory
 *
 * canRead() -> Checks read permission
 *
 * canWrite() -> Checks write permission
 *
 * canExecute() -> Checks execute permission
 *
 * getName() -> Returns file/folder name
 *
 * getPath() -> Returns the path used to create File
 *
 * getAbsolutePath() -> Returns absolute path
 *
 * getCanonicalPath()-> Returns normalized/canonical path
 *
 * getParent() -> Returns parent path as String
 *
 * getParentFile() -> Returns parent as File object
 *
 * length() -> Returns file size in bytes
 *
 * lastModified() -> Returns last modification time
 *
 * list() -> Returns names inside directory
 *
 * listFiles() -> Returns File objects inside directory
 *
 * renameTo() -> Renames/moves file or directory
 *
 * getFreeSpace() -> Returns free disk space
 *
 * getTotalSpace() -> Returns total disk space
 *
 * getUsableSpace() -> Returns usable disk space
 */

/*
 * FINAL INTERVIEW DEFINITION:
 *
 * "The File class in Java is used to represent files and directories. It
 * provides methods to create, delete, rename, check existence, check
 * permissions, retrieve file information, list directory contents, and check
 * disk space."
 *
 * IMPORTANT:
 *
 * File class mainly deals with FILE/DIRECTORY INFORMATION and FILE SYSTEM
 * OPERATIONS.
 *
 * For actually reading and writing CONTENT, we use classes/APIs such as:
 *
 * FileReader FileWriter FileInputStream FileOutputStream BufferedReader
 * BufferedWriter Files
 */
