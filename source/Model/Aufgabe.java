package Model;

import java.util.Date;

public class Aufgabe {

    private int aufgabeID;
    private String bezeichnung;
    private Date aufgabeTermin;
    private boolean aufgabeErledigt;
    private int terminWiederholung;
    private int karmapunkte;
    private boolean zugeordneteAufgaben;
    private Benutzer benutzer;


    public Aufgabe(int ID, String bezeichnung, Date date, boolean erledigt, int wiederholen, int punkte, boolean zugeordnet, Benutzer benutzer) {
        this.aufgabeID = ID;
        this.bezeichnung = bezeichnung;
        this.aufgabeTermin = date;
        this.aufgabeErledigt = erledigt;
        this.terminWiederholung = wiederholen;
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

    public void setTerminWiederholung(int wiederholen) {
        this.terminWiederholung = wiederholen;
    }

    public void setAufgabeTermin(Date date) {
        this.aufgabeTermin = date;
    }

    public void setKarmapunkte(int punkte) {
        this.karmapunkte = punkte;
    }

    public void setZugeordneteAufgaben(boolean zugeordnet) {
        this.zugeordneteAufgaben = zugeordnet;
    }

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

    public int getTerminWiederholung() {
        return this.terminWiederholung;
    }

    public Date getAufgabeTermin() {
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
 }
