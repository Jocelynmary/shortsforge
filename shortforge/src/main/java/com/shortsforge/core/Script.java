package com.shortsforge.core;

import java.util.List;

public class Script {
    private final List<Scene> scenes;

    public Script(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public int getSceneCount() {
        return scenes.size();
    }
}
