package com.bridgelabzunorderdlist;

import java.util.Scanner;

public class Main {

	public static  void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the text to search :");
		String input = scan.nextLine();
		UnOrderedList<String> func = new UnOrderedList<String>(input);
		System.out.println(func.search());
	}

}