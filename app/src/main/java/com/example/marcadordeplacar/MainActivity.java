package com.example.marcadordeplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tempoDePartida;
    private TextView time1;
    private TextView time2;
    private Button inicarPartida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempoDePartida =    findViewById(R.id.tempoDePartida);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        inicarPartida=findViewById(R.id.btnIniciarPartida);

        inicarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MarcacaoDoJogo.class);
                startActivity(intent);
            }
        });



    }
}
