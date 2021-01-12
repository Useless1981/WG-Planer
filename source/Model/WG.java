package Model;

import java.util.LinkedList;
import java.util.List;

public class WG {
    private int wgID;
    private String wgName;
    private List<Integer> wgMitglieder = new LinkedList<>();
    private List<Aufgabe> aufgaben = new LinkedList<>();

    public WG(int ID, String name, List<Integer> mitglieder) {
        this.wgID = ID;
        this.wgName = name;
        this.wgMitglieder = mitglieder;
    }

    public WG(int ID, String name) {
        this.wgID = ID;
        this.wgName = name;
    }

    public void wgMitgliedHinzufuegen(int benutzerID) {
        this.wgMitglieder.add(benutzerID);
    }

    public void wgMitgliedLoeschen(int benutzerID) {
        this.wgMitglieder.remove(benutzerID);
    }

    public void setID(int ID) {
        this.wgID = ID;
    }

    public void setName(String name) {
        this.wgName = name;
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

    public void aufgabeHinzufuegen(Aufgabe aufgabe) {
        aufgaben.add(aufgabe);
    }

    public void aufgabeEntfernen(Aufgabe aufgabe) {
        aufgaben.remove(aufgabe);
    }

    public List<Aufgabe> getAufgaben() {
        return aufgaben;
    }
}
