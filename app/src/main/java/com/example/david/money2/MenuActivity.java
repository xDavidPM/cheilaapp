package com.example.david.money2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by david on 15/12/16.
 */

public class MenuActivity extends AppCompatActivity {

    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_actitivy);

        save = (Button) findViewById(R.id.btn_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i;

                i = new Intent(MenuActivity.this, SaveActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}


