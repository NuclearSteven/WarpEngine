package cn.nukkit.warpengine.config;

import java.util.List;
import java.util.Map;

import static cn.nukkit.warpengine.utils.Validator.notNull;

/**
 * Project warpengine
 */
public class MemorySection implements ConfigurationSection {

    private ConfigurationSection parent;
    private String path;
    public ConfigurationSection root;

    public MemorySection() {
        path = "";
    }

    public MemorySection(ConfigurationSection parent, String path) {
        notNull(parent);
        notNull(path);
        this.parent = parent;
        this.path = path;
        this.root = parent.getRoot();
    }

    @Override
    public boolean contains(String path) {
        return false;
    }

    @Override
    public boolean isSet(String path) {
        return false;
    }

    @Override
    public String getCurrentPath() {
        return null;
    }

    @Override
    public ConfigurationSection getParent() {
        return null;
    }

    @Override
    public Object get(String path) {
        return null;
    }

    @Override
    public Object get(String path, Object def) {
        return null;
    }

    @Override
    public void set(String path, Object value) {

    }

    @Override
    public ConfigurationSection createSection(String path) {
        return null;
    }

    @Override
    public ConfigurationSection createSection(String path, Map<?, ?> map) {
        return null;
    }

    @Override
    public String getString(String path) {
        return null;
    }

    @Override
    public String getString(String path, String def) {
        return null;
    }

    @Override
    public int getInt(String path) {
        return 0;
    }

    @Override
    public int getInt(String path, int def) {
        return 0;
    }

    @Override
    public boolean getBoolean(String path) {
        return false;
    }

    @Override
    public boolean getBoolean(String path, boolean def) {
        return false;
    }

    @Override
    public double getDouble(String path) {
        return 0;
    }

    @Override
    public double getDouble(String path, double def) {
        return 0;
    }

    @Override
    public long getLong(String path) {
        return 0;
    }

    @Override
    public long getLong(String path, long def) {
        return 0;
    }

    @Override
    public List<?> getList(String path) {
        return null;
    }

    @Override
    public List<?> getList(String path, List<?> def) {
        return null;
    }

    @Override
    public ConfigurationSection getConfigurationSection(String path) {
        return null;
    }

    @Override
    public ConfigurationSection getDefaultSection() {
        return null;
    }

    @Override
    public ConfigurationSection getRoot() {
        return null;
    }

}
