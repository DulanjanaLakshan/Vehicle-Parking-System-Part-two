package Model;

import javafx.collections.ObservableList;

public class VData {

     private String Id;
     private String type;
     private String driver;
     private String Number;
     private String TimeLOne;
     private String DateLOne;

    public VData() {
    }

    public VData(String id, String type, String driver, String number, String timeLOne, String dateLOne) {
        setId(id);
        this.setType(type);
        this.setDriver(driver);
        setNumber(number);
        setTimeLOne(timeLOne);
        setDateLOne(dateLOne);
    }




    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getTimeLOne() {
        return TimeLOne;
    }

    public void setTimeLOne(String timeLOne) {
        TimeLOne = timeLOne;
    }

    public String getDateLOne() {
        return DateLOne;
    }

    public void setDateLOne(String dateLOne) {
        DateLOne = dateLOne;
    }
}
