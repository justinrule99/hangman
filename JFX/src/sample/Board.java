package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;


public class Board {

    Button[] button = new Button[9];
    int rowNum = 0;
    int colNum = 0;
    GridPane grid;
    int boxCol, boxRow, xPlayNum;
    int numXonBoard;


    double x, y;
    boolean xTurn = true;
    boolean isX[][] = new boolean[3][3];
    boolean isO[][] = new boolean[3][3];
    boolean xIn[][] = new boolean[3][3];
    boolean oIn[][] = new boolean[3][3];
    boolean xCent;
    boolean xWin = false;
    ImageView imageView, imgAI, imgReset;
    Random rnd = new Random();
    TopMenu tm = new TopMenu();


    public Board(){

    }

    public void showBoard(Stage stage){
        stage.setTitle("Tic Tac Toe");

        grid = new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(50);
        grid.setHgap(50);
        grid.setId("grid");
        xPlayNum = 0;


        grid.getChildren().add(tm.initMenu(2, stage, this));

        grid.setOnMouseClicked(e ->{
            x = e.getX();
            y = e.getY();
            int click[] = getClickLocation(x,y);

            if(numXonBoard<5){
                if(!oIn[click[0]][click[1]] && !xIn[click[0]][click[1]] && !xWin){

                    Image img = getImage(false);
                    imageView = new ImageView();
                    imageView.setImage(img);
                    imageView.setFitWidth(150);
                    imageView.setFitHeight(150);

                    grid.add(imageView, click[0],click[1]);
                    isX[click[0]][click[1]] = true;
                    xIn[click[0]][click[1]] = true;

                    numXonBoard++;

                    System.out.println(numXonBoard);

                    changeTurn();
                    if(!xTurn){
                        if(numXonBoard<5 && !checkWin().equals("x")){
                            runAI();
                        }

                    }

                    if(checkWin().equals("x")){
                        System.out.println("X Wins");
                        xWin = true;
                    }
                    else if(checkWin().equals("o")){
                        System.out.println("O Wins");
                    }
                    else if(checkWin().equals("no") && numXonBoard==5){
                        System.out.println("It's a cat!");
                    }
                    else
                        System.out.println("Still Playing");
                }
                else{
                    System.out.println("cant do it");
                }
            }

        });


        for (int i = 0; i < 9; i++) {
            button[i] = new Button("BTN");
            button[i].setPrefSize(150,150);
            button[i].setVisible(false);
            grid.add(button[i], colNum, rowNum);
        }


        Scene sc = new Scene(grid, 600,600);
        sc.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        stage.setScene(sc);

        stage.show();
    }

    public void resetBoard(){
        rowNum = 0;
        colNum = 0;
        xTurn = true;
        x = 0;
        y = 0;
        xCent = false;
        numXonBoard = 0;

        grid.getChildren().remove(imgAI);
        grid.getChildren().remove(imageView);

        for (int i = 0; i < 3; i++) {


            for (int j = 0; j < 3; j++) {


                isX[i][j] = false;
                xIn[i][j] = false;
                isO[i][j] = false;
                oIn[i][j] = false;

            }
        }
    }

