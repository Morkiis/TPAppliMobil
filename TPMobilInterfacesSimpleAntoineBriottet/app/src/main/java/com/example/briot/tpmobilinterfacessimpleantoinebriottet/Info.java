package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    final String EXTRA_NOM ="user_nom";
    final String EXTRA_PRENOM ="user_prenom";
    final String EXTRA_DN ="user_dn";
    final String EXTRA_MAIL ="user_mail";
    final String EXTRA_ADRESSE ="user_adresse";
    final String EXTRA_COMMENTAIRE ="user_commentaire";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent Mon2Intent = getIntent();
        TextView adresse = (TextView) findViewById(R.id.raceAdresse);
        TextView nom = (TextView) findViewById(R.id.receNom);
        TextView prenom = (TextView) findViewById(R.id.recePrenom);
        TextView dn = (TextView) findViewById(R.id.raceDN);
        TextView mail = (TextView) findViewById(R.id.raceMail);
        TextView commentaire = (TextView) findViewById(R.id.receCommentaire);
        Button Sport = (Button)findViewById(R.id.ButSport);
        Button accueil = (Button)findViewById(R.id.ButAccueil);


        if (Mon2Intent != null) {
            adresse.setText(Mon2Intent.getStringExtra(EXTRA_ADRESSE));
            nom.setText(Mon2Intent.getStringExtra(EXTRA_NOM));
            prenom.setText(Mon2Intent.getStringExtra(EXTRA_PRENOM));
            dn.setText(Mon2Intent.getStringExtra(EXTRA_DN));
            mail.setText(Mon2Intent.getStringExtra(EXTRA_MAIL));
            commentaire.setText(Mon2Intent.getStringExtra(EXTRA_COMMENTAIRE));
        }
        Sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Info.this, Sport.class);
                startActivity(Mon2Intent);
            }


        });
        accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Info.this, MainActivity.class);
                startActivity(Mon2Intent);
            }
        });



        }
}