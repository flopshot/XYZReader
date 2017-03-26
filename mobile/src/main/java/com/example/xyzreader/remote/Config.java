package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    // INITIAL COMMIT
    // USING HACK URL TO POINT TO GITHUB REPO OF CORRECT DATA. ORIGINAL LINK https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json
    // IS SHOWING 404 ERROR. PLEASE SEE UDACITY FORUM DISCUSSION FOR MORE INFO https://discussions.udacity.com/t/links-to-dropbox-for-make-your-app-material-not-working/227857
    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/Protino/dump/master/Lego/data.json" );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
