package DAO;

import java.sql.*;

public interface ConnectionSource {

    static void main(String[] args) {
//    Datenbank oeffnen/Verbindung aufbauen; "Protokoll//Host:Port/BezDerDatenbank"
        String url = "jdbc:mysql://localhost:3306/schema_wg-planner";
        String user = "root";
        String password = "";

        //Connection anlegen mithilfe tryWithRessource
        try (Connection conn = DriverManager.getConnection(url, user, password)) { //Die DB wird automatisch geschlossen
            //Wenn die nachfolgende Nachricht ausgegeben wird, hat der Verbindungsaufbau mit der DB funktioniert
            System.out.println("Erfolgreich mit Datenbank verbunden!");

/** Test-SQL-Statement: Eingabe */
//            String query = "INSERT INTO tasks (task_title, user, karmapoints) VALUES ('Muell entsorgen', 'Tomas', '2')";
////            Ueber die Verbindung (conn) "aktivieren" - Darueber koennen Aktivitaeten auf der DB ausgefuehrt werden
//            Statement stmt = conn.createStatement();
////            Statement ausfuehren, keine Ausgabe eines ResultSets wie z.B. beim Statement "SELECT ..."
//            stmt.execute(query);
//            stmt.close();

/** Test-SQL-Statement: Veraendern */
            String query = "UPDATE tasks SET karmapoints=7 WHERE task_id=5";
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            stmt.close();

/** Test-SQL-Statement: Loeschen */
//            String query = "DELETE FROM tasks WHERE task_id=1";
//            Statement stmt = conn.createStatement();
//            stmt.execute(query);
//            stmt.close();

/** Test-SQL-Statement: Ausgabe */
            query = "SELECT * FROM tasks ORDER BY task_id ASC";
            stmt = conn.createStatement();
//            Ergebnis landet im ResultSet, wir fuehren query auf der DB auf
            ResultSet rs = stmt.executeQuery(query);

//            Ausgabe des Ergebnisses, Testzweck
            //Speichern der Spaltenanzahl in einem Datensatz
            int nuColumns = rs.getMetaData().getColumnCount();
            //Ausgabe der Spaltenueberschriften
            for (int i = 1; i <= nuColumns; i++) {
                //Platzhalter fuer Zeichenkette (s); mindestens 25 sichtbare Zeichen (25); linksbuendig (-);
                // was ausgegeben werden soll (args)
                System.out.print(String.format("%-25s", rs.getMetaData().getColumnLabel(i)));
            }
            System.out.println("\n---------------------------------------------------------------------------------" +
                    "-----------");

            //Solange es einen naechsten Datensatz gibt:
            while(rs.next()) {
                //geben Daten der Reihe nach aus
                for (int i = 1; i <= nuColumns; i++) {
                    System.out.print(String.format("%-25s", rs.getString(i)));
                }
                System.out.println();
            }

            //ResultSet und Statement schliessen
            rs.close();
            stmt.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
    }
}