    public void runAI(){
        long startTime = System.currentTimeMillis();
        System.out.println("the ai chose ");

        Image imgO = getImage(false);
        imgAI = new ImageView();
        imgAI.setImage(imgO);
        imgAI.setFitWidth(150);
        imgAI.setFitHeight(150);

        //need to determine whether each space is x, o, or neither
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(isX[i][j]){
                    xIn[i][j] = true;
                }
                if(isO[i][j]){
                    oIn[i][j] = true;
                }
            }
        }

        if(numXonBoard==1){
            //try to go in center
            if(!xIn[1][1]){
                grid.add(imgAI, 1,1);
                oIn[1][1] = true;
                xCent = false;
            }
            else{ //if cant, go in corner
                int place = randInt(1,4);
                xCent = true;
                switch(place){
                    case 1:
                        grid.add(imgAI,0,0);
                        oIn[0][0] = true;
                        break;
                    case 2:
                        grid.add(imgAI,2,0);
                        oIn[2][0] = true;
                        break;
                    case 3:
                        grid.add(imgAI,0,2);
                        oIn[0][2] = true;
                        break;
                    case 4:
                        grid.add(imgAI,2,2);
                        oIn[2][2] = true;
                        break;
                }
            }
        }

        if(numXonBoard==2){
            //should be in defense mode here

            if(!blockX()){
                randPos();

            }

        }

        if(numXonBoard>2){
            if(!blockX()){
                randPos();

            }
        }
        changeTurn();


        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("It took " +elapsedTime+" milliseconds for the computer to choose!");
    }


    public String checkWin(){
        boolean xWin = false;
        boolean oWin = false;
        int numT=0; //top
        int numC=0; //center (horiz)
        int numB=0; //bottom
        int numL=0; //left
        int numM=0; //middle (vert)
        int numR=0; //right
        int numLD=0; //diag starting from left
        for (int i = 0; i < 3; i++) {
            //checks win across top
            if(isX[i][0])
                numT++;
            if(numT==3)
                xWin = true;
            //checks win across center row
            if(isX[i][1])
                numC++;
            if(numC==3)
                xWin = true;
            //checks win across bottom row
            if(isX[i][2])
                numB++;
            if(numB==3)
                xWin = true;
            //checks win across left row
            if(isX[0][i])
                numL++;
            if(numL==3)
                xWin = true;
            //checks win across middle row
            if(isX[1][i])
                numM++;
            if(numM==3)
                xWin = true;
            //checks win across right row
            if(isX[2][i])
                numR++;
            if(numR==3)
                xWin = true;
            //checks win across left diagonal row
            if(isX[i][i])
                numLD++;
            if(numLD==3)
                xWin = true;
            //checks win across right diagonal row
            if(isX[2][0] && isX[1][1] && isX[0][2])
                xWin = true;
        }
        if(xWin)
            return "x";
        else if(oWin)
            return "o";
        else
            return "no";
    }

    public boolean blockX(){

        //blocks with space between
        if(isX[0][0]&&isX[2][0]&&!oIn[1][0]){
            grid.add(imgAI,1,0);
            oIn[1][0]=true;
            return true;
        }
        if(isX[0][0]&&isX[0][2]&&!oIn[0][1]){
            grid.add(imgAI,0,1);
            oIn[0][1]=true;
            return true;
        }

        if(isX[0][2]&&isX[2][2]&&!oIn[1][2]){
            grid.add(imgAI,1,2);
            oIn[1][2]=true;
            return true;
        }
        if(isX[2][0]&&isX[2][2]&&!oIn[2][1]){
            grid.add(imgAI,2,1);
            oIn[2][1]=true;
            return true;
        }

        //blocks with two in a row
        if(isX[0][0]&&isX[1][0]&&!oIn[2][0]){
            grid.add(imgAI,2,0);
            oIn[2][0]=true;
            return true;
        }
        if(isX[0][1]&&isX[1][1]&&!oIn[2][1]){
            grid.add(imgAI,2,1);
            oIn[2][1]=true;
            return true;
        }
        if(isX[0][2]&&isX[1][2]&&!oIn[2][2]){
            grid.add(imgAI,2,2);
            oIn[2][2]=true;
            return true;
        }

        if(isX[1][0]&&isX[2][0]&&!oIn[0][0]){
            grid.add(imgAI,0,0);
            oIn[0][0]=true;
            return true;
        }
        if(isX[1][1]&&isX[2][1]&&!oIn[0][1]){
            grid.add(imgAI,0,1);
            oIn[0][1]=true;
            return true;
        }
        if(isX[1][2]&&isX[2][2]&&!oIn[0][2]){
            grid.add(imgAI,0,2);
            oIn[0][2]=true;
            return true;
        }


        if(isX[0][0]&&isX[0][1]&&!oIn[0][2]){
            grid.add(imgAI,0,2);
            oIn[0][2]=true;
            return true;
        }
        if(isX[1][0]&&isX[1][1]&&!oIn[1][2]){
            grid.add(imgAI,1,2);
            oIn[1][2]=true;
            return true;
        }
        if(isX[2][0]&&isX[2][1]&&!oIn[2][2]){
            grid.add(imgAI,2,2);
            oIn[2][2]=true;
            return true;
        }

        if(isX[0][1]&&isX[0][2]&&!oIn[0][0]){
            grid.add(imgAI,0,0);
            oIn[0][0]=true;
            return true;
        }
        if(isX[1][1]&&isX[1][2]&&!oIn[1][0]){
            grid.add(imgAI,1,0);
            oIn[1][0]=true;
            return true;
        }
        if(isX[2][1]&&isX[2][2]&&!oIn[2][0]){
            grid.add(imgAI,2,0);
            oIn[2][0]=true;
            return true;
        }

        //block diagonals
        if(isX[0][0]&&isX[1][1]&&!oIn[2][2]){
            grid.add(imgAI,2,2);
            oIn[2][2]=true;
            return true;
        }
        if(isX[2][2]&&isX[1][1]&&!oIn[0][0]){
            grid.add(imgAI,0,0);
            oIn[0][0]=true;
            return true;
        }

        if(isX[1][1]&&isX[2][0]&&!oIn[0][2]){
            grid.add(imgAI,0,2);
            oIn[0][2]=true;
            return true;
        }
        if(isX[1][1]&&isX[0][2]&&!oIn[2][0]){
            grid.add(imgAI,2,0);
            oIn[2][0]=true;
            return true;
        }
        return false;
    }

    public boolean winO(){

        int numOinRow = 0;

        for (int i = 0; i < 3; i++) {
            if(isO[i][0]){
                numOinRow++;
                if(numOinRow==2){
                    //if there isn't an x
                    if(!isX[i][0]){
                        System.out.println("O could win here");
                    }
                }
            }
        }

        return false;
    }

    public int[] getClickLocation(double xClick, double yClick){

        boxCol = 0;
        boxRow = 0;

        if(xClick < 200 && yClick < 200){
            boxCol = 0;
            boxRow = 0;
        }
        else if(xClick >200 && xClick <400 && yClick < 200){
            boxCol = 1;
            boxRow = 0;
        }
        else if(xClick>400 && xClick<600 && yClick<200){
            boxCol = 2;
            boxRow = 0;
        }
        else if(xClick < 200 && yClick > 200 && yClick<400){
            boxCol = 0;
            boxRow = 1;
        }
        else if(xClick >200 && xClick <400 && yClick > 200 && yClick<400){
            boxCol = 1;
            boxRow = 1;
        }
        else if(xClick>400 && xClick<600 && yClick>200 && yClick<400){
            boxCol = 2;
            boxRow = 1;
        }
        else if(xClick < 200 && yClick > 200 && yClick>400 &&yClick<600){
            boxCol = 0;
            boxRow = 2;
        }
        else if(xClick >200 && xClick <400 && yClick > 400 && yClick<600){
            boxCol = 1;
            boxRow = 2;
        }
        else if(xClick>400 && xClick<600 && yClick>400 && yClick<600){
            boxCol = 2;
            boxRow = 2;
        }

        return new int[] {boxCol, boxRow};
    }



    public boolean changeTurn(){
        xTurn = !xTurn;
        return xTurn;
    }

    public Image getImage(boolean isReset){
        Image image;
        if(xTurn){
            image = new Image(Main.class.getResourceAsStream("x.png"));
        }
        else if(isReset) {
            image = new Image(Main.class.getResourceAsStream("white.png"));
        }
        else{
            image = new Image(Main.class.getResourceAsStream("o.png"));
        }
        return image;
    }

    public int randInt(int min, int max){

        int num = rnd.nextInt((max-min)+1)+min;
        return num;
    }

    public void randPos(){
        System.out.println("cant be blocked");
        int rand1 = randInt(0,2);
        int rand2 = randInt(0,2);
        while(xIn[rand1][rand2] || oIn[rand1][rand2]){
            rand1 = randInt(0,2);
            rand2 = randInt(0,2);
        }
        grid.add(imgAI, rand1,rand2);
        isO[rand1][rand2] = true;
        oIn[rand1][rand2] = true;
    }

}
