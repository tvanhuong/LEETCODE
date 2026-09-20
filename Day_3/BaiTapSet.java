package Day_3;
import java.util.HashSet;
public class BaiTapSet {

	public static void main(String[] args) {
		HashSet<Integer> sotay = new HashSet<>();
		
		sotay.add(10);
		sotay.add(20);
		sotay.add(10);
		
		System.out.print("Các số có trong sổ" + sotay);
		System.out.print("\nCó số 20 trong sổ không? " + sotay.contains(20));
		System.out.print("\nCó số 15 trong sổ không? " + sotay.contains(15));
	}

}
