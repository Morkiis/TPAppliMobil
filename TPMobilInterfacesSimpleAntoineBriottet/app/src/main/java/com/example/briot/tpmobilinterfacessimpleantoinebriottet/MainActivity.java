package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button MonBouton=(Button)findViewById(R.id.Startbutton); // Definir bouton sous MonBouton



        MonBouton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent MonIntent = new Intent(MainActivity.this, Authentification2.class);

               startActivity(MonIntent);
            }

        });
    }
}
