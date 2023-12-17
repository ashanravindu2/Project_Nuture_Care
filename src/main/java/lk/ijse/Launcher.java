package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/View/LoginPageForm.fxml"));
        Scene scene = new Scene(parent);
        //scene.getStylesheets().add(Launcher.class.getResource("".toExternalForm());
        scene.getStylesheets().add(Launcher.class.getResource("/Style/LoginPage.css").toExternalForm());

        stage.setTitle("LOGIN");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.initStyle(StageStyle.UTILITY);
        stage.show();
    }
}