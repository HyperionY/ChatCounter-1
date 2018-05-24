package edu.handong.csee.java.chatcounter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main actor = new Main();
		actor.acto();
	}
	
	private void acto() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in the directory of file:");
		String fileName = keyboard.nextLine();
		FileLoader file = new FileLoader(fileName);
		String data = file.getData();
		System.out.println(data);
		keyboard.close();
	}
}