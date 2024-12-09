package ua.edu.ucu.apps.database;

public class Auth extends Авторизація {
    public boolean authenticate(Database db) {
        db.getUserData();
        return true;
    }
    @Override @Deprecated
    public boolean авторизуватися(БазаДаних db) {
        return super.авторизуватися(db);
    }
}
