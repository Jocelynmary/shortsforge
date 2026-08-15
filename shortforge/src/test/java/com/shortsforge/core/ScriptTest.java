package com.shortsforge.core;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScriptTest {

    @Test
    public void shouldReturnCorrectScenesAndCount() {
        Scene scene1 = new Scene("Walking through a forest", "forest walk");
        Scene scene2 = new Scene("Standing near a waterfall", "waterfall nature");

        Script script = new Script(List.of(scene1, scene2));

        assertEquals(2, script.getSceneCount());
        assertEquals("forest walk", script.getScenes().get(0).getKeyword());
    }
}