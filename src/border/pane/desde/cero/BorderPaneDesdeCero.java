/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package border.pane.desde.cero;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author diegosape
 */
public class BorderPaneDesdeCero extends Application{

    /**
     * @param args the command line arguments
     */
        
    public BorderPaneDesdeCero() {
    }

    @Override
    public void init() {
        System.out.println("Inicio del metodo Init");
    }
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1  = new Button("Button 1");
        Button btn2  = new Button("Button 2");
        Button btn3  = new Button("Button 3");
        Button btn4  = new Button("Button 4");
        Button btn5  = new Button("Button 5");

        BorderPane root  = new BorderPane();
        
        root.setCenter(btn5);
        btn5.setMaxHeight(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        
        root.setTop(btn1);
        btn1.setMaxHeight(Double.MAX_VALUE);
        btn1.setMaxWidth(Double.MAX_VALUE);
        
        root.setBottom(btn3);
        btn3.setMaxHeight(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        
        root.setRight(btn2);
        btn2.setMaxHeight(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        
        root.setLeft(btn4);
        btn4.setMaxHeight(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);

        Scene scene = new Scene(root, 640, 480);

        primaryStage.setTitle("Layout Border Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("Metodo Start()");
    }
    
    @Override
    public void stop() {
        System.out.println("Metodo Stop()");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
