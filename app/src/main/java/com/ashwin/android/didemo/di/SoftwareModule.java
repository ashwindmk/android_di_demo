package com.ashwin.android.didemo.di;

import com.ashwin.android.didemo.model.Software;

import dagger.Module;
import dagger.Provides;

@Module
public class SoftwareModule {
    private String os;
    private String av;

    public SoftwareModule(String o, String a) {
        os = o;
        av = a;
    }

    @Provides
    public Software provideSoftware() {
        return new Software(os, av);
    }
}
