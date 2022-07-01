package Controller;

import Model.VData;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class OnDeliverycontroller {
    public AnchorPane Context4;
    public TableView tblDelivery;
    public TableColumn colId;
    public TableColumn colType;
    public TableColumn colDriver;
    public TableColumn colNumber;
    public TableColumn colTime;
    public TableColumn colDate;

    private void loadVdatabase(){

        colId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colDriver.setCellValueFactory(new PropertyValueFactory<>("driver"));
        colNumber.setCellValueFactory(new PropertyValueFactory<>("Number"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("TimeLOne"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("DateLOne"));
        tblDelivery.setItems(FXCollections.observableArrayList(DashboardFromcontroller.dDataArrayList));
    }

    public void initialize(){
        loadVdatabase();
    }

    public void openAddVehicle(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Context4.getChildren().clear();
        Context4.getChildren().add(load);
    }

    public void openAddDriver(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Context4.getChildren().clear();
        Context4.getChildren().add(load);
    }

    public void openDashboardFrom(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashboardFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Context4.getChildren().clear();
        Context4.getChildren().add(load);


    }
}
