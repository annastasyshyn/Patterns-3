package ua.edu.ucu.apps.message.meta;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class FaceBookUser {
        private String userMail;
        private String country;
        public LocalDate lastActiveTime;
    
}
