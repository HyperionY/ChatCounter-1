package edu.handong.csee.java.chatcounter;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {
	String data = null;
	private File file;
	public FileLoader(String filename) {
		file = new File(filename);
	}
	
	public void ScanFile() {
		String cache = null;
		try {
			FileReader freader = new FileReader(file);
			BufferedReader breader = new BufferedReader(freader);
			while((cache = breader.readLine())!=null) {
				this.data = this.data+cache;
			}
			breader.close();
		} catch(FileNotFoundException e) {
			this.data = "Error while opening the file ";
		}
		
		catch (EOFException e) {
			this.data = "Error while reading the file "+"\nEnd of the file.";
		}
		
		catch (IOException e) {
			this.data = "Error while reading the file ";
		}
	}
	
	public String getData() {
		return this.data;
	}
}
