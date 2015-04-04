package betaPaint;

import javafx.scene.canvas.GraphicsContext;

public class Drawer {
	
	public static void draw(Ellipse ellipse, GraphicsContext gc){		
		gc.fillOval(ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight());
	}

	public static void draw(Line line, GraphicsContext gc){		
		gc.strokeLine(line.getX(), line.getY(), line.getWidth(), line.getHeight());
	}

	public static void draw(Rectangle rect, GraphicsContext gc){		
		gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
	}
	
	public static void draw(Triangle triangle, GraphicsContext gc){		
		double[] pointsX = new double[3]; //arrays are needed to create Polygons
		double[] pointsY = new double[3];
		pointsX[0] = triangle.getX(); 
		pointsX[1] = triangle.getX()+(triangle.getWidth()/2);
		pointsX[2] = triangle.getX()+triangle.getWidth();
		pointsY[0] = triangle.getY()+ triangle.getHeight(); 
		pointsY[1] = triangle.getY();
		pointsY[2] = triangle.getY()+triangle.getHeight();
		gc.fillPolygon(pointsX, pointsY, 3); //3 (points), Triangle
	}
	
	public static void draw(Parallelogram parallelogram, GraphicsContext gc){		
		double[] pointsX = new double[4]; //arrays are needed to create Polygons
		double[] pointsY = new double[4];
		pointsX[0] = parallelogram.getX(); 
		pointsX[1] = parallelogram.getX()+(parallelogram.getWidth()/5);
		pointsX[2] = parallelogram.getX()+parallelogram.getWidth();
		pointsX[3] = parallelogram.getX()+parallelogram.getWidth()*4/5;
		pointsY[0] = parallelogram.getY(); 
		pointsY[1] = parallelogram.getY()+parallelogram.getHeight();
		pointsY[2] = parallelogram.getY()+parallelogram.getHeight();
		pointsY[3] = parallelogram.getY();
		gc.fillPolygon(pointsX, pointsY, 4); //4 (points)
	}
}
