package event.event;

import java.time.LocalDateTime;

import event.util.UtilApp;

public class Event {

    private String keyEvent;
    private String keyContext; 
    private LocalDateTime time;
    private String owner;
    private Command command;
    private Throwable exceptionEvent;
    private Throwable exceptionScriptBefore;
    private Throwable exceptionScriptAfter;
    private boolean failedEvent;
    private boolean failedScriptBefore;
    private boolean failedScriptAfter;


    public Event(String keyContext, Command command) {
        this.command = command;
        this.keyContext = keyContext;
        this.keyEvent = UtilApp.generateKey();
        this.failedEvent = false;
        this.failedScriptBefore = false;
        this.failedScriptAfter = false;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getKeyEvent() {
        return keyEvent;
    }


    public String getKeyContext() {
        return keyContext;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Command getCommand() {
        return command;
    }

    public Throwable getExceptionEvent() {
        return exceptionEvent;
    }

    public void setExceptionEvent(Throwable exceptionEvent) {
        this.exceptionEvent = exceptionEvent;
    }

    public Throwable getExceptionScriptBefore() {
        return exceptionScriptBefore;
    }

    public void setExceptionScriptBefore(Throwable exceptionScriptBefore) {
        this.exceptionScriptBefore = exceptionScriptBefore;
    }

    public Throwable getExceptionScriptAfter() {
        return exceptionScriptAfter;
    }

    public void setExceptionScriptAfter(Throwable exceptionScriptAfter) {
        this.exceptionScriptAfter = exceptionScriptAfter;
    }


    public boolean isFailedEvent() {
        return failedEvent;
    }


    public void setFailedEvent(boolean failedEvent) {
        this.failedEvent = failedEvent;
    }


    public boolean isFailedScriptBefore() {
        return failedScriptBefore;
    }


    public void setFailedScriptBefore(boolean failedScriptBefore) {
        this.failedScriptBefore = failedScriptBefore;
    }


    public boolean isFailedScriptAfter() {
        return failedScriptAfter;
    }


    public void setFailedScriptAfter(boolean failedScriptAfter) {
        this.failedScriptAfter = failedScriptAfter;
    }


    

}
