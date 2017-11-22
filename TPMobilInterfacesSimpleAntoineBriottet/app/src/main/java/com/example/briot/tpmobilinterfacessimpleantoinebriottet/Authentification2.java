package com.example.briot.tpmobilinterfacessimpleantoinebriottet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Authentification2 extends AppCompatActivity {
    final String EXTRA_NOM ="user_nom";
    final String EXTRA_PRENOM ="user_prenom";
    final String EXTRA_DN ="user_dn";
    final String EXTRA_MAIL ="user_mail";
    final String EXTRA_ADRESSE ="user_adresse";
    final String EXTRA_COMMENTAIRE ="user_commentaire";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification2);
        final EditText nom =(EditText) findViewById(R.id.textNom);
        final EditText prenom =(EditText) findViewById(R.id.textPrenom);
        final EditText dn =(EditText) findViewById(R.id.textDN);
        final EditText mail =(EditText) findViewById(R.id.textMail);
        final EditText adresse =(EditText) findViewById(R.id.textAdresse);
        final EditText commentaire =(EditText) findViewById(R.id.textCommentaire);
        final Button MonBouton=(Button)findViewById(R.id.ButVal);



        MonBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Mon Application", "Mon appli écrit dans la log");
                Intent Mon2Intent = new Intent(Authentification2.this, Info.class);
                Mon2Intent.putExtra(EXTRA_NOM, nom.getText().toString());
                Mon2Intent.putExtra(EXTRA_PRENOM, prenom.getText().toString());
                Mon2Intent.putExtra(EXTRA_DN, dn.getText().toString());
                Mon2Intent.putExtra(EXTRA_MAIL, mail.getText().toString());
                Mon2Intent.putExtra(EXTRA_ADRESSE, adresse.getText().toString());
                Mon2Intent.putExtra(EXTRA_COMMENTAIRE, commentaire.getText().toString());

                startActivity(Mon2Intent);
            }

        });
    }
}
