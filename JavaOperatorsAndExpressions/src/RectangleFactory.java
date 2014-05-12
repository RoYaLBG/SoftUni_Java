
public abstract class RectangleFactory {

	public static RectangleFigure createRectangle(double x1, double y1, double x2, double y2) {
		return new RectangleFigure(x1, y1, x2, y2);
	}
	
}
