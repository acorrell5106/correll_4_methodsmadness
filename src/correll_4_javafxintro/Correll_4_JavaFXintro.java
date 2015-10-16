/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correll_4_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Correll_4_JavaFXintro extends Application {
 
    public static void main(String[] args) {
        launch(args);
        for(int i = 0; i > 100; i++){
            if (isQuad(i)) {
            // ^ Ask Mr.Davis ^ :P
            }
        }
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double [] myXs = {6, 9, 12};
        double [] myYs = {9, 28, 7};
       //drawTriangle(gc, myXs, myYs, 3);
       // drawShapes(gc);
        drawTriangle(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    //private void drawTriangle(GraphicsContext gc, double [] myXs, double [] myYs, int w) {
       //  double [] myXs = {6, 9, 6};
       // double [] myYs = {9, 18, 27};
       
        //gc.setFill(Color.BLUEVIOLET);
        //gc.fillPolygon(myXs, myYs, 50);
    //}   
    private void drawTriangle(GraphicsContext gc) {
        double [] xPoints = {42, 42, 64};
        double [] yPoints = {42, 86, 64};
        gc.fillPolygon(xPoints, yPoints, 3);
    }
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.LIGHTSALMON);
        gc.setStroke(Color.CADETBLUE);
        gc.setLineWidth(3);
        gc.strokeLine(45, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
        
    }
    /*private void Patterns(GraphicsContext gc) {
        for(i = 0; i < 100; i++) {
    if (isTriangle(i)) {
        drawTriangle(GraphicsContext gc);
}else if (isQuad(i)) {
        drawQuad();
}else if (isPent(i)) {
        drawPent();
}else if (isHex(i)) {
        drawHex();
}else if (isTwo(i) & isHex(i)) {
        drawDodec();
    }*/   
    static boolean isTwo(int two){
        return(two % 12 == 0);
    }
    static boolean isTriangle(int triangle){
        return(triangle % 3 != 0);
    }
    static boolean isQuad(int quad){
        return(quad % 4 == 0);
    }
    static boolean isPent(int pent){
        return(pent % 5 == 0);
    }
    static boolean isHex(int hex){
        return(hex % 6 == 0);
    }
}
    

