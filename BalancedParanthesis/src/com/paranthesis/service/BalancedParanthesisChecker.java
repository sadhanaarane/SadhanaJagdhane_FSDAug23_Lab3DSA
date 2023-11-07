package com.paranthesis.service;

import java.util.Stack;

public class BalancedParanthesisChecker {

	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char openParanthesis = stack.pop();
					if (!((openParanthesis == '(' && ch == ')') || (openParanthesis == '[' && ch == ']')
							|| (openParanthesis == '{' && ch == '}'))) {
						return false;
					}

				}
			}
		}
		if (stack.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}
}
