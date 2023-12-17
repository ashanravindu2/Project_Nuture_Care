package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportFormController {
    @FXML
    private AnchorPane P1;
    @FXML
    void childbtnOnActhion(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/ChildReportForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
    @FXML
    void motherOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MotherReportForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
    @FXML
    void reg(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/RegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void stock(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/StockManageForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void upload(ActionEvent event) throws IOException {

    }
    @FXML
    void User(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/UserForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void alert(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/AlertForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
}
