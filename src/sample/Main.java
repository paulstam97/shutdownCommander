package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//this is a test

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome mortal");
//        greeting.setTextFill(Color.CRIMSON);
//        greeting.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 80));
//
//        root.getChildren().add(greeting);


        primaryStage.setTitle("ShutdownCommander");
        primaryStage.setScene(new Scene(root, 362, 366));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
