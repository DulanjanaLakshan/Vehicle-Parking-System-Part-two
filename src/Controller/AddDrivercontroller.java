package Controller;

import Model.Driver;
import View.tm.DriverTM;
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

public class AddDrivercontroller {
    public AnchorPane Context6;
    public TextField txtName;
    public TextField txtNIC;
    public TextField txtLNumber;
    public TextField txtAddress;
    public TextField txtContact;
    public TableView tblDriver;
    public TableColumn colName;
    public TableColumn colNIC;
    public TableColumn colLNumber;
    public TableColumn colAddress;
    public TableColumn colContact;

    static ArrayList<Driver> driverArrayList = new ArrayList();

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("NIC"));
        colLNumber.setCellValueFactory(new PropertyValueFactory<>("LNumber"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("Contact"));

    }

    public void openInparking(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/In Parking.fxml");
        Parent load = FXMLLoader.load(resource);
        Context6.getChildren().clear();
        Context6.getChildren().add(load);
    }

    public Boolean isExists(Driver driver){
        for (Driver t:driverArrayList
             ) {
            if(t.getName().equalsIgnoreCase(driver.getName())){
                return false;
            }
        }
       return true;
    }

    public void saveUpdateOnAction(ActionEvent actionEvent) {

        Driver driver = new Driver(txtName.getText(), txtNIC.getText(), txtLNumber.getText(), txtAddress.getText(), txtContact.getText());
        if (isExists(driver)) {
        if (driverArrayList.add(driver)) {
            // alert -> save
            loadAllDrivers();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            // alert -> try again
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
      }else{
            new Alert(Alert.AlertType.WARNING, "Already Exists", ButtonType.CLOSE).show();
        }
    }

    private void loadAllDrivers(){
        ObservableList<DriverTM> tmObservableList = FXCollections.observableArrayList();

        for (Driver tempe: driverArrayList
             ) {
            Button btn = new Button("Delete");
            tmObservableList.add(new DriverTM(tempe.getName(),tempe.getNIC(),tempe.getLNumber(),tempe.getAddress(),tempe.getContact(),btn));

        }

        tblDriver.setItems(tmObservableList);
    }



}

