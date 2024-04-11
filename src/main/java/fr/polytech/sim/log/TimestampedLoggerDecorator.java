package fr.polytech.sim.log;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TimestampedLoggerDecorator implements Logger {

    private final Logger logger;
    private final SimpleDateFormat dateFormat;

    public TimestampedLoggerDecorator(Logger logger) {
        this.logger = logger;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void log(String format, Object... args) {
        Date now = new Date();
        String timestamp = this.dateFormat.format(now);
        String decoratedMessage = String.format("[%s] %s", timestamp, String.format(format, args));
        logger.log(decoratedMessage);
    }


}
