package com.ruthlink.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText peso,altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = (EditText)findViewById(R.id.txtPeso);
        altura = (EditText)findViewById(R.id.txtAltura);
    }

    public void Calcular (View v){


        int Resultado, pesot, alturat;
        pesot = Integer.parseInt((peso.getText().toString()));
        alturat = Integer.parseInt((altura.getText().toString()));
        Resultado = pesot + alturat;

        Toast.makeText(this, String.valueOf(Resultado), Toast.LENGTH_SHORT).show();
    }
}