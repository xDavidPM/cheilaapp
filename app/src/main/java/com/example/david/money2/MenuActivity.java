package com.example.david.money2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by david on 15/12/16.
 */

public class MenuActivity extends Activity {

    private Button objetive, save , spend, status;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_actitivy);

        objetive = (Button) findViewById(R.id.lyt_obj);
        save = (Button) findViewById(R.id.lyt_save);
        spend = (Button) findViewById(R.id.lyt_spend);
        status = (Button) findViewById(R.id.lyt_status);


        objetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent u;

                u = new Intent(MenuActivity.this, ObjetiveActivity.class);
                startActivity(u);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent a;

                a = new Intent(MenuActivity.this, SaveActivity.class);
                startActivity(a);
            }
        });

        spend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent e;

                e = new Intent(MenuActivity.this, SpendActivity.class);
                startActivity(e);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent o;

                o = new Intent(MenuActivity.this, StatusActivity.class);
                startActivity(o);
            }
        });
    }
}