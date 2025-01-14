import java.util.Date;

public class LogMessage {
    private Date timestamp;
    private LogLevel logLevel;
    private String messageContent;

    public Date getTimestamp() {
        return timestamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
