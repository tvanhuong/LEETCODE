package Day_6;
import java.util.Stack;
public class Valid_Parentheses_Dau_Ngoac_Hop_Le {
	public boolean isVaild(String s)
	{
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray())
		{
			if(c == '(') {stack.push(')');}
			else if(c == '[') {stack.push(']');}
			else if (c == '{') {stack.push('}');}
			else if(stack.isEmpty() || stack.pop() != c )
			{
				return false;
			}
		} return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s = "(){[]}";
		String t = "{}[}[)";
		Valid_Parentheses_Dau_Ngoac_Hop_Le ktr = new Valid_Parentheses_Dau_Ngoac_Hop_Le();
		System.out.print("Kiem tra dau ngoac co hop le khong: "+ ktr.isVaild(s) );
		System.out.print("\nKiem tra dau ngoac co hop le khong: "+ ktr.isVaild(t) );
	}

}
