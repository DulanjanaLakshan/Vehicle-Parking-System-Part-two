package Model;

public class Vehicle {
    private String Number ;
    private String Type;
    private String Weight;
    private String Passengers;

    public Vehicle() {
    }

    public Vehicle(String number, String type, String weight, String passengers) {
        setNumber(number);
        setType(type);
        setWeight(weight);
        setPassengers(passengers);
    }


    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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
}
