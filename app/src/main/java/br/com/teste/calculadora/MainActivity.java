package br.com.teste.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber1;
    private  EditText txtNumber2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(txtNumber1.getText().toString());
        int valor2 = Integer.parseInt(txtNumber2.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtNumber1.getText().toString());
        int valor2 = Integer.parseInt(txtNumber2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void  multiplicar(View view) {
        int valor1 = Integer.parseInt(txtNumber1.getText().toString());
        int valor2 = Integer.parseInt(txtNumber2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view) {
        float valor1 = Integer.parseInt(txtNumber1.getText().toString());
        float valor2 = Integer.parseInt(txtNumber2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 / valor2));
    }
}