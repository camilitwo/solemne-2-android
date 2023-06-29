package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.dto.IvaDto;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText monto, cuotas;
    Button calcular;
    TextView valor_IVA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se obtiene relación con los objetos EditText, botón Calcular
        monto= (EditText)findViewById(R.id.et_monto);
        calcular = (Button)findViewById(R.id.btn_calcular);

        // Se activa escucha y se crea evento OnClick
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se obtiene la info desde la interfaz
                String n1= monto.getText().toString();

                IvaDto ivaDto = new IvaDto();
                ivaDto.setMonto(Double.parseDouble(n1));
                // Se asigna el resultado, con formato de 2 decimales, en el campo texto de la TextView resultado
                valor_IVA.setText(ivaDto.calcularIva());
            }
        });
        // Se presenta resultado en la interfaz, con formato de 2 decimales, en la TextView resultado
        valor_IVA = (TextView)findViewById(R.id.tv_resultado);
    }
}