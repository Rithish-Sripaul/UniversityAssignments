package com.example.iot_bill_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCheckedTextView;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText quantArduiono, quantWifi, quantBluetooth;
    private TextView result;
    private Button submitbtn, clearbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        quantArduiono = (EditText) findViewById(R.id.quantityArduino);
        quantBluetooth = (EditText) findViewById(R.id.quantityBluetooth);
        quantWifi = (EditText) findViewById(R.id.quantityWifi);
        submitbtn = (Button) findViewById(R.id.submit);
        clearbtn = (Button) findViewById(R.id.clear);
        result = (TextView) findViewById(R.id.resultText);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qtyArduino = quantArduiono.getText().toString();
                String qtyWifi = quantWifi.getText().toString();
                String qtyBluetooth = quantBluetooth.getText().toString();
                int total = (Integer.parseInt(qtyArduino) * 500) + (Integer.parseInt(qtyWifi) * 250) + (Integer.parseInt(qtyBluetooth) * 200);
                result.setText(Integer.toString(total) + " RS");
            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantArduiono.setText("");
                quantBluetooth.setText("");
                quantWifi.setText("");
                result.setText("");
            }
        });
    }
}