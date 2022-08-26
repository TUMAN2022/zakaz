package com.example.zakaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView resultField;
    Button button;

    number1 = 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}





number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultField = findViewById(R.id.resultTextField);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        try {
        double num1, num2;
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        resultField.setText(num1 + num2 + "");

        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        intent.putExtra("data", num1 + num2 + "");
        startActivity(intent);