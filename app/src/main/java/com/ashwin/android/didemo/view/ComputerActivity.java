package com.ashwin.android.didemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ashwin.android.didemo.R;
import com.ashwin.android.didemo.di.ComputerComponent;
import com.ashwin.android.didemo.di.DaggerComputerComponent;
import com.ashwin.android.didemo.di.HardwareModule;
import com.ashwin.android.didemo.di.SoftwareModule;
import com.ashwin.android.didemo.model.Computer;

import javax.inject.Inject;

public class ComputerActivity extends AppCompatActivity {
    @Inject
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        Intent intent = getIntent();
        String os = intent.getStringExtra("os");
        String av = intent.getStringExtra("av");
        String proc = intent.getStringExtra("proc");
        String ram = intent.getStringExtra("ram");
        String hdd = intent.getStringExtra("hdd");

        ComputerComponent component = DaggerComputerComponent.builder()
                .softwareModule(new SoftwareModule(os, av))
                .hardwareModule(new HardwareModule(proc, ram ,hdd))
                .build();
        component.inject(this);

        ((TextView) findViewById(R.id.content_textview)).setText(computer.toString());
    }
}
