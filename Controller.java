package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    public double animationTimer;
    @FXML
    public Canvas cv;
    public Button play;
    public Button reset;
    public Button load;
    public Slider speed;
    public TextField columnsize;
    public TextField rowsize;
    public GraphicsContext gc;

    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        gc = cv.getGraphicsContext2D();

    }
    public void draw(GraphicsContext gc){}
    public void changespeed(){}
    public void playpause(){}
    public void load(){}
    public void reset(){}
    public void setcolumnsize(){}
    public void setrowsize(){}



}
