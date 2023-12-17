package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lk.ijse.Launcher;

import java.io.IOException;
public class FaceUnlockFormController {
    @FXML
    private Button back;
    @FXML
    private Button btn1;

    @FXML
    void btnbackOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/dashboardForm.fxml"));
        Scene scene = new Scene(parent);
        scene.getStylesheets().add(Launcher.class.getResource("/Style/LoginPage.css").toExternalForm());
        Stage stage = new Stage();
        stage.setTitle("LOGIN");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

        //btn1.setOnAction(e -> openCamera());

    }
}
