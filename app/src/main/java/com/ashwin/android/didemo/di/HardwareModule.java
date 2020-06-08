package com.ashwin.android.didemo.di;

import com.ashwin.android.didemo.model.Hardware;

import dagger.Module;
import dagger.Provides;

@Module
public class HardwareModule {
    private String proc;
    private String ram;
    private String hdd;

    public HardwareModule(String p, String r, String h) {
        proc = p;
        ram = r;
        hdd = h;
    }

    @Provides
    public Hardware provideHardware() {
        return new Hardware(proc, ram, hdd);
    }
}
