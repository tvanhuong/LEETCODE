package Day_4;
// 242
public class ValiAnagram {
	public boolean isAngram(String t, String s)
	{
		if(s.length() != t.length())
			return false;
			
		int[] bangchucai = new int[26];
		
		for(int i = 0; i < s.length(); i++)
		{
			bangchucai[s.charAt(i) - 'a']++;
			bangchucai[t.charAt(i) - 'a']--;
		}
		for(int i = 0; i < 26; i++)
		{
			if(bangchucai[i]!=0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "naragam";
		String a = "valio";
		String b = "ovalu";
		ValiAnagram Ana = new ValiAnagram();
		
		System.out.print("s và t có phải là Anagram không: "+ Ana.isAngram(t, s));
		System.out.print("\na và b có phải là Anagram không: "+ Ana.isAngram(a, b));

	}

}
