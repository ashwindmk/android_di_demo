package com.ashwin.android.didemo.model;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Hardware {
    public String proc;
    public String ram;
    public String hdd;

    @Inject
    public Hardware(String proc, String ram, String hdd) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
    }

    @NonNull
    @Override
    public String toString() {
        return "{Processor: " + proc + ", RAM: " + ram + ", HDD: " + hdd +"}";
    }
}
