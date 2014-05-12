import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PointsInsideFigure {
	
	private static double[][] _x = new double[][] {
		{12.5, 22.5},
		{12.5, 17.5},
		{20, 22.5}
	};
	private static double[][] _y = new double[][] {
			{6, 8.5},
			{8.5, 13.5},
			{8.5, 13.5}
	};
	private static final int FIGURES = 3;
	
	private static List<RectangleFigure> figures = new ArrayList<RectangleFigure>();

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addFigures();
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String where = isInside(x, y) ? "Inside" : "Outside";
		System.out.println(where);
	}
	
	private static void setFigure(RectangleFigure fig) {
		figures.add(fig);
	}
	
	private static void addFigures() {
		for (int i = 0; i < FIGURES; i++) {
			setFigure(RectangleFactory.createRectangle(_x[i][0], _y[i][0], _x[i][1], _y[i][1]));
		}
	}
	
	private static boolean isInside(double x, double y) {
		for (RectangleFigure rf: figures) {
			if(rf.isInside(x, y)) return true;
		}
		return false;
	}

}
