package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Foot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foot);
        Button sport = (Button)findViewById(R.id.ButFoot);
        Button inedex = (Button)findViewById(R.id.Butacce);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Foot.this, Sport.class);
                startActivity(Mon2Intent);
            }


        });
        inedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Foot.this, MainActivity.class);
                startActivity(Mon2Intent);
            }


        });
    }
}
