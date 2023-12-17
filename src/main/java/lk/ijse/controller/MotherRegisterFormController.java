package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MotherRegisterFormController {
    @FXML
    private AnchorPane P1;

    @FXML
    private AnchorPane p1;
    @FXML
    private Button yes;
    @FXML
    void onClickyes(ActionEvent event) throws IOException {
        p1.getChildren().clear();
        p1.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("View/Yes/No/YesForm.fxml"))));
    }
    @FXML
    void noOnClick(ActionEvent event) throws IOException {
        p1.getChildren().clear();
        p1.getChildren().add(FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("View/Yes/No/NoForm.fxml"))));
    }
    @FXML
    void subOnActhion(ActionEvent event) throws IOException {
            Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MomDataManagementForm.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage) this.P1.getScene().getWindow();
            stage.setTitle("Register Page");
            stage.setScene(scene);
    }
    @FXML
    void backOnActhion(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MomDataManagementForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
}

