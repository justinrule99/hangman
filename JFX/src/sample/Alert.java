package sample;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Alert {

    public void alertNo(){
        Stage stage = new Stage();
        stage.setTitle("Alert");
        VBox box = new VBox();

        Label lblNo = new Label("Wait");
        box.getChildren().add(lblNo);

    }

}
