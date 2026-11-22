package com.codeguard.lab;

import java.net.URL;
import java.net.URLConnection;

public class UrlFetcher {

    public URLConnection fetch(String inputUrl) throws Exception {
        URL url = new URL(inputUrl);
        return url.openConnection();
    }
}
