package Controller;

import Model.DData;
import Model.VData;
import Model.Vehicle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DashboardFromcontroller {
    public AnchorPane Context1;
    public TextField DateLOne;
    public TextField TimeLOne;
    public ComboBox txtId;
    public TextField txttype;
    public TextField txtdriver;
    public TextField txtNumber;
    public String name;
    public String Type;


    static ArrayList<VData> vDataArrayList = new ArrayList();
    static ArrayList<DData> dDataArrayList = new ArrayList();

    private void iniDate(){
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateLOne.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    private void iniClock(){
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            TimeLOne.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }


    public void initialize(){
        iniClock();
        iniDate();
        SelectVehicle();
    }
    private  void  SelectVehicle(){

        txtId.getItems().addAll("NA-3434","KA-4563","DFC-4460","58-3567","CCB-3568","LM-6679","QA-3369"
                ,"KB-3668","JJ-9878","GH-5772","XY-4456","YQ-3536","CBB-3566","QH-3444");
        txtId.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            name = (String) newValue;
            VehicleType();
            VehicleDriver();
            SlotNUM();
        }));
    }
    private void VehicleType(){

        switch (name){
            case "NA-3434" : Type = "Bus";break;
            case "KA-4563" : Type = "Van";break;
            case "DFC-4460" :Type = "Van";break;
            case "58-3567" : Type = "Van";break;
            case "CCB-3568" :Type = "Van";break;
            case "LM-6679" : Type = "Van";break;
            case "QA-3369" : Type = "Van";break;
            case "KB-3668" : Type = "Cargo Lorry";break;
            case "JJ-9878" : Type = "Cargo Lorry";break;
            case "GH-5772" : Type = "Cargo Lorry";break;
            case "XY-4456" : Type = "Cargo Lorry";break;
            case "YQ-3536" : Type = "Cargo Lorry";break;
            case "CBB-3566" :Type = "Cargo Lorry";break;
            case "QH-3444" : Type = "Cargo Lorry";break;
        }
        txttype.setText(Type);
    }

    private void VehicleDriver(){
        switch (name){
            case "NA-3434" : Type = "Sumith Kumara";break;
            case "KA-4563" : Type = "Amila Pathirana";break;
            case "DFC-4460" :Type = "Jithmal Perera";break;
            case "58-3567" : Type = "Sumith Dissanayaka";break;
            case "CCB-3568" :Type = "Sumanasiri Herath";break;
            case "LM-6679" : Type = "Awantha Fernando";break;
            case "QA-3369" : Type = "Charith Sudara";break;
            case "KB-3668" : Type = "Prashan Dineth";break;
            case "JJ-9878" : Type = "Chethiya Dilan";break;
            case "GH-5772" : Type = "Dushantha Perera";break;
            case "XY-4456" : Type = "Sumith Udayanga";break;
            case "YQ-3536" : Type = "Dinesh Udara";break;
            case "CBB-3566" :Type = "Dinesh Udara";break;
            case "QH-3444" : Type = "Mohommad Riaz";break;
        }
        txtdriver.setText(Type);
    }
    private void SlotNUM(){
        switch (name){
            case "NA-3434" : Type = "1";break;
            case "KA-4563" : Type = "2";break;
            case "DFC-4460" :Type = "3";break;
            case "58-3567" : Type = "4";break;
            case "CCB-3568" :Type = "5";break;
            case "LM-6679" : Type = "6";break;
            case "QA-3369" : Type = "7";break;
            case "KB-3668" : Type = "8";break;
            case "JJ-9878" : Type = "9";break;
            case "GH-5772" : Type = "10";break;
            case "XY-4456" : Type = "11";break;
            case "YQ-3536" : Type = "12";break;
            case "CBB-3566" :Type = "13";break;
            case "QH-3444" : Type = "14";break;

        }
        txtNumber.setText(Type);
    }

    public void openSignupForm(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/SignupForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Context1.getChildren().clear();
        Context1.getChildren().add(load);


    }
    public Boolean isExists(VData vData){
        for (VData t:vDataArrayList
        ) {
            if(t.getNumber().equalsIgnoreCase(vData.getId())){
                return false;
            }

        }
        return true;

    }

    public void saveUpdateOnAction(ActionEvent actionEvent) {

        VData vdata = new VData(txtId.getSelectionModel().getSelectedItem().toString(),txttype.getText(),txtdriver.getText(),txtNumber.getText(),TimeLOne.getText(),DateLOne.getText());


        if (isExists(vdata)) {

        if(vDataArrayList.add(vdata)){
             // alert -> Save
             new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();

         }else{
             // alert -> try again
             new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
         }

        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
        }
    }

    public Boolean isExists(DData dData){
        for (VData t:vDataArrayList
        ) {
            if(t.getNumber().equalsIgnoreCase(dData.getId())){
                return false;
            }

        }
        return true;

    }
    public void SaveTwoUpdateOnAction(ActionEvent actionEvent) {

        DData dData = new DData(txtId.getSelectionModel().getSelectedItem().toString(),txttype.getText(),txtdriver.getText(),txtNumber.getText(),TimeLOne.getText(),DateLOne.getText());

        if (isExists(dData)) {

        if(dDataArrayList.add(dData)){
            //alert -> Save

            new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
        }else{
            //alert -> try again
            new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
        }
    }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
        }
    }
}



