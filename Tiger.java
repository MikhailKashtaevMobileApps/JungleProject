package com.example.mike.jungle;

public class Tiger extends Animal {

    Tiger(String name) {
        super(name);
        this.animalType = "tiger";
    }

    @Override
    public void sleep(){
        this.setEnergy(this.getEnergy()+5);
    }

    @Override
    public void eatFood(String foodType) throws Exception {
        if (foodType.equals("grain")){
            throw new Exception("Tiger cannot eat grain!");
        }
        super.eatFood(foodType);
    }
}
