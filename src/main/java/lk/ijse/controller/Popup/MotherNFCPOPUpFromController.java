package lk.ijse.controller.Popup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.controller.ChildReportFormController;

import java.io.IOException;

public class MotherNFCPOPUpFromController extends ChildReportFormController{
    @FXML
    private AnchorPane P2;
    @FXML
    void btn(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/POPUP/NFCPOPUpFrom.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) this.P2.getScene().getWindow();
        stage.setTitle("Register Page");
        stage.setScene(scene);
        stage.close();
    }
}
