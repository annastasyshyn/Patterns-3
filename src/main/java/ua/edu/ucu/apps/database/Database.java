package ua.edu.ucu.apps.database;

public class Database extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return super.отриматиСтатистичніДані();
    }

    @Override @Deprecated
    public String отриматиДаніКористувача() {
        return super.отриматиДаніКористувача();
    }

    @Override @Deprecated
    public String отриматиСтатистичніДані() {
        return super.отриматиСтатистичніДані();
    }
    
}
