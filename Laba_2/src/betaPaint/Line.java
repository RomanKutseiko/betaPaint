package betaPaint;

public class Line extends Shape {
	int x2, y2;
	
	Line (int x1, int y1, int x2, int y2){
		super (x1, y1);
		this.x2 = x2;
		this.y2 = y2;
	}
}