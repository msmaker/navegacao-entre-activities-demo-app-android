package com.msmaker.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        //metodo de clique sem a necessidade de um método a parte
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrir uma activity
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                //Passar dados
                intent.putExtra("nome","Marco");
                intent.putExtra("idade",30);

                startActivity(intent);

            }
        });
    }
}
