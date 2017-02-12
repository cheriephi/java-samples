package controller;

import java.util.Scanner;

public class Presenter {
	public void greet(String message) {
		System.out.println(message);
	}
	
	public String askName(String message) {
		System.out.println(message);
		Scanner in = new Scanner(System.in);		
		String name = in.nextLine();
		in.close();
		return name;
	}
	
	public void sendMessage(String message) {
		System.out.println(message);
	}
}
