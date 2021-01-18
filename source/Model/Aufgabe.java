package Model;

import java.util.Date;

public class Aufgabe {

    private int aufgabeID;
    private String bezeichnung;
    private Termin aufgabeTermin;
    private boolean aufgabeErledigt;
    private int karmapunkte;
    private boolean zugeordneteAufgaben;
    private Benutzer benutzer;


    public Aufgabe(int ID, String bezeichnung, Termin termin, boolean erledigt, int wiederholen, int punkte, boolean zugeordnet, Benutzer benutzer) {
        this.aufgabeID = ID;
        this.bezeichnung = bezeichnung;
        this.aufgabeTermin = termin;
        this.aufgabeErledigt = erledigt;
        this.karmapunkte = punkte;
        this.zugeordneteAufgaben = zugeordnet;
        this.benutzer = benutzer;
    }

    public Aufgabe(int ID, String bezeichnung, boolean erledigt, int wiederholen, int punkte, boolean zugeordnet, Benutzer benutzer) {
        this.aufgabeID = ID;
        this.bezeichnung = bezeichnung;
        this.aufgabeErledigt = erledigt;
        this.karmapunkte = punkte;
        this.zugeordneteAufgaben = zugeordnet;
        this.benutzer = benutzer;
    }

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

    public void setAufgabeErledigt(boolean erledigt) {
        this.aufgabeErledigt = erledigt;
    }

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

    public boolean getAufgabenErledigt() {
        return this.aufgabeErledigt;
    }

    public ErledigteAufgabe aufgabeErledigt() { return new ErledigteAufgabe(this.bezeichnung, this.karmapunkte, new Date()); }
}
