package zoho.set2;

import java.util.Stack;

//Check whether a given mathematical expression is valid.
//
//Eg.) Input  : (a+b)(a*b)
//     Output : Valid
//
//     Input  : (ab)(ab+)
//     Output : Invalid
//
//     Input  : ((a+b)
//     Output : Invalid 

public class ExpressionValidator {
	public static boolean validateExpression(String exp) {
		Stack<Character> stk = new Stack<>();
		for(int i = 0; i < exp.length(); i++) {
//			System.out.println(stk.toString());
			char ch = exp.charAt(i);
			switch (ch) {
			case '(':
				stk.push(ch);
				if(i == exp.length() - 1 || (!Character.isAlphabetic(exp.charAt(i+1)) && exp.charAt(i+1) != ')' && exp.charAt(i+1) != '('))
					return false;
				break;
			case ')':
				if(stk.isEmpty())
					return false;
				else {
					String tmp = "";
					while(!stk.isEmpty() && stk.peek() != '(') {
						tmp += stk.pop();
					}
					if(stk.isEmpty() || tmp.length() != 1)
						return false;
					stk.pop();
					stk.push('x');
				}
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				if(stk.isEmpty() || stk.peek() == '(' || i == exp.length() - 1 || exp.charAt(i+1) == ')')
					return false;
				stk.pop();
				stk.push('x');
				i++;
				break;
			default:
				if(stk.isEmpty() || !Character.isAlphabetic(stk.peek()))
					stk.push(ch);
				break;
			}
		}
//		System.out.println(stk.toString());
		for(char ch : stk)
			if(!Character.isAlphabetic(ch))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateExpression("ab(ab)ab"));
	}

}
