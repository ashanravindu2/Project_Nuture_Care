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

public class ChildReportFormController {
    @FXML
    public AnchorPane P1;
    @FXML
    void SacnbtnOnActhion(ActionEvent event) throws IOException {

        Parent parent1 = FXMLLoader.load(this.getClass().getResource("/View/Report/childReportForm.fxml"));
        Scene scene1 = new Scene(parent1);
        Stage stage1 = (Stage) this.P1.getScene().getWindow();
        stage1.setTitle("Register Page");
        stage1.setScene(scene1);
        //stage1.close();

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
    void backOnActhion(ActionEvent event) throws IOException {
        Parent parent1 = FXMLLoader.load(this.getClass().getResource("/View/ReportForm.fxml"));
        Scene scene1 = new Scene(parent1);
        Stage stage1 = (Stage) this.P1.getScene().getWindow();
        stage1.setTitle("Register Page");
        stage1.setScene(scene1);
        //stage1.close();
    }

}
