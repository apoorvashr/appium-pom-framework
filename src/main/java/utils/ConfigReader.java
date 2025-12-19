package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties props = new Properties();

    static {
        String resourceName = "config.properties"; // file name on classpath
        try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName)) {
            if (in == null) {
                // Try alternative: from the class package (less common)
                InputStream in2 = ConfigReader.class.getResourceAsStream("/" + resourceName);
                if (in2 == null) {
                    throw new IllegalStateException("Could not find " + resourceName + " on the classpath. Make sure it's in src/main/resources or src/test/resources.");
                } else {
                    props.load(in2);
                }
            } else {
                props.load(in);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load " + resourceName, e);
        }
    }

    //constructor
    private ConfigReader() {
        /* no instantiation */
    }

    public static String get(String key) {
        String v = props.getProperty(key);
        if (v == null) {
            throw new IllegalArgumentException("Missing property: " + key + " in config.properties");
        }
        return v;
    }

    // Optional: get with default
    public static String getOrDefault(String key, String defaultValue) {
        return props.getProperty(key, defaultValue);
    }

}
