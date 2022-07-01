package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class SignupFormcontroller {


    public AnchorPane Context2;
    public TextField userName;
    public TextField password;

    public void openInparking(ActionEvent actionEvent) throws IOException {

        if (userName.getText().equals("Car")&&password.getText().equals("32")) {
            URL resource = getClass().getResource("../View/In Parking.fxml");
            Parent load = FXMLLoader.load(resource);
            Context2.getChildren().clear();
            Context2.getChildren().add(load);
        }else{
            new Alert(Alert.AlertType.WARNING, "Please enter the correct username or password !", ButtonType.CLOSE).show();
        }
    }

    public void openDashboardFrom(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/DashboardFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Context2.getChildren().clear();
        Context2.getChildren().add(load);


    }
}
