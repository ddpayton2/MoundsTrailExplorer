package edu.bsu.cs345;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MoundsTrailExplorer.fxml"));
        primaryStage.setTitle("Mounds State Park Trail Explorer");
        primaryStage.setScene(new Scene(root));
        primaryStage.resizableProperty();
        primaryStage.setResizable(false);



        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(1000);
        primaryStage.show();
        System.out.println(primaryStage.getWidth());
        System.out.println(primaryStage.getHeight());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
