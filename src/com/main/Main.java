package com.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {





    @Override
    public void start(Stage stage) throws Exception {

        Pane root = FXMLLoader.load(getClass().getResource("../../wyglad/login.fxml"));
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.setTitle("Zaloguj");
        stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }


}










