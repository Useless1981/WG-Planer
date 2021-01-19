package java.Model;

import java.util.Date;

/**
 * This class is a representation of a single done job with an name, it's Karma score and a timestamp.
 */
public class ErledigteAufgabe {

    private final String name;
    private final int punkte;
    private final Date date;

    //Constructor
    public ErledigteAufgabe(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
        this.date = new Date();
    }

    // Getter
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
