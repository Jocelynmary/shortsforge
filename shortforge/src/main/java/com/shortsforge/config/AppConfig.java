package com.shortsforge.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
    private final Properties properties;

    public AppConfig() {
        this.properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException("config.properties not found in resources folder");
            }
            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public String getPexelsApiKey() {
        return properties.getProperty("pexels.api.key");
    }

    public String getTtsApiKey() {
        return properties.getProperty("tts.api.key");
    }
}