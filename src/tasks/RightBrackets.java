package tasks;

import java.util.Stack;

public class RightBrackets {

		public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (stack.isEmpty()) {
                    return false; // Es gibt keine offene Klammer für diese schließende Klammer
                } else {
                    char top = stack.pop();
                    if ((currentChar == ')' && top != '(') ||
                        (currentChar == ']' && top != '[') ||
                        (currentChar == '}' && top != '{')) {
                    	System.err.println("Fehlerhafte Klammerung!");
                        return false; // Die Klammerung stimmt nicht überein
                    }
                }
            }
        }
        System.out.println("Korrekte Klammerung!");
        return stack.isEmpty(); // Der Stack sollte leer sein, wenn die Klammerung korrekt ist
    }
}
