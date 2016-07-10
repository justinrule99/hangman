package sample;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    
    TopMenu tm = new TopMenu();
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane pane = new AnchorPane();
        Board b = new Board();
        primaryStage.setTitle("Main Menu");

        pane.setId("menu");
        Button btn = new Button("Start Game");
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        btn.setOnAction(e ->{
            System.out.println(e);

            b.showBoard(primaryStage);
        });


        MenuBar mb = tm.initMenu(1, primaryStage, b);


        pane.getChildren().add(mb);
        AnchorPane.setTopAnchor(mb, 0.0);



        Scene scene = new Scene(pane, 800,500);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        pane.getChildren().add(btn);


        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("x.png")));
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
