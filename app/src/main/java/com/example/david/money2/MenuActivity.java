package com.example.david.money2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by david on 15/12/16.
 */

public class MenuActivity extends AppCompatActivity {

    LinearLayout objetive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_actitivy);

        objetive = (LinearLayout) findViewById(R.id.lyt_goal);

        objetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i;

                i = new Intent(MenuActivity.this, ObjetiveActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}


