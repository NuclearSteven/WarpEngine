package cn.nukkit.warpengine;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 * Project WarpEngine
 */
public class WarpEngine {

    public final static String MINECRAFT_VERSION = "v0.15.9 alpha";
    public final static String MINECRAFT_VERSION_NETWORK = "0.15.9";
    public final static String WARPENGINE_VERSION = "0.1-DEVELOPMENT";
    public final static String CODENAME = "Eureka";
    public static boolean ANSI = true;
    public static boolean DEV_MODE = true;//Version 0.1

    public WarpEngine() {
        initialize();
    }

    public static void main(String[] args) {
        for (String arg : args) {
            switch (arg) {
                case "-disable-ansi":
                    ANSI = false;
                    break;
                case "-dev":
                    DEV_MODE = true;
                    break;
                default:
                    System.out.println("WarpEngine: \"" + arg + "\" is not a WarpEngine start parameter.");
            }
        }

        if (ANSI) {
            //Enable ANSI
            AnsiConsole.systemInstall();
        }

        new WarpEngine();

    }

    private static void initialize() {
        Logger logger = Logger.getLogger("WarpEngine");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new Formatter() {

            @Override
            public String format(LogRecord record) {
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");

                String color = null;
                if (record.getLevel().intValue() > 800) {
                    color = ansi().fg(Ansi.Color.RED).toString();
                }
                return "[" + format.format(date) + " " + record.getLevel() + "]: " + color + formatMessage(record);
            }

        });

        for (Handler iHandler : logger.getParent().getHandlers()) {
            logger.getParent().removeHandler(iHandler);
        }
        logger.addHandler(consoleHandler);


        new Proxy(logger);
    }

}
