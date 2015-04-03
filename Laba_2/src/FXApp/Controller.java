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
