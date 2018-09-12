// Assignment 12 
package mypack;

import java.io.File;
import java.util.Scanner;

public class Files {

	
	static int countfiles = 0;
 static int countfolders=0;
	public static void listFilesAndFilesSubDirectories(String directoryName) {

		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {

			if (file.isFile()) {

				System.out.println(file.getAbsolutePath() + " " + countfiles++);
			} else if (file.isDirectory()) {
countfolders++;
				listFilesAndFilesSubDirectories(file.getAbsolutePath());
			}
		}
		
	}

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);   
	     System.out.println("Enter a directory to check");  
		final String directoryWindows = sc.next(); 

		listFilesAndFilesSubDirectories(directoryWindows);

		System.out.println("Total no of Files in the Directory are: "+(countfiles-1));
		System.out.println("Total no of Folders in the Directory are: "+(countfolders));
	}
}
*/
