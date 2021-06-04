package event.event;

import java.util.ArrayList;
import java.util.List;

public class ContextReturn {

    private List<Event> listEventRunned;
    private int qtyFailedEvent;
    private int qtyFailedScriptBefore;
    private int qtyFailedScrptAfter;

    public ContextReturn() {
        qtyFailedEvent = 0;
        qtyFailedScriptBefore = 0;
        qtyFailedScrptAfter = 0;
        listEventRunned = new ArrayList<Event>();
    }


    public ContextReturn addEventRunned(Event eventRunned){

        if( eventRunned.isFailedEvent() ) qtyFailedEvent++;
        if( eventRunned.isFailedScriptBefore() ) qtyFailedScriptBefore++;
        if( eventRunned.isFailedScriptAfter() ) qtyFailedScrptAfter++;

        listEventRunned.add(eventRunned);
        return this;
    }

    public List<Event> getListEventRunned() {
        return listEventRunned;
    }


    public int getQtyFailedEvent() {
        return qtyFailedEvent;
    }

 
    public int getQtyFailedScriptBefore() {
        return qtyFailedScriptBefore;
    }


    public int getQtyFailedScrptAfter() {
        return qtyFailedScrptAfter;
    }

 
}
