package com.example.qn_3_hello_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText name;
        Button button;
        TextView printName;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        printName = (TextView) findViewById(R.id.result);
        name = (EditText) findViewById(R.id.nameField);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printName.setText("Hello, " + name.getText());
            }
        });
    }
}