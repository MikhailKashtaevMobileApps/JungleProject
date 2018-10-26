package com.example.mike.jungle;

public class main {

    public static void main(String[] args) throws Exception {
        // Making animals
        Tiger tgr1 = new Tiger("Female Tiger");
        Tiger tgr2 = new Tiger("Male Tiger");

        Monkey mnk1 = new Monkey("monkey1");
        Monkey mkn2 = new Monkey("monkey2");

        Snake snk = new Snake("snake");

        // Making jungle
        Jungle jungle = new Jungle();

        jungle.addAnimal(tgr1);
        jungle.addAnimal(tgr2);
        jungle.addAnimal(mnk1);
        jungle.addAnimal(mkn2);
        jungle.addAnimal(snk);

        // Adding food to the jungle
        int i;
        for ( i=0; i<5; i++ ){
            jungle.addFood(new Fish());
        }
        for ( i=0; i<5; i++ ){
            jungle.addFood(new Meat());
        }

        // Checking initial state
        jungle.dump();

        // Making them eat
        tgr1.eatFood("meat");
        mnk1.eatFood("fish");

        // and make some sounds
        jungle.soundOff();

        // Check after meal
        jungle.dump();

        // Removing animal by name
        jungle.removeAnimalByName("Male Tiger");

        jungle.dump();
    }

}
