import java.util.Scanner;


public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		System.out.println(calculateArea(width, height));
	}
	
	private static double calculateArea(double width, double height) {
		return width * height;
	}

}
