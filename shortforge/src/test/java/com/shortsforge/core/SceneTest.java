package com.shortsforge.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SceneTest {
    @Test
    public void shouldReturnCorrectNarrationTextAndKeyword() {
        Scene scene = new Scene("Walking through a forest", "forest walk");

        assertEquals("Walking through a forest", scene.getNarrationText());
        assertEquals("forest walk", scene.getKeyword());
    }
}
