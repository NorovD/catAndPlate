package ru.geekbrains.homework.catAndPlate;

public class Plate {
    private int food;

    public Plate(int food){
        this.food=food;

    }

    public void decreaseFood(int animalAppetite){

        if(food<animalAppetite){
            System.out.println("food's not enough");
        }
        else {
            food = food - animalAppetite;
        }
    }
    public void getSatiety(Cat satiety){


    }

    public void info(){
        System.out.println("Еды осталось: "+ food);
    }


}
