package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NewReportFormController {

    @FXML
    private AnchorPane pane;

    @FXML
    void DB(ActionEvent event) {

    }

    @FXML
    void alert(ActionEvent event) {

    }

    @FXML
    void reg(ActionEvent event) {

    }

    @FXML
    void report(ActionEvent event) {

    }
    @FXML
    void child(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/ChildReportForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void mom(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/MomDataManagementForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void stock(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/StockManageForm.fxml "));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }

    @FXML
    void upload(ActionEvent event) {

    }

    @FXML
    void user(ActionEvent event) {

    }
}
