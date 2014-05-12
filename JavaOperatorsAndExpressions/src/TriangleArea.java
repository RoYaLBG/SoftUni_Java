import java.util.Scanner;


public class TriangleArea {

	/**
	 * Enter each coordinate on new line, there is no String splitting here
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] coords_x = new double[3];
		double[] coords_y = new double[3];
		for (int i = 0; i < 3; i++) {
			coords_x[i] = sc.nextDouble();
			coords_y[i] = sc.nextDouble();
		}
		System.out.println(calculateArea(coords_x, coords_y));
	}
	
	
	/**
	 * area = Abs((Ax(By-Cy) + Bx(Cy-Ay) + Cx(Ay-By))/2)
	 * @param coords_x array (0 => A, 1 => B, 2 => C)
	 * @param coords_y array (0 => A, 1 => B, 2 => C)
	 * @return integer
	 */
	private static int calculateArea(double[] coords_x, double[] coords_y) {
		int area = (int)Math.abs((
				
					coords_x[0] * (coords_y[1] - coords_y[2])
					+ coords_x[1] * (coords_y[2] - coords_y[0])
					+ coords_x[2] * (coords_y[0] - coords_y[1]))
								/2
								
					);
		return area;
	}

}
