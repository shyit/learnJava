package net.htwater.think.D12.D12_1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by 96955 on 2019/4/26.
 */
public class LoggingException {
    public static void main(String[] argts) {
        try {
            throw new htLoggingException();
        } catch (htLoggingException e) {
//            e.printStackTrace();
            System.err.println("Caught "+e);
        }
    }
}

class htLoggingException extends Exception {
    private static Logger logger = Logger.getLogger("htLog");

    public htLoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

