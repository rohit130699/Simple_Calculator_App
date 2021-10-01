package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAdd(View v){
        EditText ed1 = (EditText)findViewById(R.id.editTextNumber);
        EditText  ed2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView res = (TextView)findViewById(R.id.textView);
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int c = a + b;
        res.setText(Integer.toString(c));
    }
    public void onSub(View v){
        EditText ed1 = (EditText)findViewById(R.id.editTextNumber);
        EditText  ed2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView res = (TextView)findViewById(R.id.textView);
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int c = a - b;
        res.setText(Integer.toString(c));
    }
    public void onMul(View v){
        EditText ed1 = (EditText)findViewById(R.id.editTextNumber);
        EditText  ed2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView res = (TextView)findViewById(R.id.textView);
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int c = a * b;
        res.setText(Integer.toString(c));
    }
    public void onDiv(View v){
        EditText ed1 = (EditText)findViewById(R.id.editTextNumber);
        EditText  ed2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView res = (TextView)findViewById(R.id.textView);
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int c = a / b;
        res.setText(Integer.toString(c));
    }
    public void onMod(View v){
        EditText ed1 = (EditText)findViewById(R.id.editTextNumber);
        EditText  ed2 = (EditText)findViewById(R.id.editTextNumber2);
        TextView res = (TextView)findViewById(R.id.textView);
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int c = a % b;
        res.setText(Integer.toString(c));
    }
}