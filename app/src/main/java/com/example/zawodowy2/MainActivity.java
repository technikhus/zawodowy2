package com.example.zawodowy2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int licznik = 0;
    public TextView polublenieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polublenieTextView = findViewById(R.id.textView);
    }

    public void polub(View view) {
        licznik++;
        polublenieTextView.setText(licznik + " polubień");
    }


    public void usun(View view) {
        licznik--;
        if(licznik < 0 ){
            licznik = 0;
        }
        polublenieTextView.setText(licznik + " polubień");
    }
}