package HW5.model.data;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<User> users;

    public DataBase() {
        this.users = new ArrayList<User>();
    }

    public boolean add(User user) {
        boolean flag = false;
        if (!users.contains(user)) {
            users.add(user);
            flag = true;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "DataBase [users=" + users + "]";
    }

}
