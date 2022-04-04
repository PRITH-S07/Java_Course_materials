package com.example.demo;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
//import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import java.io.IOException;

public class HelloApplication extends Application {
    private Label label;
    private String str;
    private TextField textField;
    //@Override
    public void start(Stage stage) throws IOException
    {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        str=System.getProperty("java.version");
        label=new Label(str);
        label.setFont(Font.font(10));
        textField=new TextField("0");
        textField.setPrefHeight(50);
        textField.setFont(Font.font(30));
        textField.setAlignment(Pos.CENTER_RIGHT);//alignment of text using position
        textField.setEditable(false);// to disable editing property
        Scene scene=new Scene(new StackPane(textField),250,300);//to specify font of the text field
        stage.setTitle("Java Version");
        stage.setResizable(false);//to disable maximize button
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
