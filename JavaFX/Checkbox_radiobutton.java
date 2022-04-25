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
        //label creation
        //Label lbl=new Label("Enter your name");
        //lbl.setText("I am setting some other text to this label");
        //lbl.setTextFill(Color.RED);
        //lbl.setFont(new Font("Times New Roman",32));
        //lbl.setTextAlignment(TextAlignment.CENTER);
        ToggleGroup group=new ToggleGroup();
        RadioButton opt1=new RadioButton("English");
        //CheckBox opt1=new CheckBox("English");
        RadioButton opt2=new RadioButton("Spanish");
        RadioButton opt3=new RadioButton("French");
        RadioButton opt4=new RadioButton("Calculus");
        opt1.setToggleGroup(group);
        opt2.setToggleGroup(group);
        opt3.setToggleGroup(group);
        opt4.setToggleGroup(group);
        //we need to add this control to a layout
        VBox root=new VBox();
        //we need to add this label to this layout
        //root.getChildren().add(lbl);
        root.getChildren().addAll(opt1,opt2,opt3,opt4);
        //add this layout to a scene
        Scene sc=new Scene(root);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
