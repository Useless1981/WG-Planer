package java.com.example.wg_planner;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "t_notes")

public class task {

    @DatabaseField(generatedId = true)
    int id;

    @DatabaseField
    String beschreibung;

//    @DatabaseField
//    private Date date;



//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return beschreibung;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }

    public task() {

    }

    public task(String besch) {
        super();
        this.beschreibung = besch;
    }

    @Override
    public String toString() {
        return "[id: " + id + ", Aufg: " + beschreibung + "]";
    }

}