package com.example.javafxbrocode;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLUE);

        stage.setTitle("Stage Demo Program by Noah");
        stage.setWidth(696);
        stage.setHeight(696);
        stage.setResizable(false);
        stage.setX(0);
        stage.setY(0);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("PLEASE PRESS 'N' to exit.");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("n"));

        /*
            Image icon = new Image("icon.png"); //For setting the icon for the application
            stage.getIcons().add(icon); //adding icon to the stage
         */

        stage.setScene(scene);
        stage.show();
    }
}