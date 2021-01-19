package java.Model;

import java.util.Date;

public class Termin {
    private int ID;
    private boolean wiederkehrend;
    private Date date;

    public Termin(int ID, boolean wiederkehrend, Date date) {
        this.date = date;
        this.ID = ID;
        this.wiederkehrend = wiederkehrend;
    }

    public boolean isWiederkehrend() {
        return wiederkehrend;
    }

    public Date getDate() {
        return date;
    }

    public void setWiederkehrend(boolean wiederkehrend) {
        this.wiederkehrend = wiederkehrend;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
