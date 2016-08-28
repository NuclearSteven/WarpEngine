package cn.nukkit.warpengine.config;

import java.util.List;
import java.util.Map;

/**
 * Project WarpEngine
 */
public interface ConfigurationSection {

    public boolean contains(String path);

    public boolean isSet(String path);

    public String getCurrentPath();

    public ConfigurationSection getParent();

    public Object get(String path);

    public Object get(String path, Object def);

    public void set(String path, Object value);

    public ConfigurationSection createSection(String path);

    public ConfigurationSection createSection(String path, Map<?, ?> map);

    public String getString(String path);

    public String getString(String path, String def);

    public int getInt(String path);

    public int getInt(String path, int def);

    public boolean getBoolean(String path);

    public boolean getBoolean(String path, boolean def);

    public double getDouble(String path);

    public double getDouble(String path, double def);

    public long getLong(String path);

    public long getLong(String path, long def);

    public List<?> getList(String path);

    public List<?> getList(String path, List<?> def);

    public ConfigurationSection getConfigurationSection(String path);

    public ConfigurationSection getDefaultSection();

    public ConfigurationSection getRoot();

}
