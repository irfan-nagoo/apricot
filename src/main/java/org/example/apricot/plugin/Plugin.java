package org.example.apricot.plugin;

import java.io.IOException;
import java.util.Properties;

public class Plugin {

    private static final Properties PLUGIN_PROPERTIES;

    static {
        PLUGIN_PROPERTIES = new Properties();
        try {
            var fis = Plugin.class.getClassLoader().getResourceAsStream(getPluginPropertiesFile());
            PLUGIN_PROPERTIES.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Object getInstance(Class<?> iface) {
        try {
            var clazz = PLUGIN_PROPERTIES.getProperty(iface.getName());
            return Class.forName(clazz).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getPluginPropertiesFile() {
        var env = System.getenv("active.profile");
        return env == null ? "plugins/plugin.properties" : "plugins/plugin_" + env + ".properties";
    }

}
