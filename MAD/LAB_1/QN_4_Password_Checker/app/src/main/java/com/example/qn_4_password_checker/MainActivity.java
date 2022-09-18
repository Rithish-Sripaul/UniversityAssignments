package com.example.qn_4_password_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.effect.Effect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        EditText username, password;
        TextView message;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.usernameTextfield);
        password = (EditText) findViewById(R.id.passwordTextfield);
        message = (TextView) findViewById(R.id.message);

        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("21BCE8829", "password1");
        credentials.put("21BCE8841", "password2");
        credentials.put("21BCE8859", "password3");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String passw = password.getText().toString();
                if (credentials.containsKey(user)) {
                    if (credentials.get(user).equals(passw)) {
                        message.setText("Login Successful!");
                    } else {
                        message.setText("Wrong username/password.");
                    }
                } else {
                    message.setText("There is no such username in our database.");
                }
            }
        });
    }
}