package com.santidev.military;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soldier mySoldier = new Soldier();
        mySoldier.setHealth(100);
        mySoldier.soldierType = "sniper";

        //Aqui tenemos un objeto llamado mySoldier
        //Es un objeto de la clase Soldier, La vida del soldado tiene 100 y es un francotirador

        mySoldier.shootEnemy();

        Soldier mySoldier2 = new Soldier();
        mySoldier2.setHealth(150);
        mySoldier2.soldierType = "special forces";
        mySoldier.shootEnemy();

        //soldado rambo que es muy dificil de matar
        Soldier rambo = new Soldier();
        rambo.setHealth(200);
        rambo.soldierType = "Green Beret";


        Soldier wellington = new Soldier();
        wellington.setHealth(80);
        wellington.soldierType = "sailor";

        Log.i("RAMBO", "La vida de rambo es de:" + rambo.getHealth());
        Log.i("WELLINGTON", "La vida de Wellington" + wellington.getHealth());

        rambo.shootEnemy();
        wellington.shootEnemy();

        rambo.setHealth(rambo.getHealth() - 150);
        Log.i("RAMBO", "La vida de rambo es de:" + rambo.getHealth());

       /* Soldier medic = new Soldier();
        medic.setHealth(10);
        medic.soldierType = "Field Medical Soldier";
        medic.healSoldier(rambo);*/

        Hospital hospital = new Hospital();
        hospital.healSoldier(rambo);

        Log.i("RAMBO", "La vida de rambo es de:" + rambo.getHealth());

        Soldier jb = new Soldier("jb", "Captain");
        Log.i("JB", "La vida de JB es de:" + jb.getHealth());
    }
}