package ua.edu.ucu.apps.message.twitter;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String email;
    private TwitterCountry userCountry;
    private LocalDate userActiveTime;
}
