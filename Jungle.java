package com.example.mike.jungle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Jungle {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Food> foods = new ArrayList<>();
    static int nameGen = 0;

    public void addAnimal(Animal animal) throws Exception {
        int others = 0;

        // Check if animal with a name already exists
        for ( Animal a: animals ){
            if (a.getAnimalType().equals(animal.getAnimalType())){
                others += 1;
            }
            if (a.getName().equals(animal.getName())){
                throw new Exception("Animal with that name already exists!");
            }
        }

        // Give animal information about jungle
        animal.isInJungle(this);
        animals.add(animal);

        for ( Animal a: animals ){
            if (a.getAnimalType().equals(animal.getAnimalType())){
                a.setOthers(others);
            }
        }
    }

    public void removeAnimalById(int id){
        animals.remove(id);
    }

    public void removeAnimalByName(String animalName) throws Exception {
        for( Animal a: animals ){
            if (a.getName().equals(animalName)){
                animals.remove(a);
                return;
            }
        }
        throw new Exception("Animal with such name does not exist!");
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    public ArrayList<Food> getFoods() { return foods; }

    public void addFood(Food f){
        foods.add(f);
    }

    public void removeFoodById(int id){
        foods.remove(id);
    }

    public void removeFoodByType(String foodType) throws Exception {
        for ( Food f:foods ){
            if (f.getFoodType().equals(foodType)){
                foods.remove(f);
                return;
            }
        }
        throw new Exception("There is no food of type "+foodType+" left");
    }

    public void soundOff() {
        for (Animal a : animals) {
            a.makeSound();
            System.out.println("#####################################");
            System.out.println("SOUNDS OFF INITIATED!!!");
            System.out.println("Animal-" + a.getName() + " energy levels are " + a.getEnergy());
            System.out.println("#####################################");
        }
    }

    public void dump(){
        System.out.println("##### INFORMATION ABOUT JUNGLE #####");
        System.out.println("Number of animals="+this.animals.size());
        for ( Animal a:this.animals ){
            a.dump();
        }
        System.out.println("Number of foods left="+this.foods.size());
        for ( Food f:this.foods ){
            f.dump();
        }
        System.out.println("####################################");
    }

}
