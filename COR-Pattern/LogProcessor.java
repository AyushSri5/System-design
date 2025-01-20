public class LogProcessor {
    LogProcessor nextLogProcessor;

    LogProcessor (LogProcessor logProcessor){
        nextLogProcessor=logProcessor;
    }
    void log(String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(message);
        }
    }
}
