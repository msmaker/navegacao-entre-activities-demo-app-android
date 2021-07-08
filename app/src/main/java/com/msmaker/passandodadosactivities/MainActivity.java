package com.msmaker.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

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
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Instanciar o objeto
                Usuario usuario = new Usuario("Marco", "marco@gmail.com");

                //Passar dados
                intent.putExtra("nome", "Marco");
                intent.putExtra("idade", 30);
                intent.putExtra("objeto",usuario);

                startActivity(intent);

            }
        });
    }
}
