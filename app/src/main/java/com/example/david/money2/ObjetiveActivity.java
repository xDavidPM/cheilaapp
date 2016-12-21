package com.example.david.money2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.example.david.money2.R.id.txt_precio;

/**
 * Created by david on 15/12/16.
 */

public class ObjetiveActivity extends Activity {
    public static float precio=0;
    private EditText texto_precio;
    private Button button_guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objetive_activity);
        texto_precio=(EditText)findViewById(R.id.txt_precio);
        button_guardar=(Button)findViewById(R.id.btn_guardar);


        button_guardar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v){
                String s= texto_precio.getText().toString();
                precio= Float.parseFloat(s);
            }
        });

    }

    public void enviarPrecioPantallaAhorrar(){

        Intent intent1= new Intent(ObjetiveActivity.this, SaveActivity.class);
        intent1.putExtra("precioMeta",precio);
    }


    public void enviarPrecioPantallaDescontar(){

        Intent intent1= new Intent(ObjetiveActivity.this, SpendActivity.class);
        intent1.putExtra("precioMeta",precio);
    }






}
/*
public static class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
    }
}*/
