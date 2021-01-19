package com.example.wg_planner;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.IOException;
import java.sql.SQLException;

//generate the configFile
public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    //specify the class files which are interesting for us
    private static final Class<?>[] classes = new Class[] { task.class };

    public static void main(String[] args) throws IOException, SQLException {
        writeConfigFile("ormlite_config.txt", classes);
    }
}
