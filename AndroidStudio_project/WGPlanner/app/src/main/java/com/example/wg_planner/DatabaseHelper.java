package com.example.wg_planner;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 * Database helper class used to manage the creation and upgrading of your database. This class also usually provides
 * the DAOs used by the other classes.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    //database name
    private static final String DATABASE_NAME = "test"; // Hier Namen der DB eintragen
    private static final int DATABASE_VERSION = 8; // 1 increment, DB wird gelooescht und neu aufgesetzt

    // the DAO object we use to access the Note table
    private Dao<task, Integer> noteDao = null;
    private RuntimeExceptionDao<task, Integer> noteRuntimeDao = null; //<class, id>

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }

    /**
     * This is called when the database is first created. Usually you should call createTable statements here to create
     * the tables that will store your data. (Bei erstem Aufruf soll table erstellt werden)
     */
    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, task.class); //erstellt table
        } catch (SQLException e) {
            System.out.println("Tabelle konnte nicht erstellt werden");
            throw new RuntimeException(e);
        }
    }

    /**
     * This is called when your application is upgraded and it has a higher version number. This allows you to adjust
     * the various data to match the new version number.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, task.class, true);
            // after we drop the old databases, we create the new ones
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the Database Access Object (DAO) for our SimpleData class. It will create it or just give the cached
     * value.
     */
//    public Dao<task, Integer> getDao() throws SQLException {
//        if (noteDao == null) {
//            noteDao = getDao(task.class);
//        }
//        return noteDao;
//    }

    public RuntimeExceptionDao<task, Integer> getNoteRuntimeExceptionDao() {
        if (noteRuntimeDao == null) {
            noteRuntimeDao = getRuntimeExceptionDao(task.class);
        }
        return noteRuntimeDao;
    }

    /**
     * Close the database connections and clear any cached DAOs.
     */
    @Override
    public void close() {
        super.close();
        noteDao = null;
    }

}