package ua.edu.ucu.apps.message.user;

import ua.edu.ucu.apps.message.meta.FaceBookUser;

public class MyMetaUser implements User {
    FaceBookUser user;
    public MyMetaUser(FaceBookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail(){
        return user.getUserMail();
    }

    @Override
    public java.time.LocalDate getActiveTime(){
        return user.getLastActiveTime();
    }

    @Override
    public String getCountry(){
        return user.getCountry();
    }
}
