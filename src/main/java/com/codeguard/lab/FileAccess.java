package com.codeguard.lab;

import java.io.File;

public class FileAccess {

    private final String baseDirectory = "/app/uploads";

    public File getFile(String filename) {
        return new File(baseDirectory, filename);
    }
}
