package com.ashwin.android.didemo.model;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Computer {
    private Hardware hw;
    private Software sw;

    @Inject
    public Computer(Hardware hw, Software sw) {
        this.hw = hw;
        this.sw = sw;
    }

    @NonNull
    @Override
    public String toString() {
        return "{Hardware: " + hw + "\nSoftware: " + sw + "}";
    }
}
