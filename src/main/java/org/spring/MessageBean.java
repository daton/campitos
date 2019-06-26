package org.spring;

import java.time.LocalTime;
import org.springframework.stereotype.Service;

@Service
public class MessageBean {

    public String getMessage() {
        return "El botón se cliqueo a las " + LocalTime.now();
    }
}
