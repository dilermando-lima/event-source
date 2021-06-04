package event.event;

public abstract class Command {

    private ExecScript scriptBefore;
    private ExecScript scriptAfter;
    private ContextConfig contextConfig;

    public ContextConfig getContextConfig() {
        return contextConfig;
    }

    public Command setContextConfig(ContextConfig contextConfig) {
        this.contextConfig = contextConfig;
        return this;
    }

    public Command setScriptBefore(ExecScript scriptBefore){
        this.scriptBefore = scriptBefore;
        return this;
    }
      
    public Command setScriptAfter(ExecScript scriptAfter){
        this.scriptAfter = scriptAfter;
        return this;
    }

    public Context run(){
       return new Context().addCommand(this).run();
    }

    public ExecScript getScriptBefore() {
        return scriptBefore;
    }

    public ExecScript getScriptAfter() {
        return scriptAfter;
    }


    
    
}
