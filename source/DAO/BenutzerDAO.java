package DAO;

import Model.Benutzer;
import Model.WG;

public class BenutzerDAO extends AbstractDAO{

    public boolean existsByName(String name) { //todo
        return false;
    }

    public Benutzer getByEmail(String email) { //todo
        return new Benutzer(1, "", "", "", "",
                false, new WG(1, "testWG"), 10);
// int id, String firstName, String lastName, String email, String password, boolean loggedIn, WG wgName, int points
    }
}
