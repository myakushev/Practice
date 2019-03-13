package com.example.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToNextActivity();
        goToCatActivity();
    }

    public void goToNextActivity() {
        Button button3 = findViewById(R.id.button3);
        final Intent intent = new Intent(this, FoodChoose.class);
        button3.setOnClickListener((v) -> startActivity(intent));
    }

    public void goToCatActivity() {
        Button button2 = findViewById(R.id.button2);
        final Intent intent = new Intent(this, Cat.class);
        button2.setOnClickListener((v) -> startActivity(intent));
    }
}
