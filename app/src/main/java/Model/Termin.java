package java.Model;

import java.util.Date;


/**
 * This class is a representation of a single Termin. It has an ID, a Date, may have an repetition
 */
public class Termin {
    private int ID;
    private boolean wiederkehrend;
    private Date date;

    // Constructor for Termin with repetition
    public Termin(int ID, boolean wiederkehrend, Date date) {
        this.date = date;
        this.ID = ID;
        this.wiederkehrend = wiederkehrend;
    }

    // Constructor for Termin without repetition
    public Termin(int ID, Date date) {
        this.date = date;
        this.ID = ID;
    }

    // Getter
    public boolean isWiederkehrend() {
        return wiederkehrend;
    }

    public Date getDate() {
        return date;
    }


    // Setter
    public void setWiederkehrend(boolean wiederkehrend) {
        this.wiederkehrend = wiederkehrend;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
