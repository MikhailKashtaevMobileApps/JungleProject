package com.example.mike.jungle;

public class Food {
    protected String foodType;

    public String getFoodType() {
        return foodType;
    }

    public void dump(){
        System.out.println("Food "+this.foodType);
    }
}
