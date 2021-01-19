package java.Model;

import java.util.LinkedList;
import java.util.List;


/**
 * This class is a representation of a WG. It has an ID, a Name and stores all Mitglieder and Aufgaben associated with this WG.
 */
public class WG {
    private int wgID;
    private String wgName;
    private List<Integer> wgMitglieder;
    private List<Aufgabe> aufgaben;

    // Constructor for Existing WG
    public WG(int ID, String name, List<Integer> mitglieder, List<Aufgabe> aufgaben) {
        this.wgID = ID;
        this.wgName = name;
        this.wgMitglieder = mitglieder;
        this.aufgaben = aufgaben;
    }

    //Constructor for new WG
    public WG(int ID, String name) {
        this.wgID = ID;
        this.wgName = name;
        this.wgMitglieder = new LinkedList<>();
        this.aufgaben = new LinkedList<>();
    }

    // Getter
    public List<Aufgabe> getAufgaben() {
        return aufgaben;
    }

    public int getID() {
        return this.wgID;
    }

    public String getName() {
        return this.wgName;
    }

    public List<Integer> getMitglieder() {
        return this.wgMitglieder;
    }

    // Setter
    public void setID(int ID) {
        this.wgID = ID;
    }

    public void setName(String name) {
        this.wgName = name;
    }

    // Add and remove Aufgaben and Mitglieder
    public void aufgabeHinzufuegen(Aufgabe aufgabe) {
        aufgaben.add(aufgabe);
    }

    public void aufgabeEntfernen(Aufgabe aufgabe) {
        aufgaben.remove(aufgabe);
    }

    public void wgMitgliedHinzufuegen(int benutzerID) {
        this.wgMitglieder.add(benutzerID);
    }

    public void wgMitgliedLoeschen(int benutzerID) {
        this.wgMitglieder.remove(benutzerID);
    }


}
