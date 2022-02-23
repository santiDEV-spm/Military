package com.santidev.military;

import android.util.Log;

public class Soldier {

    //Variables de la clase
    private int health;

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        if(newHealth < 0){
            newHealth = 0;
        }
        if(newHealth >= 100){
            newHealth = 100;
        }
        this.health = newHealth;
    }

    String soldierType;
    String name;

    public Soldier(){
        this.health = 100;
    }

    public Soldier(String name, String soldierType, int health){
        this.name = name;
        this.soldierType = soldierType;
        this.health = health;
    }

    public Soldier(String name, String soldierType){
        this.name = name;
        this.soldierType = soldierType;
        this.health = 100;
    }


    //Metodos de la clase
    void shootEnemy(){
        Log.i(soldierType, "Esta disparando!");
    }

    /*public void healSoldier(Soldier soldierToBeHealed){
        if(soldierToBeHealed.getHealth() <= 0){
            return;
        }
        soldierToBeHealed.health += 20;
    }*/

    public void everybodyCanUseThisMethod(){

    }
    private void sendSecretMessage(){

    }
    void sendLessSecretMessage(){

    }
    protected void packageTask(){

    }

}
