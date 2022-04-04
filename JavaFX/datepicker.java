package com.example.demo;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.io.IOException;
// example on datepicker
public class HelloApplication extends Application {
    private Label label;
    private String str;
    private TextField textField;
    //@Override
    public void start(Stage stage) throws IOException
    {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        VBox vbox=new VBox();
        Scene scene=new Scene(vbox,400,400);
        stage.setScene(scene);
        GridPane gridPane=new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        DatePicker datePicker=new DatePicker();
        Label label=new Label("Choose Date:");
        gridPane.add(label,0,0);
        gridPane.add(datePicker,0,1);
        vbox.getChildren().add(gridPane);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
