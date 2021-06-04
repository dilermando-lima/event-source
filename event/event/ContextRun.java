package event.event;

import java.util.List;

public class ContextRun {

    public static ContextReturn run(List<Event> listEvent, ContextConfig contextConfig){
        ContextReturn contextReturn = new ContextReturn();
    
        for (  Event event : listEvent ) {
            
                event.getCommand().setContextConfig(
                    event.getCommand().getContextConfig() == null ? contextConfig :  event.getCommand().getContextConfig()
                ); 

                contextReturn.addEventRunned(EventRun.run(event));
        }

        return contextReturn;
    } 




}
