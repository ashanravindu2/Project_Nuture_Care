package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DashboardFormController implements Initializable {
    @FXML
    private ProgressBar CofH;

    @FXML
    private ProgressBar CofHe;

    @FXML
    private ProgressBar CofT;

    @FXML
    private ProgressBar CofW;
    @FXML
    private ProgressBar fri;

    @FXML
    private ProgressBar mon;

    @FXML
    private JFXButton reg;

    @FXML
    private ProgressBar sat;

    @FXML
    private ProgressBar sun;

    @FXML
    private ProgressBar thu;

    @FXML
    private ProgressBar tue;

    @FXML
    private ProgressBar wen;
    @FXML
    private AnchorPane P1;
    @FXML
    private JFXButton upload;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CofHe.setProgress(0.2);
        CofH.setProgress(0.2);
        CofT.setProgress(0.2);
        CofW.setProgress(0.2);
        CofHe.setStyle("-fx-accent: #3EC3CF");
        CofT.setStyle("-fx-accent: #3EC3CF");
        CofW.setStyle("-fx-accent: #3EC3CF");
        CofH.setStyle("-fx-accent: #3EC3CF");
        mon.setProgress(0.1);
        fri.setProgress(0.2);
        sat.setProgress(0.3);
        sun.setProgress(0.4);
        thu.setProgress(0.3);
        tue.setProgress(0.2);
        wen.setProgress(0.1);
        wen.setStyle("-fx-accent: #FA850A");
        tue.setStyle("-fx-accent: #FA850A");
        thu.setStyle("-fx-accent: #FA850A");
        sun.setStyle("-fx-accent: #FA850A");
        sat.setStyle("-fx-accent: #FA850A");
        fri.setStyle("-fx-accent: #FA850A");
        mon.setStyle("-fx-accent: #FA850A");
    }
    @FXML
    void RegisterbtnOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/RegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
    }
    @FXML
    void reportOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/ReportForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Report Page");
        stage.setScene(scene);
    }
    @FXML
    void stockOnActhion(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/StockManageForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Page");
        stage.setScene(scene);
    }
    Hyperlink hlink= new Hyperlink();
    @FXML
    void uploadOnActhion(ActionEvent event) {

    }
    @FXML
    void alertOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/AlertForm.fxml "));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Page");
        stage.setScene(scene);
    }
    @FXML
    void userOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/UserForm.fxml "));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P1.getScene().getWindow();
        stage.setTitle("Page");
        stage.setScene(scene);
    }
}
