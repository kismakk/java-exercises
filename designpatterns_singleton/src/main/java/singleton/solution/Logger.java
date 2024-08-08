package designpatterns_singleton.src.main.java.singleton.solution;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public synchronized void log(String level, String message) {
        String logEntry = level + ": " + message;
        logs.add(logEntry);
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void warning(String message) {
        log("WARNING", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    public synchronized List<String> getLogs() {
        return new ArrayList<>(logs);
    }

    public synchronized void clearLogs() {
        logs.clear();
    }
}
