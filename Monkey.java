package com.example.mike.jungle;

public class Monkey extends Animal{

    Monkey(String name) {
        super(name);
        this.animalType = "monkey";
    }

    @Override
    public void eatFood(String foodType) throws Exception {
        super.eatFood(foodType);
        setEnergy(getEnergy()-3);
    }

    @Override
    public void makeSound() {
        setEnergy(getEnergy()-4);
    }

    public void play(){
        if ( getEnergy() >= 8 ){
            System.out.println("Monkey "+getName()+" plays and yells Oooo Oooo Oooo");
            setEnergy(getEnergy()-8);
        }else{
            System.out.println("Monkey "+getName()+" is too tired");
        }
    }
}
