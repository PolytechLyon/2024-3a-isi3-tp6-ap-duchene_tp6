package fr.polytech.sim.log;

public class LoggerFactory {

    public enum LoggerType {
        CONSOLE,
        FILE
    }

    public static Logger getLogger(LoggerType type, String name) {
        Logger logger;
        switch (type) {
            case CONSOLE:
                logger = new ConsoleLogger(name);
                break;
            case FILE:
                logger = new FileLogger(name);
                break;
            default:
                throw new IllegalArgumentException("Invalid logger type: " + type);
        }
        return new TimestampedLoggerDecorator(logger);
    }

}
