package cn.nukkit.warpengine.utils.logging;

/**
 * Project WarpEngine
 */
public class MessageLevel {

    public static final MessageLevel SEVERE = new MessageLevel("SEVERE", 1000);
    public static final MessageLevel WARNING = new MessageLevel("WARNING", 900);
    public static final MessageLevel INFO = new MessageLevel("INFO", 800);
    public static final MessageLevel CONFIG = new MessageLevel("CONFIG", 700);
    public static final MessageLevel FINE = new MessageLevel("FINE", 500);
    public static final MessageLevel FINER = new MessageLevel("FINER", 400);
    public static final MessageLevel FINEST = new MessageLevel("FINEST", 300);
    public static final MessageLevel ALL = new MessageLevel("ALL", Integer.MIN_VALUE);

    public final String LEVEL;
    public final int INTEGER_VALUE;

    private MessageLevel(String level, int value) {
        this.LEVEL = level;
        this.INTEGER_VALUE = value;
    }

}
