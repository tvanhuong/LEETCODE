package Day_3;
import java.util.HashSet;
public class Contains_Duplicate {
	public boolean Duplicate(int[] nums)
	{
		HashSet<Integer> sotay = new HashSet<>();
		
		for(int i = 0; i < nums.length; i++)
		{
			if(sotay.contains(nums[i]))
				return true;
			sotay.add(nums[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		Contains_Duplicate dp = new Contains_Duplicate();
		System.out.print(dp.Duplicate(nums));

	}

}
