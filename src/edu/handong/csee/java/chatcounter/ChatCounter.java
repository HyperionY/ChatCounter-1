package edu.handong.csee.java.chatcounter;

import java.util.Scanner;

public class ChatCounter {
	static void main(String[] args) {
		ChatCounter actor = new ChatCounter();
		actor.acto();
	}
	
	private void acto() {
		Scanner keyboard = new Scanner(System.in);
		FileLoader file = new FileLoader();
		System.out.println("Type in your name of file:");
		String fileName = keyboard.nextLine();
		file.ScanFile(fileName);
		String data = file.getData();
		System.out.println(data);
		keyboard.close();
	}
}
