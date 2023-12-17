package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MomDataManagementFormController {
    @FXML
    private AnchorPane P1;
    @FXML
    void backOnActhion(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/RegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void regOnActhion(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MotherRegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
}
