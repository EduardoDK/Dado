package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    private ImageView imageViewDado1;
    private ImageView imageViewDado2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewDado1 = findViewById(R.id.imagem_dado1);
        imageViewDado2 = findViewById(R.id.imagem_dado2);


    }

    public void rolarDado(View v){

        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) +  1;

        if(dado1 == 1){
            imageViewDado1.setImageResource(R.drawable.dado1);



        }
        else if(dado2 == 1){
            imageViewDado2.setImageResource(R.drawable.dado1);

        }
        if(dado1 == 2){
            imageViewDado1.setImageResource(R.drawable.dado2);



        }
        else if(dado2 == 2){
            imageViewDado2.setImageResource(R.drawable.dado2);

        }
        if(dado1 == 3){
            imageViewDado1.setImageResource(R.drawable.dado3);



        }
        else if(dado2 == 3){
            imageViewDado2.setImageResource(R.drawable.dado3);

        }
        if(dado1 == 4){
            imageViewDado1.setImageResource(R.drawable.dado4);



        }
        else if(dado2 == 4){
            imageViewDado2.setImageResource(R.drawable.dado4);

        }
        if(dado1 == 5){
            imageViewDado1.setImageResource(R.drawable.dado5);



        }
        else if(dado2 == 5){
            imageViewDado2.setImageResource(R.drawable.dado5);

        }
        if(dado1 == 6){
            imageViewDado1.setImageResource(R.drawable.dado6);



        }
        else if(dado2 == 6){
            imageViewDado2.setImageResource(R.drawable.dado6);

        }



    }




}
