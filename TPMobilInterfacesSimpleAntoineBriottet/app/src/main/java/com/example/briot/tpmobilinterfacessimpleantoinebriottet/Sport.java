package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        Button foot = (Button)findViewById(R.id.ButFoot);
        Button index = (Button)findViewById(R.id.ButACC);

        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Sport.this, Foot.class);
                startActivity(Mon2Intent);
            }


        });
        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Sport.this, MainActivity.class);
                startActivity(Mon2Intent);
            }


        });
    }
}
