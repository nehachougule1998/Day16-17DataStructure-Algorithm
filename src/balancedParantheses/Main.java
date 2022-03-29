package balancedParantheses;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the expression:");
		String input = scan.nextLine();
		BalancedParentheses<String> balancedParantheses = new BalancedParentheses<String>(input);
		System.out.println(balancedParantheses.checkParanthesis());
	}
}
