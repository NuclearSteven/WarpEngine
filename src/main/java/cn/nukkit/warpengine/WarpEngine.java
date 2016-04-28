package cn.nukkit.warpengine;

import org.fusesource.jansi.AnsiConsole;

/**
 * Project WarpEngine
 */
public class WarpEngine {

    public final static String MINECRAFT_VERSION = "v0.14.2 alpha";
    public final static String MINECRAFT_VERSION_NETWORK = "0.14.2";
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
        new Proxy();
    }

}
