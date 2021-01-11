package Model;

public class Benutzer {

    private int benutzerID;
    private String vorname;
    private String nachname;
    private String emailAdresse;
    private String passwort;
    private boolean angemeldet;
    private WG wgName;
    private int karmapunkte;

    public Benutzer(int id, String firstName, String lastName, String email, String password, boolean loggedIn, WG wgName, int points) {
        this.benutzerID = id;
        this.vorname = firstName;
        this.nachname = lastName;
        this.emailAdresse = email;
        this.passwort = password;
        this.angemeldet = loggedIn;
        this.wgName = wgName;
        this.karmapunkte = points;
    }

    public void anmelden() {
        // To be implemented
    }

    public void abmelden() {
        // To be implemented
    }

    public void loeschen() {
        // To be implemented
    }

    public void passwortWiederherstellen() {
        // To be implemented
    }

    public int getBenutzerID() {
        return benutzerID;
    }

    public void setBenutzerID(int id) {
        this.benutzerID = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String firstName) {
        this.vorname = firstName;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String lastName) {
        this.nachname = lastName;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(String email) {
        this.emailAdresse = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String pass) {
        this.passwort = pass;
    }

    public boolean isAngemeldet() {
        return angemeldet;
    }

    public WG getWgName() {
        return wgName;
    }

    public void setWgName(WG name) {
        this.wgName = name;
    }

    public int getKarmapunkte() {
        return karmapunkte;
    }

    public void setKarmapunkte(int points) {
        this.karmapunkte = points;
    }
}
