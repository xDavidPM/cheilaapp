package com.example.david.money2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by david on 15/12/16.
 */

public class SaveActivity extends FragmentActivity implements SaveFragment.OnFragmentInteractionListener {
    TextView textView_valorActual;
    TextView textView_valorAhorrado;
    float valor_actual;
    static float dinero_guardado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_activity);
        textView_valorActual=(TextView)findViewById(R.id.tv_montoActual);
        textView_valorAhorrado=(TextView)findViewById(R.id.txt_valorAhorrado);
        Intent intent=getIntent();
        valor_actual=intent.getFloatExtra("precioMeta",ObjetiveActivity.precio);


    }


    public float sumarAhorros(float monto){
        dinero_guardado=dinero_guardado+monto;
        textView_valorAhorrado.setText(String.valueOf(dinero_guardado));
        float nuevo_valor=monto-valor_actual;
        return nuevo_valor;
    }

    @Override
    public void onFragmentInteraction1(float valor) {
        String valorNuevo=Float.toString(sumarAhorros(valor));
        textView_valorActual.setText(valorNuevo);
    }

    public void enviarAhorrosPantallaDescontar(){

        Intent intent1= new Intent(SaveActivity.this, SpendActivity.class);
        intent1.putExtra("dineroAhorrado",dinero_guardado);
    }
}
