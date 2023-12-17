package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddreportFromController {
    @FXML
    private AnchorPane P1;
    @FXML
    void back(ActionEvent event) throws IOException {
        Parent parent1 = FXMLLoader.load(this.getClass().getResource("/View/Report/ReportForm.fxml"));
        Scene scene1 = new Scene(parent1);
        Stage stage1 = (Stage) this.P1.getScene().getWindow();
        stage1.setTitle("Register Page");
        stage1.setScene(scene1);
    }
}
