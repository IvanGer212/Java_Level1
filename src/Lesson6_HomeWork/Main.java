package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cat(), new Cat(), new Dog()};

        setName(animals);
        animals[0].run(distanceForRun(animals[0]));
        animals[1].run(distanceForRun(animals[1]));
        animals[0].swim(distanceForSwim(animals[0]));
        animals[4].swim(distanceForSwim(animals[4]));
        animals[2].run(distanceForRun(animals[2]));
        countAnimals(animals);


    }
    public static void setName (Animal[] animals) {
        Scanner scanner = new Scanner(System.in);
        int countCats = 0, countDogs = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                countCats++;
                System.out.printf("Введите имя кота № %d %n",countCats);
                animal.setName(scanner.nextLine());
            }
            else if (animal instanceof Dog) {
                countDogs++;
                System.out.printf("Введите имя собаки № %d %n",countDogs);
                animal.setName(scanner.nextLine());
            }
        }
    }

    public static void countAnimals (Animal[] animals){
        int countCats = 0, countDogs = 0, countAnimals = 0;
        for (Animal animal :animals){
             if (animal instanceof Cat){
                countCats++;
             } else if (animal instanceof Dog){
                countDogs++;
            } else {
                countAnimals++;
            }
        }
        System.out.printf("Создано %d кошек, %d собак, %d других животных", countCats, countDogs, countAnimals);
    }

    public static int distanceForRun (Animal animal){
        Scanner scanner = new Scanner(System.in);
        String typeAnimal;
        if (animal instanceof Cat){
            typeAnimal = "кот";
        }
        else if (animal instanceof Dog){
            typeAnimal = "пёс";
        } else typeAnimal = "животное";
        System.out.printf("Сколько должен пробежать %s %s %n", typeAnimal, animal.getName());
        return scanner.nextInt();
    }

    public static int distanceForSwim (Animal animal){
        Scanner scanner = new Scanner(System.in);
        String typeAnimal;
        if (animal instanceof Cat){
            typeAnimal = "кот";
        }
        else if (animal instanceof Dog){
            typeAnimal = "пёс";
        } else typeAnimal = "животное";
        System.out.printf("Сколько должен проплыть %s %s %n", typeAnimal, animal.getName());
        return scanner.nextInt();
    }
}
