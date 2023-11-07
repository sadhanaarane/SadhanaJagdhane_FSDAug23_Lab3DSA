package com.paranthesis.driver;

import com.paranthesis.service.BalancedParanthesisChecker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "([[{}]])";
		String input2 = "([[{}]]))";
		String input3 = "({[})]";
		String input4 = "{}()[]";

		if (BalancedParanthesisChecker.isBalanced(input1)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		if (BalancedParanthesisChecker.isBalanced(input2)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		if (BalancedParanthesisChecker.isBalanced(input3)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

		if (BalancedParanthesisChecker.isBalanced(input4)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
