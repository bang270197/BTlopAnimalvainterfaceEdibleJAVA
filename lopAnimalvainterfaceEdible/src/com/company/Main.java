package com.company;

import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        //khoi tao mang Animal vs lenght=2;
        Animal[] animals = new Animal[2];
        //gan mang animals[0]=khoi tao doi tuong Tiger
        animals[0] = new Tiger();
        //gan mang animals[1]=khoi tao doi tuong Chicken
        animals[1] = new Chicken();
        //dung for-each duyet mang animals
        for (Animal animal : animals) {

            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
