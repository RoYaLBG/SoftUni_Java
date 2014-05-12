import java.util.*;

public class SmallestOfThree {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nums = new double[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextDouble();
		}
		Double[] nums1 = convert(nums);
		System.out.println(Collections.min(Arrays.asList(nums1)));
	}
	
	public static Double[] convert(double[] chars) {
        Double[] copy = new Double[chars.length];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = Double.valueOf(chars[i]);
        }
        return copy;
    }
}
