package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.DBC;
import lk.ijse.Launcher;

import java.io.IOException;

public class LoginPageFormController {

    @FXML
    private TextField Un;

    @FXML
    private ImageView face;

    @FXML
    private AnchorPane back;

    @FXML
    private TextField pW;
    @FXML
    private PasswordField pW1;

    @FXML
    private Button signUp;
    @FXML
    void btnFaceOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/FaceUnlockForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setTitle("LOGIN");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnOkyOnAction(ActionEvent event) throws IOException {
        String UserName = Un.getText();
        String passWord = pW1.getText();
        String[][] details = DBC.getDetails("User",3);
        /*for (int i = 0; i < details.length; i++) {
            if (UserName.equals(details[i][0])) {
                if (passWord.equals(details[i][1])){*/
                    Parent parent = FXMLLoader.load(this.getClass().getResource("/View/dashboardForm.fxml"));
                    Scene scene = new Scene(parent);
                    Stage stage = new Stage();
                    stage.setTitle("LOGIN");
                    stage.centerOnScreen();
                    stage.setScene(scene);
                    stage.initStyle(StageStyle.UTILITY);
                    stage.show();
                /*}
                else{
                    pW1.setText("Password Incorrect");
                }
            }*/
        /*else {
                Un.setText("User Name Incorrect");
            }
        }*/

    }
}
