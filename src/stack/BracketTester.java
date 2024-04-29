package stack;

import java.util.LinkedList;


public class BracketTester {
	 
	public static String checkBrackets(String input) {
	        LinkedList<Character> stack = new LinkedList<>();
	        char[] chars = input.toCharArray();

	        for (char c : chars) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (stack.isEmpty()) {
	                    return "Fehlerhafte Klammerung!";
	                }
	                char top = stack.peek();
	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
	                    return "Fehlerhafte Klammerung!";
	                }
	                stack.pop();
	            }
	        }

	        if (!stack.isEmpty()) {
	            return "Fehlerhafte Klammerung!";
	        } else {
	            return "Korrekte Klammerung!";
	        }
	    }
	public static void main(String[] args) {
		System.out.println(checkBrackets("{[()]}"));
	}

}
