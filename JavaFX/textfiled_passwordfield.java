package com.example.myjavafx;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import java.io.*;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class HelloApplication extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField name=new TextField();
        name.setMaxWidth(300);
        PasswordField pass=new PasswordField();
        pass.setMaxWidth(300);
        VBox root=new VBox();
        root.getChildren().addAll(name,pass);
        Scene sc=new Scene(root);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
