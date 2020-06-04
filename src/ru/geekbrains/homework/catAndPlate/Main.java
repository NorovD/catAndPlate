package ru.geekbrains.homework.catAndPlate;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat("Ivan", 13, false);
	Plate plate=new Plate(116);

	plate.info();
	cat.isSatiety(plate);
	cat.catInfo();
	cat.eat(plate);

	plate.info();


    }
}
