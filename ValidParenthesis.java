import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr=sc.next().toCharArray();
		boolean flag=false;
		Stack<Character>stack=new Stack<>();
		for(char c:arr){
		    if(c=='{')
		    stack.push('}');
		    else if(c=='(')
		    stack.push(')');
		    else if(c=='[')
		    stack.push(']');
		    else if(stack.isEmpty() || c!=stack.pop())
		    flag=false;
		    else
		    flag=true;
		}
		if(flag==true)
		System.out.println("Valid Parenthesis");
		else
		System.out.print("Invalid Parenthesis");
	}
}
