package event.util;

import java.util.UUID;

public class UtilApp {

    public static String generateKey(){
        return UUID.randomUUID().toString();
    }
    
}
