package br.com.fiap.exercicios.drawerandfragments.rm75865;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            //Lógica para abrir a outra activity aqui
                Intent it = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(it);
                finish(); //Finalizamos essa activity para o usuário não voltar
            }
        }, 4000);
    }
}
