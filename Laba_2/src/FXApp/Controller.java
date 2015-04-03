package FXApp;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import betaPaint.Ellipse;
import betaPaint.Triangle;
import betaPaint.Parallelogram;
import betaPaint.Rectangle;
import betaPaint.Line;

public class Controller {
	
	@FXML
	private Button btnEllipse, btnTriangle, btnRectangle, btnLine, btnParallelogram, but;
	
	@FXML
	private TextField textWidth, textHeight, textX, textY;			  
					  
	@FXML
	private Canvas canvas;
	
	@FXML
	private void btnEllipseOnClick() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	
	@FXML
	private void btnTriangleOnClick() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		double[] pointsX = new double[3]; //arrays are needed to create Polygons
		double[] pointsY = new double[3];
		pointsX[0] = getX(); 
		pointsX[1] = getX()+(getWidth()/2);
		pointsX[2] = getX()+getWidth();
		pointsY[0] = getY()+ getHeight(); 
		pointsY[1] = getY();
		pointsY[2] = getX()+getHeight();
		gc.fillPolygon(pointsX, pointsY, 3); //3 (points), Triangle
	}
	
	@FXML
	private void btnRectangleOnClick() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@FXML
	private void btnLineOnClick() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.strokeLine(getX(), getY(), getWidth(), getHeight());
	}
	
	@FXML
	private void btnParallelogramOnClick() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		double[] pointsX = new double[4]; //arrays are needed to create Polygons
		double[] pointsY = new double[4];
		pointsX[0] = getX(); 
		pointsX[1] = getX()+(getHeight()/2);
		pointsX[2] = getX()+getWidth();
		pointsX[3] = getX()-(getHeight()/2);
		pointsY[0] = getY(); 
		pointsY[1] = getY()+getHeight();
		pointsY[2] = getY()+getHeight();
		pointsY[3] = getY();
		gc.fillPolygon(pointsX, pointsY, 4); //4 (points)
	}
	
	@FXML
	private void btnConst(){
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		gc.fillOval(15, 15, 15, 15);
	}
	
	
	private int getX(){
		return Integer.parseInt(textX.getText());
	}
	
	private int getY(){
		return Integer.parseInt(textY.getText());
	}
	
	private int getWidth(){
		return Integer.parseInt(textWidth.getText());
	}
	
	private int getHeight(){
		return Integer.parseInt(textHeight.getText());
	}

}
