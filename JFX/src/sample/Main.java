package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    

    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        FlowPane flPane = new FlowPane();
        primaryStage.setTitle("Main Menu");

        pane.setId("menu");
        Button btn = new Button("Start Game");
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        btn.setOnAction(e ->{
            System.out.println(e);
            Board b = new Board();
            b.showBoard(primaryStage);
        });




        Scene scene = new Scene(pane, 800,500);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        pane.getChildren().add(btn);
        pane.getChildren().add(flPane);

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("x.png")));
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
