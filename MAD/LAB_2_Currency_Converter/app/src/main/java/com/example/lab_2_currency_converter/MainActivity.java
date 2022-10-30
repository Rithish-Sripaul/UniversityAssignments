package com.example.lab_2_currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup radioCurrencyGroup;
    RadioButton radioCurrencyButton;
    TextView result;
    EditText inputCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.resultText);
        radioCurrencyGroup = (RadioGroup) findViewById(R.id.currencies);
        inputCurrency = (EditText) findViewById(R.id.inputText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(inputCurrency.getText().toString());
                radioCurrencyButton = (RadioButton) findViewById(radioCurrencyGroup.getCheckedRadioButtonId());
                if (radioCurrencyButton.getText().equals("USD")) {
                    result.setText(String.format("%.2f", value / 81.26));
                } else if (radioCurrencyButton.getText().equals("EURO")) {
                    result.setText(String.format("%.2f", value / 78.74));
                } else {
                    result.setText(String.format("%.2f", value / 0.57));
                }
            }
        });
    }
}