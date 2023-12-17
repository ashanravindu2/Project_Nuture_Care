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

public class RegisterFormController {
    @FXML
    private AnchorPane pane;
    @FXML
    void DB(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/dashboardForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void alert(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/AlertForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void report(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/Report/ReportForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void stock(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/StockManageForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void upload(ActionEvent event) throws IOException {

    }

    @FXML
    void user(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/UserForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
    @FXML
    private Button mom;
    @FXML
    void onClickMOM(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MomDataManagementForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
}
