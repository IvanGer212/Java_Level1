package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

public class Dog extends Animal {
    private String name;

    public Dog() {
        super(500,10);
    //    this.name = name;

    }

    @Override
    public void run(int distance_run){
        System.out.printf("Собака %s пробежала %d метров %n",
                name,
                distance_run);

    }

    @Override
    public void swim(int distance_swim){
        System.out.printf("Собака %s проплыла %d метров %n",
                name,
                distance_swim);
    }

    public void setName(String name) {
        this.name = name;
    }
}
