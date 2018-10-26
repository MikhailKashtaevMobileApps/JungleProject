package com.example.mike.jungle;

import java.util.ArrayList;
import java.util.Random;

public abstract class Animal {

    private String name;
    private Integer energy = 30; //Initial energy 30
    protected String animalType;
    private Integer others;
    private Jungle jungle;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void setOthers(Integer others){
        this.others = others;
    }

    public Integer getOthers(){
        return others;
    }

    public String getAnimalType(){
        return animalType;
    }

    public void makeSound(){
        energy -= 3;
    }

    public void eatRandomFood() throws Exception {
        int numFoods = this.jungle.getFoods().size();
        if ( numFoods == 0 ){
            throw new Exception("No food left");
        }
        eatFood(this.jungle.getFoods().get( new Random().nextInt(numFoods) ).getFoodType());
    }

    public void eatFood(String foodType) throws Exception {
        if ( this.jungle == null ){
            throw new Exception("The animal is not in jungle yet");
        }
        this.jungle.removeFoodByType(foodType);
        energy += 5;
    }

    public void sleep(){
        energy += 10;
    }

    public void isInJungle(Jungle jungle){
        this.jungle = jungle;
    }

    public void dump(){
        System.out.println("Animal name="+this.name+", Animal Type="+this.animalType+", Energy="+this.energy+", Thinks there are "+others+" others");
    }

}
