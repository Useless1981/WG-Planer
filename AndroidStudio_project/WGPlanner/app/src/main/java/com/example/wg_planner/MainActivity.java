package com.example.wg_planner;

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
//
//    private ListView listView;
//    private ArrayAdapter<String> adapter;

//    private DatabaseHelper databaseHelper = null;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle sabedInstanceState) {
        super.onCreate(sabedInstanceState);
        setContentView(R.layout.activity_main);
//        insert();

    }

    public void insert(View view) { //button func., warum ist view Pflichtparameter?
        //get Manager
        dbHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
        //get DAO
        RuntimeExceptionDao<task, Integer> noteDao = dbHelper.getNoteRuntimeExceptionDao();

        //Eintraege erstellen
        noteDao.create(new task("Müll rausbringen"));

        //Abfrage bzw. query
        List<task> tasks = noteDao.queryForAll();
        //Ausgabe, eines von den beiden folgenden Zeilen
        Log.d("demo", tasks.toString());
        Log.d("demo", "-------------------------------------------");
//        System.out.println(tasks.toString() + "<- Inhalt des tables notes");

        OpenHelperManager.releaseHelper();
    }

    //    private void insert() { //todo wichtige Methode, just to try INSERT
//        //get Manager
//        dbHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
//        //get DAO
//        RuntimeExceptionDao<task, Integer> noteDao = dbHelper.getNoteRuntimeExceptionDao();
//
//        //Eintraege erstellen
////        noteDao.create(new task("Note 1 Text"));
////        noteDao.create(new task("Note 2 Text"));
//
//        //Abfrage bzw. query
//        List<task> tasks = noteDao.queryForAll();
//        //Ausgabe, eines von den beiden folgenden Zeilen
//        Log.d("demo", tasks.toString());
//        System.out.println(tasks.toString() + "<- Inhalt des tables notes");
//
//        OpenHelperManager.releaseHelper();
//    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //Read the saved notes from Database
//        List<Note> notes = Collections.EMPTY_LIST;
//        try {
//            notes = getDBHelper().getDao().queryForAll();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        //Map the notes to a list of Strings
//        List<String> data = new ArrayList<>();
//        for (Note note : notes) {
//            data.add(note.getContent());
//        }
//
//        //Create an adapter to couple the ListView with the data
//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, data);
//
//        listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(adapter);
//
//    }

//    private DatabaseHelper getDBHelper() {
//        if (databaseHelper == null) {
//            databaseHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
//        }
//        return databaseHelper;
//    }
//
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (dbHelper != null) {
            OpenHelperManager.releaseHelper();
            dbHelper = null;
        }
    }


//    public void onAddNote(View view) {
//        //todo in DB schreiben und ausgeben
//
//        System.out.println("Jetzt wird in DB geschrieben und eine Ausgabe generiert");
//
////        Instanz vom DatabaseHelper
//
//        RuntimeExceptionDao<Note, Integer> noteDao = getDBHelper().getNoteRuntimeExceptionDao();
//
//        //Eintraege erstellen
//        noteDao.create(new Note("Note 1 Text"));
//        noteDao.create(new Note("Note 2 Text"));
//
//        //Abfrage / query
//        List<Note> notes = noteDao.queryForAll();
//        //Ausgabe, eines von den beiden folgenden Zeilen
//        Log.d("demo", notes.toString());
//        System.out.println(notes.toString() + "<- Inhalt des tables notes");
//
//        OpenHelperManager.releaseHelper();
//
//    }





}
//
//import android.os.Bundle;
//import android.view.View;
//import android.view.Menu;
//
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
//import com.google.android.material.navigation.NavigationView;
//
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//public class MainActivity extends AppCompatActivity {
//
//    private AppBarConfiguration mAppBarConfiguration;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//}