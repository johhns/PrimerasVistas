package com.developer.johhns.primerasvistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnVistas, btnLinearLayout, btnTableLayout , btnConstrLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar barra = findViewById( R.id.toolbar_ppl ) ;
        setSupportActionBar(barra);

        btnVistas       = findViewById( R.id.btnVistas ) ;
        btnLinearLayout = findViewById( R.id.btnLinearLayout ) ;
        btnTableLayout  = findViewById( R.id.btnTableLayout ) ;
        btnConstrLayout = findViewById( R.id.btnConstLayout ) ;

        btnVistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( view.getContext() , Vistas.class ));
            }
        });

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( view.getContext() , LinearLayout.class ) );
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( view.getContext() , Table_Layout.class ) );
            }
        });

        btnConstrLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( view.getContext() , ConstraintLayout.class ) );
            }
        });



    }
}