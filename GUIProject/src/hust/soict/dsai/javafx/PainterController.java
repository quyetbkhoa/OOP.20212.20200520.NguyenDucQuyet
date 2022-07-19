package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
=======
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b

public class PainterController {

    @FXML
<<<<<<< HEAD
    private Pane drawingAreaPane;
    private int mode;
    @FXML
    private void penMode(ActionEvent event) {
    	this.mode = 1;
    }
    @FXML
    private void eraserMode(ActionEvent event) {
    	this.mode = 0;
    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	if ( this.mode==1) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);
    	}
    	else  {
        	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.WHITE);
        	drawingAreaPane.getChildren().add(newCircle);
        	}
    			
=======
    private Pane drawAreaPane;

    @FXML
    private VBox drawingAreaPane;

    @FXML
    private Button clearBtn;

    @FXML
    void drawingAreaMouseDragged(ActionEvent event) {
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b

    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
<<<<<<< HEAD
    	drawingAreaPane.getChildren().clear();
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b

    }

}
<<<<<<< HEAD

=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
