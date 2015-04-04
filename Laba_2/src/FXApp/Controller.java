package FXApp;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import betaPaint.Drawer;
import betaPaint.Ellipse;
import betaPaint.Line;
import betaPaint.Parallelogram;
import betaPaint.Rectangle;
import betaPaint.Triangle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller implements Initializable {
	
	@FXML
	private Button btnEllipse, btnTriangle, btnRectangle, btnLine, btnParallelogram, but;
	
	@FXML
	private TextField textWidth, textHeight, textX, textY;			  
					  
	@FXML
	private Canvas canvas;
	
	private GraphicsContext gc;
	
	public void initialize(URL url, ResourceBundle resBun){
		gc =  canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
	}
	
	private boolean isNumber(String str){
		boolean a = Pattern.matches("[0-9]+", str);
		return a;
	}
	
	private boolean isValidData(){
		return (isNumber(textX.getText()) && isNumber(textY.getText()) && isNumber(textWidth.getText()) && isNumber(textHeight.getText()));
	}
	
	@FXML
	private void btnEllipseOnClick() {
		if (isValidData())
			Drawer.draw(new Ellipse(getX(), getY(), getWidth(), getHeight()), gc);
	}
	
	@FXML
	private void btnTriangleOnClick() {
		if (isValidData())
		Drawer.draw(new Triangle(getX(), getY(), getWidth(), getHeight()), gc);
	}
	
	@FXML
	private void btnRectangleOnClick() {
		if (isValidData())
		Drawer.draw(new Rectangle(getX(), getY(), getWidth(), getHeight()), gc);
	}
	
	@FXML
	private void btnLineOnClick() {
		if (isValidData())
		Drawer.draw(new Line(getX(), getY(), getWidth(), getHeight()), gc);
	}
	
	@FXML
	private void btnParallelogramOnClick() {
		if (isValidData())
		Drawer.draw(new Parallelogram(getX(), getY(), getWidth(), getHeight()), gc);
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
