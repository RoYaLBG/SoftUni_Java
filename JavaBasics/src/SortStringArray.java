import java.util.Arrays;
import java.util.Scanner;


public class SortStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int elements = sc.nextInt();
		String[] cities = new String[elements];
		
		for (int i = 0; i < elements; i++) {
			cities[i] = sc.next();
		}
		
		Arrays.sort(cities);
		
		for (int i = 0; i < elements; i++) {
			System.out.println(cities[i]);
		}
	}
}
