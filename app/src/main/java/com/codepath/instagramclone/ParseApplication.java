package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FDkXcCxmc3Nkbq8RZZsQXXaJTA7qh0xvIhliK6n6")
                .clientKey("puH4t3vGFktNvP8TCzFf51CUgTFYtJNXgo2v9Jx1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
