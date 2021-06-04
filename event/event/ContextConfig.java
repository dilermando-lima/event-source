package event.event;

public class ContextConfig {

    private ExecScript scriptOnAnyError;
    private ExecScript scriptOnSpecificError;
    private Class<? extends Throwable> classExceptionOnSpecificError;
    
    private int retryOnCommandError = 0;
    private int retryOnScriptBeforeError = 0;
    private int retryOnScriptAfterError = 0;
    private boolean continueNextOnCommandError = false;
    private boolean continueNextOnScriptError = false;

    public ContextConfig setScriptOnAnyError(ExecScript scriptOnAnyError){
        this.scriptOnAnyError = scriptOnAnyError;
        return this;
    }

    public int getRetryOnCommandError() {
        return retryOnCommandError;
    }

    public ContextConfig setRetryOnCommandError(int retryOnCommandError) {
        this.retryOnCommandError = retryOnCommandError;
        return this;
    }

    public int getRetryOnScriptBeforeError() {
        return retryOnScriptBeforeError;
    }

    public ContextConfig setRetryOnScriptBeforeError(int retryOnScriptBeforeError) {
        this.retryOnScriptBeforeError = retryOnScriptBeforeError;
        return this;
    }

    public int getRetryOnScriptAfterError() {
        return retryOnScriptAfterError;
    }

    public ContextConfig setRetryOnScriptAfterError(int retryOnScriptAfterError) {
        this.retryOnScriptAfterError = retryOnScriptAfterError;
        return this;
    }

    public boolean isContinueNextOnCommandError() {
        return continueNextOnCommandError;
    }

    public ContextConfig setContinueNextOnCommandError(boolean continueNextOnCommandError) {
        this.continueNextOnCommandError = continueNextOnCommandError;
        return this;
    }

    public boolean isContinueNextOnScriptError() {
        return continueNextOnScriptError;
    }

    public  ContextConfig setContinueNextOnScriptError(boolean continueNextOnScriptError) {
        this.continueNextOnScriptError = continueNextOnScriptError;
        return this;
    }

    public ExecScript getScriptOnAnyError(){
        return this.scriptOnAnyError;
    }

    public ContextConfig setScriptOnSpecificError(Class<? extends Throwable> exception, ExecScript scriptOnSpecificError){
        this.scriptOnSpecificError = scriptOnSpecificError;
        this.classExceptionOnSpecificError = exception;
        return this;
    }

    public ExecScript getScriptOnSpecificError(){
        return this.scriptOnSpecificError;
    }

    public Class<? extends Throwable>  getClassExceptionOnSpecificError(){
        return this.classExceptionOnSpecificError;
    }


}
