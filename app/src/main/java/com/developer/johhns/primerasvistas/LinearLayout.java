package com.developer.johhns.primerasvistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Toolbar barra_acciones = findViewById( R.id.miActionBar2 ) ;
        setSupportActionBar(barra_acciones);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}