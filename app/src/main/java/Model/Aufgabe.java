package java.Model;


/**
 * This class is a representation of a single Aufageb. It has an ID, a Name, may have an associated Termin
 */
public class Aufgabe {

    private int aufgabeID;
    private String bezeichnung;
    private Termin aufgabeTermin;
    private int karmapunkte;
    private boolean zugeordneteAufgaben;
    private Benutzer benutzer;


    // Constructor for Aufgaben with Termin
    public Aufgabe(int ID, String bezeichnung, Termin termin, boolean erledigt, int wiederholen, int punkte, boolean zugeordnet, Benutzer benutzer) {
        this.aufgabeID = ID;
        this.bezeichnung = bezeichnung;
        this.aufgabeTermin = termin;
        this.karmapunkte = punkte;
        this.zugeordneteAufgaben = zugeordnet;
        this.benutzer = benutzer;
    }

    // Constructor for Aufgaben without Termin
    public Aufgabe(int ID, String bezeichnung, boolean erledigt, int wiederholen, int punkte, boolean zugeordnet, Benutzer benutzer) {
        this.aufgabeID = ID;
        this.bezeichnung = bezeichnung;
        this.karmapunkte = punkte;
        this.zugeordneteAufgaben = zugeordnet;
        this.benutzer = benutzer;
    }

    // Setter
    public void setID(int ID) {
        this.aufgabeID = ID;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setAufgabeTermin(Termin termin) {
        this.aufgabeTermin = termin;
    }

    public void setKarmapunkte(int punkte) {
        this.karmapunkte = punkte;
    }

    public void setZugeordneteAufgaben(boolean zugeordnet) { this.zugeordneteAufgaben = zugeordnet; }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    // Getter
    public int getID() {
        return this.aufgabeID;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public Termin getAufgabeTermin() {
        return this.aufgabeTermin;
    }

    public int getKarmapunkte() {
        return this.karmapunkte;
    }

    public boolean getZugeordneteAufgaben() {
        return this.zugeordneteAufgaben;
    }

    public Benutzer getBenutzer() {
        return this.benutzer;
    }

    // Further functionality
    public ErledigteAufgabe aufgabeErledigt() { return new ErledigteAufgabe(this.bezeichnung, this.karmapunkte); }
}
