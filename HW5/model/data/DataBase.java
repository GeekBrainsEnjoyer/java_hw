package HW5.model.data;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<User> db;

    public DataBase(ArrayList<User> users) {
        this.db = users;
    }

    public DataBase() {
        this.db = new ArrayList<User>();
    }

    public boolean add(User user) {
        boolean flag = false;
        if (!db.contains(user)) {
            db.add(user);
            flag = true;
        }
        return flag;
    }

    public ArrayList<User> getDb() {
        return db;
    }

    public void setDb(ArrayList<User> users) {
        this.db = users;
    }

}
