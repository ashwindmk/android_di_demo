package com.ashwin.android.didemo.model;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Software {
    public String os;
    public String av;

    @Inject
    public Software(String os, String av) {
        this.os = os;
        this.av = av;
    }

    @NonNull
    @Override
    public String toString() {
        return "{OS: " + os + ", AV: " + av +"}";
    }
}
