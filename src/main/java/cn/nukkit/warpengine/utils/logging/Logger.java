package cn.nukkit.warpengine.utils.logging;

/**
 * Project WarpEngine
 */
public class Logger {

    protected static boolean initialized = false;
    protected static final String GLOBAL_LOGGER_NAME = "warpengine-global";
    protected static Logger global;

    protected MessageLevel defaultMessageLevel;
    protected boolean isSystemLogger;
    protected boolean isAnonymousLogger;
    protected String name;

    protected Logger(String name) {
        new Logger(name, false, MessageLevel.INFO);
    }

    protected Logger(String name, boolean systemLogger, MessageLevel defaultMessageLevel) {
        this.name = name;
        this.isSystemLogger = systemLogger;
        this.defaultMessageLevel = defaultMessageLevel;

        if (name == null) {
            isAnonymousLogger = true;
        }
    }

    public void log(String s) {
        System.out.println(s);
    }

    public void setDefaultMessageLevel(MessageLevel messageLevel) {
        this.defaultMessageLevel = messageLevel;
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

    protected static void initialize() {
        if (initialized) {
            return;
        }

        global = new Logger(GLOBAL_LOGGER_NAME);

        initialized = true;
    }

}
