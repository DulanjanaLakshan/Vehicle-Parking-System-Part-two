package Model;

import javafx.collections.ObservableList;

public class DData {

    private String Id;
    private String type;
    private String driver;
    private String Nummber;
    private String TimeLOne;
    private String DateLOne;

    public DData(ObservableList items, String text, String txtdriverText, String txtNumberText, String timeLOneText, String dateLOneText) {
    }

    public DData(String id, String type, String driver, String nummber, String timeLOne, String dateLOne) {
        setId(id);
        this.setType(type);
        this.setDriver(driver);
        setNummber(nummber);
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

    public String getNummber() {
        return Nummber;
    }

    public void setNummber(String nummber) {
        Nummber = nummber;
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
