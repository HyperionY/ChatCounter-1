package edu.handong.csee.java.chatcounter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FileLoader {
	String data = null;
	public void ScanFile(String fileName) {
		String cache = null;
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName));
			Scanner scanner = new Scanner(stream);
			while(scanner.hasNext()) {
				cache = scanner.next();
				data = data + cache;
				scanner.close();
				stream.close();
			}
		} catch(FileNotFoundException e) {
			System.out.println("Error while opening the file " + fileName);
		}
		
		catch (EOFException e) {
			System.out.println("Error while reading the file " + fileName);
			System.out.println("End of the file.");
		}
		
		catch (IOException e) {
			System.out.println("Error while reading the file " + fileName);
		}
	}
	
	public String getData() {
		return this.data;
	}
}
