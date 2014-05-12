
public class RectangleFigure {

	private double _x1;
	private double _x2;
	private double _y1;
	private double _y2;
	
	public RectangleFigure(double x1, double y1, double x2, double y2) {
		this._x1 = x1;
		this._y1 = y1;
		this._x2 = x2;
		this._y2 = y2;
	}
	
	public boolean isInside(double x, double y) {
		if (x < this._x1 || x > this._x2) {
			return false;
		}
		if (y < this._y1 || y > this._y2) {
			return false;
		}
		return true;
	}
}
