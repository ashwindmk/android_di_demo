package com.ashwin.android.didemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.ashwin.android.didemo.R;

public class BuilderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        Button buildButton = findViewById(R.id.build_button);
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build();
            }
        });
    }

    private void build() {
        String os = ((Spinner) findViewById(R.id.os_spinner)).getSelectedItem().toString();
        String av = ((Spinner) findViewById(R.id.av_spinner)).getSelectedItem().toString();

        String proc = ((Spinner) findViewById(R.id.proc_spinner)).getSelectedItem().toString();
        String ram = ((Spinner) findViewById(R.id.ram_spinner)).getSelectedItem().toString();
        String hdd = ((Spinner) findViewById(R.id.hdd_spinner)).getSelectedItem().toString();

        Intent intent = new Intent(this, ComputerActivity.class);
        intent.putExtra("os", os);
        intent.putExtra("av", av);
        intent.putExtra("proc", proc);
        intent.putExtra("ram", ram);
        intent.putExtra("hdd", hdd);
        startActivity(intent);
    }
}
