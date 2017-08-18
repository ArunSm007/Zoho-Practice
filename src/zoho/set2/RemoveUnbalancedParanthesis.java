package zoho.set2;

import java.util.Stack;

//Remove unbalanced parentheses in a given expression.
//
//Eg.) Input  : ((abc)((de))
//     Output : ((abc)(de))  
//
//     Input  : (((ab)
//     Output : (ab)

public class RemoveUnbalancedParanthesis {
	
	public static Stack<Integer> lStack = new Stack<>();
	public static Stack<Integer> rStack = new Stack<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "((abc)((de))";
		for(int i = 0; i < inp.length(); i++) {
			if(inp.charAt(i) == '(')
				lStack.push(i);
			else if(inp.charAt(i) == ')') {
				if(lStack.isEmpty())
					rStack.push(i);
				else
					lStack.pop();
			}
		}
		for(int i = 0; i < inp.length(); i++) {
			if(!lStack.contains(i) && !rStack.contains(i))
				System.out.print(inp.charAt(i));
		}
	}

}
