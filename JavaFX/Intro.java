/*package com.example.myjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    //@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}*/

package com.example.myjavafx;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import java.io.*;
import javafx.application.Application;
import javafx.stage.Stage;
public class HelloApplication extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        //adding a control here, i.e. a button
        Button bt1=new Button("click me");
        Button bt2=new Button("click me");
        Button bt3=new Button("click me");
        //we need to define the layout
        //VBox root=new VBox();
        //root.setSpacing(20);// for HBox and VBox
        //FlowPane root=new FlowPane();
        //GridPane root=new GridPane();
        BorderPane root=new BorderPane();
        //to add our control button to our layout
        //root.getChildren().add(bt1); not for GridPane though
        //to add this layout to a scene
        //root.add(bt1,0,0); for GridPane
        root.setBottom(bt1);
        root.setCenter(bt2);
        //root.setGridLinesVisible(true);
        Scene sc=new Scene(root);
        //to add this scene to a stage
        primaryStage.setScene(sc);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        //primaryStage.setFullScreen(true);
        primaryStage.setTitle("Hello there muito intelligente intellectual");
        primaryStage.show();
    }
}
