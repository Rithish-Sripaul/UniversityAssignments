package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    ToggleButton tb;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.toggleButton);
        sw = findViewById(R.id.switch1);
//        tb.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener() this);
        tb.setOnCheckedChangeListener(this);
        sw.setOnCheckedChangeListener(this);

//        Spinner spinner = findViewById(R.id.spinner);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Branch, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()) {
            case R.id.switch1:
                if (isChecked)
                    showMessage("Switch id ON");
                else
                    showMessage("Switch is OFF");
                break;
            case R.id.toggleButton:
                if (isChecked)
                    showMessage("Toggle button is ON");
                else
                    showMessage("Toggle button is OFF");
                break;
        }
    }

    private void showMessage(String msg) {Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();}

//


}