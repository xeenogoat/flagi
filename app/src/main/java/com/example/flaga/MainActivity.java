package com.example.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznikZlych = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void zlaOdpowiedz(View view) {
        Toast.makeText(this, R.string.podsumowanie, Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(view.INVISIBLE);
        licznikZlych++;
        if(licznikZlych ==4){
            textView.setText(R.string.podsumowanie);
        }
    }
}