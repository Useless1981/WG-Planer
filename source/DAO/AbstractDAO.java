package DAO;

import java.sql.Statement;

public abstract class AbstractDAO<T> implements ConnectionSource {


    public <T> T save(T entity) {
        return null; //Platzhalter
    }

    public <T> void update(T entity) {
    }

    public <T> T getByID(long ID) {
        return null; //Platzhalter
    }

    public <T> void delete(T entity) {

    }
}
