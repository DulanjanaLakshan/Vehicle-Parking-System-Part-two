package View.tm;

import javafx.scene.control.Button;


public class VehicleTM {

   private String Number;
   private String type;
   private String Weight;
   private String Passengers;
   private Button btn;

    public VehicleTM() {
    }

    public  VehicleTM(String Number, String type , String Weight, String Passengers , Button btn){

     this.setNumber(Number);
     this.setType(type);
     this.setWeight(Weight);
     this.setPassengers(Passengers);
     this.setBtn(btn);
   }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getPassengers() {
        return Passengers;
    }

    public void setPassengers(String passengers) {
        Passengers = passengers;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}

