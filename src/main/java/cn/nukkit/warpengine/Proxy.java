package cn.nukkit.warpengine;

import java.util.logging.Logger;

/**
 * Project WarpEngine
 */
public class Proxy {

    private static Proxy instance;

    private Logger logger;

    public Proxy(Logger systemLogger) {
        instance = this;
        this.logger = systemLogger;
    }

}
