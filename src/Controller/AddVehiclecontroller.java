package Controller;

import Model.Vehicle;
import View.tm.VehicleTM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddVehiclecontroller {
    public AnchorPane Context5;
    public TextField txtNumber;
    public TextField txtWeight;
    public TextField txttype;
    public TextField txtPassengers;
    public TableView tblVehicle;
    public TableColumn colNumber;
    public TableColumn colType;
    public TableColumn colWeight;
    public TableColumn colPassengers;

    static ArrayList<Vehicle> vehicleArrayList = new ArrayList();

    public void  initialize(){
        colNumber.setCellValueFactory(new PropertyValueFactory<>("Number"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colWeight.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        colPassengers.setCellValueFactory(new PropertyValueFactory<>("Passengers"));

    }

    public void openInParking(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/In Parking.fxml");
        Parent load = FXMLLoader.load(resource);
        Context5.getChildren().clear();
        Context5.getChildren().add(load);
    }

    public void newVehicleOnAction(ActionEvent actionEvent) {}

    public Boolean isExists(Vehicle vehicle){
        for (Vehicle t:vehicleArrayList
        ) {
            if(t.getNumber().equalsIgnoreCase(vehicle.getNumber())){
                return false;
            }

        }
        return true;
    }

    public void saveUpdateOnAction(ActionEvent actionEvent) {
        Vehicle vehicle = new Vehicle(txtNumber.getText(), txttype.getText(), txtWeight.getText(), txtPassengers.getText());

        if (isExists(vehicle)) {

            if (vehicleArrayList.add(vehicle)) {

                loadAllVehicles();
                new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
            } else {

                new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
            }
        } else {
            new Alert(Alert.AlertType.WARNING, "Already Exists", ButtonType.CLOSE).show();
        }
    }
    private  void loadAllVehicles(){
        ObservableList<VehicleTM> tmObservableList = FXCollections.observableArrayList();
        for (Vehicle temp:vehicleArrayList
             ) {
            Button btn = new Button("Delete");
            tmObservableList.add(
                    new VehicleTM(temp.getNumber(),temp.getType(),temp.getWeight(),temp.getPassengers(),btn)
                    );
        } 
        tblVehicle.setItems(tmObservableList);
    }


}
