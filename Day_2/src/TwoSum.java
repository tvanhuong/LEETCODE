import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> soTay = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int soCanTim = target - nums[i];
            
            if (soTay.containsKey(soCanTim)) {
                return new int[] { soTay.get(soCanTim), i };
            }
            soTay.put(nums[i], i);
        }
        return new int[] {};
    }

	public static void main(String[] args) 
	{
		int[] nums = {2, 5, 7, 9};
		int target = 9;
		
		TwoSum tw = new TwoSum();
		System.out.print(Arrays.toString(tw.twoSum(nums, target)));
	}
}
