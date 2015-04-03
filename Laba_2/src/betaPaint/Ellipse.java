package betaPaint;

public class Ellipse extends Shape {
	protected int width;
	protected int height;

	public Ellipse(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

}
