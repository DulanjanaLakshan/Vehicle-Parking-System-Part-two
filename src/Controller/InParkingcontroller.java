package Controller;

import Model.VData;
import Model.Vehicle;
import View.tm.VDataTM;
import View.tm.VehicleTM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static Controller.DashboardFromcontroller.vDataArrayList;

public class InParkingcontroller {
    public AnchorPane Context3;
    public TableView tblParking;
    public TableColumn colId;
    public TableColumn colType;
    public TableColumn colDriver;
    public TableColumn colNumber;
    public TableColumn colTime;
    public TableColumn colDate;



    private void loadVdatabaseOne() {

        colId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colDriver.setCellValueFactory(new PropertyValueFactory<>("driver"));
        colNumber.setCellValueFactory(new PropertyValueFactory<>("Number"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("TimeLOne"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("DateLOne"));
        System.out.println(vDataArrayList.get(0).getNumber());
        tblParking.setItems(FXCollections.observableArrayList(vDataArrayList));

    }

    public void initialize(){
        loadVdatabaseOne();

    }

    public void openOndelivery(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/On delivery.fxml");
        Parent load = FXMLLoader.load(resource);
        Context3.getChildren().clear();
        Context3.getChildren().add(load);


    }

    public void openDashboardFrom(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashboardFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Context3.getChildren().clear();
        Context3.getChildren().add(load);
    }

    public void openAddVehicle(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/AddVehicle.fxml");
        Parent load = FXMLLoader.load(resource);
        Context3.getChildren().clear();
        Context3.getChildren().add(load);
    }

    public void openAddDriver(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Context3.getChildren().clear();
        Context3.getChildren().add(load);
    }

}
