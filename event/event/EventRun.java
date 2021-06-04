package event.event;

import java.time.LocalDateTime;

public class EventRun {


    public static Event run(Event event){

        try{
            runScriptBefore( event.getCommand().getScriptBefore(), event.getCommand().getContextConfig());
        }catch( Throwable e ){
            event.setExceptionScriptBefore(e);
            event.setFailedScriptBefore(true);
        }
        
        event.setTime(LocalDateTime.now());
        
        // RUN EVENT HERE
        


        try{
            runScriptAfter( event.getCommand().getScriptAfter(), event.getCommand().getContextConfig());
        }catch( Throwable e ){
            event.setExceptionScriptAfter(e);
            event.setFailedScriptAfter(true);
        }
     
        
        return event;
    }
    
    private static void runScriptBefore(ExecScript execScript, ContextConfig contextConfig ) throws Throwable{

        if( contextConfig.getRetryOnScriptBeforeError() <= 0 ){
            execScript.exec(); 
        }else{
            for (int i = 0; i <= contextConfig.getRetryOnScriptBeforeError(); i++) {
                try{
                    execScript.exec(); 
                    return;
                }catch(Throwable e){
                    if( i >= contextConfig.getRetryOnScriptBeforeError() )
                        throw new Throwable(e);
                }
            }
        }
    }



    private static void runScriptAfter(ExecScript execScript, ContextConfig contextConfig ) throws Throwable{

        if( contextConfig.getRetryOnScriptAfterError() <= 0 ){
            execScript.exec(); 
        }else{
            for (int i = 0; i <= contextConfig.getRetryOnScriptAfterError(); i++) {
                try{
                    execScript.exec();
                    return;
                }catch(Throwable e){
                    if( i >= contextConfig.getRetryOnScriptAfterError() )
                        throw new Throwable(e);
                }
            }
        }
    }

}
