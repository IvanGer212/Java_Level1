package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

public class Dog extends Animal {
    private String name;

    public Dog() {
        super(500,10);
    }

    @Override
    public void run(int distance_run){
        if (getRun_distance() > distance_run) {
            System.out.printf("Собака %s пробежала %d метров. %n",
                    name,
                    distance_run
            );
        } else if (getRun_distance() < distance_run){
            System.out.printf("Собака %s не смогла пробежать %d метров. ",
                    name,
                    distance_run);
            System.out.printf("Собака %s может пробежать только %d метров %n",
                    name,
                    getRun_distance());
        }

    }

    @Override
    public void swim(int distance_swim){
        if (getSwim_distance() >= distance_swim){
        System.out.printf("Собака %s проплыла %d метров. %n",
                name,
                distance_swim);
        } else if (getRun_distance() < distance_swim){
            System.out.printf("Собака %s не смогла проплыть %d метров. ",
                    name,
                    distance_swim);
            System.out.printf("Собака %s может проплыть только %d метров. %n",
                    name,
                    getRun_distance());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
