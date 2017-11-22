package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Basket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        Button sport = (Button)findViewById(R.id.SportBut);
        Button inedex = (Button)findViewById(R.id.AccueilBut);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Basket.this, Sport.class);
                startActivity(Mon2Intent);
            }


        });
        inedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Basket.this, MainActivity.class);
                startActivity(Mon2Intent);
            }


        });
    }
}
