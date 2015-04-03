package betaPaint;

public class Triangle extends Shape {
	protected int width, height;

	public Triangle (int x, int y, int w, int h){
		super(x, y);
		width = w;
		height = h;
	}
}
