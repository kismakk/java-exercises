package designpatterns_singleton.src.test.java.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import designpatterns_singleton.src.main.java.singleton.solution.Logger;

public class LoggerTest {

    @BeforeEach
    void setUp() {
        Logger.getInstance().clearLogs();
    }

    @Test
    void testSingletonInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2);
    }

    @Test
    void testLogs() {
        Logger logger = Logger.getInstance();
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.error("This is an error message");

        var logs = logger.getLogs();
        assertEquals(3, logs.size());
        assertTrue(logs.get(0).contains("INFO: This is an info message"));
        assertTrue(logs.get(1).contains("WARNING: This is a warning message"));
        assertTrue(logs.get(2).contains("ERROR: This is an error message"));
    }
}
