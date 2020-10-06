package com.example.marcadordeplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MarcacaoDoJogo extends AppCompatActivity {

    private TextView cronometro;
    private TextView time1;
    private TextView numeroDeGols1;
    private Button   addGols1;
    private TextView qtsFaltas1;
    private Button   addFaltas1;
    private TextView qtsCartaoAmarelo1;
    private Button   addCartaoAmarelo1;
    private TextView qtsCartaoVermelho1;
    private Button   addCartaoVermelho1;
    private TextView time2;
    private TextView numeroDeGols2;
    private  Button  addGols2;
    private TextView qtsFaltas2;
    private Button   addFaltas2;
    private TextView qtsCartaoAmarelo2;
    private Button   addCartaoAmarelo2;
    private TextView qtsCartaoVermelho2;
    private Button   addCartaoVermelho2;
    private Button   finalizarPartida;
    private Button   criarNovaPartida;
    private Button   reiniciarPartida;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcacao_do_jogo);

        numeroDeGols1=findViewById(R.id.numeroDeGols1);
        addGols1=findViewById(R.id.addGols1);
        qtsFaltas1=findViewById(R.id.qtsFaltas1);
        addFaltas1=findViewById(R.id.addFaltas1);
        qtsCartaoAmarelo1=findViewById(R.id.qtsCartaoAmarelo1);
        addCartaoAmarelo1=findViewById(R.id.addcartaoAmarelo1);
        qtsCartaoVermelho1=findViewById(R.id.qtsCartaoVermelho1);
        addCartaoVermelho1=findViewById(R.id.addCartaoVermelho1);

        numeroDeGols2=findViewById(R.id.numeroDeGols2);
        addGols2=findViewById(R.id.addGols2);
        qtsFaltas2=findViewById(R.id.qtsFaltas2);
        addFaltas2=findViewById(R.id.addFaltas2);
        qtsCartaoAmarelo2=findViewById(R.id.qtsCartaoAmarelo1);
        addCartaoAmarelo2=findViewById(R.id.addcartaoAmarelo1);
        qtsCartaoVermelho2=findViewById(R.id.qtsCartaoVermelho2);
        addCartaoVermelho2=findViewById(R.id.addCartaoVermelho2);

        cronometro=findViewById(R.id.cronometro);
        reiniciarPartida=findViewById(R.id.btnReiniciarPartida);
        finalizarPartida=findViewById(R.id.btnFinalizarPartida);
        criarNovaPartida=findViewById(R.id.btnCriarNovaPartida);

        criarNovaPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarcacaoDoJogo.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
