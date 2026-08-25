package com.shortsforge.config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppConfigTest {

    @Test
    public void shouldLoadPexelsApiKeyFromConfig() {
        AppConfig config = new AppConfig();

        assertEquals("YOUR_PEXELS_KEY_HERE", config.getPexelsApiKey());
    }

    @Test
    public void shouldLoadTtsApiKeyFromConfig() {
        AppConfig config = new AppConfig();

        assertEquals("YOUR_TTS_KEY_HERE", config.getTtsApiKey());
    }
}