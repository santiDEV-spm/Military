package com.santidev.military;

class Hospital {

    protected  void healSoldier(Soldier soldierToBeHealed){
        int health = soldierToBeHealed.getHealth();
        if(soldierToBeHealed.getHealth() > 0) {
            health += 20;
            soldierToBeHealed.setHealth(health);
        }
    }
}
