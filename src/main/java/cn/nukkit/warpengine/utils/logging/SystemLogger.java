package cn.nukkit.warpengine.utils.logging;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.Color.YELLOW;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * Project WarpEngine
 */
public class SystemLogger extends Logger {

    public static final String PREFIX = "WarpEngine";

    public SystemLogger() {
        super("System");
    }

    public SystemLogger(String name) {
        super(name);
    }

    protected void log(String s, MessageLevel messageLevel, String prefix) {
        DateFormat dateFormat = new SimpleDateFormat("dd HH:mm:ss");
        Date date = new Date();
        log("[" + dateFormat.format(date) + "]" + (prefix == null ? "" : "[" + prefix + "] ") + messageLevel.LEVEL + ": " + s);
    }

    public void info(String s) {
        log(s, MessageLevel.INFO, PREFIX);
    }

    public void warning(String s) {
        log(ansi().fg(RED).a(s).reset().toString(), MessageLevel.WARNING, PREFIX);
    }

    public void debug(String s) {
        log(s, MessageLevel.FINEST, PREFIX);
    }

    public void severe(String s) {
        log(ansi().bg(RED).fg(YELLOW).a(s).reset().toString(), MessageLevel.SEVERE, PREFIX);
    }


}
