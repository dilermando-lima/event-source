package event.event;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import event.util.UtilApp;

public class Context {

    private  List<Event> listEvent;
    public String keyContext;
    public LocalDateTime start;
    public String end;
    public String owner;
    public String agent;
    public ContextReturn contextReturn;
    public ContextConfig contextConfig;

    public Context() {
        keyContext = UtilApp.generateKey();
        start = LocalDateTime.now();
        listEvent =  new LinkedList<Event>();
        startUpContextConfig();
    }

    public Context(ContextConfig contextConfig) {
        keyContext = UtilApp.generateKey();
        start = LocalDateTime.now();
        listEvent =  new LinkedList<Event>();
        this.contextConfig = contextConfig;
    }

    public void startUpContextConfig(){
        ContextConfig contextConfig = new ContextConfig();
        // TODO: get from var env or overrride config;
        this.contextConfig = contextConfig;
    }

    public Context run(){
        this.contextReturn = ContextRun.run(listEvent, contextConfig);
        return this;
    }

    public Context addCommand(Command command){
        Event event = new Event(keyContext, command);
        listEvent.add(event);
        return this;
    }

    public ContextReturn getContextReturn() {
        return contextReturn;
    }


}
