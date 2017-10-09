package com.iesvirgendelcarmen.dam.fragment02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class Fragment02 extends AppCompatActivity {
    private boolean cambio=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment02);


//////////////////MOSTRAR FRAGMENTO//////////////////////////////////////
        /*FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        Fragmento1 fragmento1=new Fragmento1();
        ft.add(R.id.contenedor,fragmento1);
        ft.commit();*/
///////////////////////////////////////////////////////////////////////
        final Fragmento1 fragmento1=new Fragmento1();
        final Fragmento2 fragmento2=new Fragmento2();
//////////////////CAMBIAR FRAGMENTO CON ROTACION DE MOVIL//////////////////
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        WindowManager wm=getWindowManager();
        Display dp=wm.getDefaultDisplay();

        if(dp.getRotation()== Surface.ROTATION_90){
            ft.replace(R.id.contenedor,fragmento1).commit();
        }else{
            ft.replace(R.id.contenedor,fragmento2).commit();
        }
/////////////////////////////////////////////////////////////////////////////
//////////////////////////// CAMBIAR FRAGMENTOS CON UN SOLO BOTON///////////////////
        //Button boton=(Button)findViewById(R.id.boton);
        /*boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                if(cambio){
                    ft.replace(R.id.contenedor,fragmento1);
                }else{
                    ft.replace(R.id.contenedor,fragmento2);
                }
                ft.addToBackStack(null);
                ft.commit();
                cambio=(cambio)?false:true;
            }
        });*/
//////////////////////////////////////////////////////////////////////////////////////////

    }
////////////////MOSTRAR FRAGMENTOS CON DOS BOTONES/////////////////////////////////////
    /*public void btnFrag1(View view){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        Fragmento1 fragmento1=new Fragmento1();
        ft.add(R.id.contenedor,fragmento1);
        ft.commit();
    }*/

    /*public void btnFrag2(View view){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        Fragmento2 fragmento2=new Fragmento2();
        ft.add(R.id.contenedor,fragmento2);
        ft.commit();
    }*/
///////////////////////////////////////////////////////////////////////////////////////////////
}
