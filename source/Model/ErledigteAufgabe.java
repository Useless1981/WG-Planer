package Model;

import java.util.Date;

public class ErledigteAufgabe {
    private final String name;
    private final int punkte;
    private final Date date;

    public ErledigteAufgabe(String name, int punkte, Date date) {
        this.name = name;
        this.punkte = punkte;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getPunkte() {
        return punkte;
    }

    public Date getDate() {
        return date;
    }
}
