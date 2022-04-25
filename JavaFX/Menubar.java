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
        MenuBar main_menu=new MenuBar();
        Menu File=new Menu("File");
        Menu Edit=new Menu("Edit");
        Menu Source=new Menu("Source");
        Menu Refactor=new Menu("Refactor");
        main_menu.getMenus().add(File);
        main_menu.getMenus().add(Edit);
        main_menu.getMenus().add(Source);
        main_menu.getMenus().add(Refactor);
        BorderPane root=new BorderPane();
        root.setTop(main_menu);
        Scene sc=new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
