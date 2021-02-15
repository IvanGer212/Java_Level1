package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat(), new Cat(), new Dog()};
        animals[0].setName("Barsik");
        animals[1].setName("Bobik");
        animals[2].setName("Pushok");
        animals[3].setName("Snezhok");
        animals[4].setName("Barbos");

        animals[0].run(distanceForRun(animals[0],animals[0].getName()));
        animals[1].run(distanceForRun(animals[1],animals[1].getName()));
        animals[0].swim(distanceForSwim(animals[0],animals[0].getName()));
        animals[4].swim(distanceForSwim(animals[4],animals[4].getName()));
        animals[2].run(distanceForRun(animals[2],animals[2].getName()));

        countAnimals(animals);


    }

    public static void countAnimals (Animal[] animals){
        int[] count = new int[3];
        int countCats = 0, countDogs = 0, countAnimals = 0;
        for (int i = 0; i<animals.length; i++){
             if (animals[i] instanceof Cat){
                countCats++;
             } else if (animals[i] instanceof Dog){
                countDogs++;
            } else {
                countAnimals++;
            }
        }
        System.out.printf("Создано %d кошек, %d собак, %d других животных", countCats, countDogs, countAnimals);
    }

    public static int distanceForRun (Animal animal, String name ){
        Scanner scanner = new Scanner(System.in);
        String typeAnimal;
        if (animal instanceof Cat){
            typeAnimal = "кот";
        }
        else if (animal instanceof Dog){
            typeAnimal = "пёс";
        } else typeAnimal = "животное";
        System.out.printf("Сколько должен пробежать %s %s %n", typeAnimal, name);
        return scanner.nextInt();
    }

    public static int distanceForSwim (Animal animal, String name ){
        Scanner scanner = new Scanner(System.in);
        String typeAnimal;
        if (animal instanceof Cat){
            typeAnimal = "кот";
        }
        else if (animal instanceof Dog){
            typeAnimal = "пёс";
        } else typeAnimal = "животное";
        System.out.printf("Сколько должен проплыть %s %s %n", typeAnimal, name);
        return scanner.nextInt();
    }
}
