package com.ashwin.android.didemo.di;

import com.ashwin.android.didemo.view.ComputerActivity;

import dagger.Component;

@Component(modules = {SoftwareModule.class, HardwareModule.class})
public interface ComputerComponent {
    void inject(ComputerActivity activity);
}
