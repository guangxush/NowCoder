package stack;

import java.util.Stack;
/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are+,-,*,/. Each operand may be an integer or another expression.
 * Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++) {
        	if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")
        			||tokens[i].equals("/")) {
        		int b = stack.pop();
        		int a = stack.pop();
        		stack.push(Calculate(tokens[i],a,b));
        	}else{
        		stack.push(Integer.parseInt(tokens[i]));
        	}
        }
        return stack.pop();
    }
    private int Calculate(String op, int a,int b) {
    	if(op.equals("+")) {
    		return a+b;
    	}else if(op.equals("-")){
    		return a-b;
    	}else if(op.equals("*")) {
    		return a*b;
    	}else {
    		return a/b;
    	}
    }
}
