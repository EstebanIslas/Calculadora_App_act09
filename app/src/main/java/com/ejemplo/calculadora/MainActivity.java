package com.ejemplo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etxt_num1;
    EditText etxt_num2;
    EditText etxt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt_num1 = (EditText)findViewById(R.id.etxt_numero1);
        etxt_num2 = (EditText)findViewById(R.id.etxt_numero2);
        etxt_resultado = (EditText)findViewById(R.id.etxt_result);
    }

    public void sumarOnClick(View view){
        try{
            double numero1 = Double.parseDouble(etxt_num1.getText().toString());
            double numero2 = Double.parseDouble(etxt_num2.getText().toString());

            double resultado = numero1 + numero2;

            etxt_resultado.setText(String.valueOf(resultado));
        }catch (Exception ex){
            Log.e("Advertencia!", "Accion no valida!!", ex);
        }

    }

    public void restarOnClick(View view){
        try {
            double numero1 = Double.parseDouble(etxt_num1.getText().toString());
            double numero2 = Double.parseDouble(etxt_num2.getText().toString());

            double resultado = numero1 - numero2;

            etxt_resultado.setText(String.valueOf(resultado));
        }catch (Exception ex){
            Log.e("Advertencia!", "Accion no valida!!", ex);
        }
    }

    public void multiplicarOnClick(View view){
        try{
            double numero1 = Double.parseDouble(etxt_num1.getText().toString());
            double numero2 = Double.parseDouble(etxt_num2.getText().toString());

            double resultado = numero1 * numero2;

            etxt_resultado.setText(String.valueOf(resultado));
        }catch (Exception ex){
            Log.e("Advertencia!", "Accion no valida!!", ex);
        }
    }

    public void dividirOnClick(View view){
        try {

            double numero1 = Double.parseDouble(etxt_num1.getText().toString());
            double numero2 = Double.parseDouble(etxt_num2.getText().toString());

            double resultado = numero1 / numero2;

            etxt_resultado.setText(String.valueOf(resultado));

        }catch (Exception ex){
            Log.e("Advertencia!", "Accion no valida!!", ex);
        }
    }

    public void moduloOnClick(View view){
        try {

            double numero1 = Double.parseDouble(etxt_num1.getText().toString());
            double numero2 = Double.parseDouble(etxt_num2.getText().toString());

            double resultado = numero1 % numero2;

            etxt_resultado.setText(String.valueOf(resultado));

        }catch (Exception ex){
            Log.e("Advertencia!", "Accion no valida!!", ex);
        }
    }
}
