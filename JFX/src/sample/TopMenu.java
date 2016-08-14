package sample;


import javafx.application.Platform;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TopMenu {



    public TopMenu(){

    }


    public MenuBar initMenu(int version, Stage primaryStage, Board b){

        //version 1: Main Menu Screen
        //version 2: Game Screen

        //Board b = new Board();

        MenuItem mNewGame = new MenuItem("New Game");
        if(version==1){
            mNewGame.setOnAction(e ->{
                System.out.println("New Game Clicked");
                b.showBoard(primaryStage);
            });
        }
        else if(version==2){
            mNewGame.setOnAction(e ->{
                b.resetBoard();
            });
        }
        MenuItem mChangeColors = new MenuItem("Change Colors");
        mChangeColors.setOnAction(e ->{
            System.out.println("Change Colors");
            ColorPicker colorPick = new ColorPicker();
            colorPick.setValue(Color.RED);
        });
        MenuItem mStats = new MenuItem("Stats");
        mStats.setOnAction(e ->{
            System.out.println("Stats Viewer");
        });
        MenuItem mExit = new MenuItem("Exit");
        mExit.setOnAction(e ->{
            Platform.exit();
        });



        Menu optionsMenu = new Menu("Options");
        optionsMenu.getItems().addAll(mNewGame, mChangeColors, mStats, mExit);

        MenuBar bar = new MenuBar();
        bar.getMenus().add(optionsMenu);
        bar.setId("bar");
        //bar.prefWidthProperty().bind(primaryStage.widthProperty());

        if(version==2){
            bar.setTranslateX(-20);
            bar.setTranslateY(-85);
        }

        return bar;

    }
}
