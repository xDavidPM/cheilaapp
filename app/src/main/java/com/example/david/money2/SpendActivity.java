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

public class SpendActivity extends FragmentActivity implements SpendFragment.OnFragmentInteractionListener {
    TextView textView_valorActual;
    TextView textView_valorGastado;
    TextView textView_valorAhorrado;
    TextView textView_mensaje;
    float valor_actual;
    float dinero_gastado=0;
    float dinero_ahorrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spend_activity);
        textView_valorActual=(TextView)findViewById(R.id.tv_montoActual);
        textView_valorGastado=(TextView)findViewById(R.id.txt_valorGastado);
        textView_valorAhorrado=(TextView)findViewById(R.id.txt_valorAhorrado);
        textView_mensaje=(TextView)findViewById(R.id.txt_mensaje);

        Intent intent1=getIntent();
        valor_actual=intent1.getFloatExtra("precioMeta",ObjetiveActivity.precio);

        Intent intent2=getIntent();
        dinero_ahorrado=intent2.getFloatExtra("dineroAhorrado",SaveActivity.dinero_guardado);
        textView_valorAhorrado.setText(String.valueOf(dinero_ahorrado));

    }

    public float restarAhorros(float monto){
        dinero_gastado=dinero_gastado+monto;
        float nuevo_valor=-monto-valor_actual;
        if(monto>dinero_ahorrado){
            textView_mensaje.setText("El monto ingresado supera sus ahorros");
            nuevo_valor=valor_actual;
        }
        textView_valorGastado.setText(String.valueOf(dinero_gastado));

        return nuevo_valor;

    }



    @Override
    public void onFragmentInteraction2(float valor) {
        String valorNuevo=Float.toString(restarAhorros(valor));
        textView_valorActual.setText(valorNuevo);
    }
}
