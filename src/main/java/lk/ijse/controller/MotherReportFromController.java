package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MotherReportFromController {
    @FXML
    private AnchorPane P1;
    @FXML
    void NFC(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/POPUP/NFCPOPUpFrom.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle("LOGIN");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.show();
    }

    @FXML
    void addreport(ActionEvent event) {

    }

    @FXML
    void back(ActionEvent event) {

    }
}
