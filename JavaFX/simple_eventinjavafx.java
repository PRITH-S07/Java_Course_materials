package com.example.myjavafx;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Button bt1=new Button("Click here!");
        Label lb1=new Label();
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lb1.setText("You have clicked this button!");
            }
        });
        HBox root=new HBox();
        root.getChildren().addAll(bt1,lb1);
        Scene sc=new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
