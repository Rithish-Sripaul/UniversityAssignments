    package com.example.qn_5_arithmetic_operators;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.TextView;
    import android.widget.EditText;
    import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Button button;
            EditText num1, num2;
            TextView addition, subtraction, multiplication, division;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button);
            num1 = (EditText) findViewById(R.id.number1);
            num2 = (EditText) findViewById(R.id.number2);
            addition = (TextView) findViewById(R.id.add);
            subtraction = (TextView)findViewById(R.id.subtract);
            multiplication = (TextView)findViewById(R.id.multiply);
            division = (TextView)findViewById(R.id.divide);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int n1 = Integer.parseInt(num1.getText().toString());
                    int n2 = Integer.parseInt(num2.getText().toString());
                    addition.setText(addition.getText() + Integer.toString(n1 + n2));
                    subtraction.setText(subtraction.getText() + Integer.toString(n1 - n2));
                    multiplication.setText(multiplication.getText() + Integer.toString(n1 * n2));
                    division.setText(division.getText() + Integer.toString(n1 / n2));
                }
            });
        }
    }