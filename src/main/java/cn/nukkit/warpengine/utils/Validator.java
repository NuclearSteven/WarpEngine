package cn.nukkit.warpengine.utils;

/**
 * Project warpengine
 */
public class Validator {

    public static void notNull(Object object) {
        notNull(object, object.getClass().getSimpleName() + " can't be null.");
    }

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

}
