package com.example.david.money2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class IngressActivity extends AppCompatActivity {

    Button  ingress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingress_activity);

        ingress = (Button) findViewById(R.id.btn_ingress);

        ingress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                Intent i;

                i = new Intent(IngressActivity.this, MenuActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}
