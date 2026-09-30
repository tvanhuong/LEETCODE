package Day_5;

public class ValidPalindrome {
	public boolean chuoiBatDoiXung(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right)
		{
			while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
				left++;
			while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
				right--;
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
			{
				return false;
			}
			left++;
			right--;
		}return true;
	}

	public static void main(String[] args) {
		String chuoi = "A man, a plan, a canal: Panama";
		String chuoi2 = "rar a cat";
		ValidPalindrome test = new ValidPalindrome();
		
		System.out.println(test.chuoiBatDoiXung(chuoi));
		System.out.print(test.chuoiBatDoiXung(chuoi2));

	}

}
