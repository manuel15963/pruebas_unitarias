package com.example.demo1;
public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

    public boolean saveData(String data) {
        return database.save(data);
    }
}
