package com.example.david.money2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SaveFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    EditText editText_valor_ahorrar;
    float valor_ahorrado;


    public SaveFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_save, container, false);
        Button boton_guardar = (Button)v.findViewById(R.id.lyt_guardar);
        editText_valor_ahorrar = (EditText) v.findViewById(R.id.edt_ahorro);
        boton_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor_ahorrado=Float.parseFloat(editText_valor_ahorrar.getText().toString());;
                mListener.onFragmentInteraction1(valor_ahorrado);
                //mListener.putTextFragmento2(texto1);
            }
        });



        return v;
    }




    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(float valor) {
        if (mListener != null) {
            mListener.onFragmentInteraction1(valor);
            // mListener.putTextFragmento2(text);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /*public void escribirCajaTextoFrag1(String texto2){
        editText_frag1.setText(texto2);
    }*/
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction1(float valor);
        //void putTextFragmento2(String texto2);
    }
}
