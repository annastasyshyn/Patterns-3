package ua.edu.ucu.apps.message.user;

import java.time.LocalDate;

public interface User {
    public String getEmail();
    public String getCountry();
    public LocalDate getActiveTime();
}
