package cn.nukkit.warpengine.utils.logging;

/**
 * Project WarpEngine
 */
public class Logger {

    private static boolean initialized = false;
    private static final String GLOBAL_LOGGER_NAME = "warpengine-global";
    private static Logger global;

    private MessageLevel defaultMessageLevel;
    private boolean isSystemLogger;
    private boolean isAnonymousLogger;
    private String name;

    private Logger(String name) {
        new Logger(name, false, MessageLevel.INFO);
    }

    private Logger(String name, boolean systemLogger, MessageLevel defaultMessageLevel) {
        this.name = name;
        this.isSystemLogger = systemLogger;
        this.defaultMessageLevel = defaultMessageLevel;

        if (name == null) {
            isAnonymousLogger = true;
        }
    }

    public void checkPermission() {

    }

    @Deprecated
    public static Logger getAnonymousLogger() {
        return new Logger(null, false, MessageLevel.FINEST);
    }

    public static Logger getGlobalLogger() {
        initialize();

        return global;
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    private static void initialize() {
        if (initialized) {
            return;
        }

        global = new Logger(GLOBAL_LOGGER_NAME);

        initialized = true;
    }

}
