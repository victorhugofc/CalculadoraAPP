package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private Button mais;
    private Button menos;
    private Button mult;
    private TextView operacao;
    private Button limp;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        mais = (Button) findViewById(R.id.mais);
        menos = (Button) findViewById(R.id.menos);
        mult = (Button) findViewById(R.id.mult);
        operacao = (TextView) findViewById(R.id.operacao);
        result = (TextView) findViewById(R.id.result);
        limp  = (Button) findViewById(R.id.limp);

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                Double v1 = Double.parseDouble(valor1.getText().toString());
                Double v2 = Double.parseDouble(valor2.getText().toString());
                Double resultado = (v1+v2);
                result.setText(""+resultado);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Houve um Problema ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double v1 = Double.parseDouble(valor1.getText().toString());
                    Double v2 = Double.parseDouble(valor2.getText().toString());
                    Double resultado = (v1-v2);
                    result.setText(""+resultado);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Houve um Problema ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double v1 = Double.parseDouble(valor1.getText().toString());
                    Double v2 = Double.parseDouble(valor2.getText().toString());
                    Double resultado = (v1*v2);
                    result.setText(""+resultado);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Houve um Problema ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        limp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    valor1.setText("");
                    valor2.setText("");
                    result.setText("");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Houve um Problema ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
