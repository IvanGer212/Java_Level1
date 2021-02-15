package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

public class Cat extends Animal {
    private String name;

    public Cat() {
        super(200, 0);

    }

    @Override
    public void run (int distance_run){
        if (getRun_distance() >= distance_run) {
            System.out.printf("Кот %s пробежал %d метров. %n",
                    name,
                    distance_run
            );
        } else if (getRun_distance() < distance_run){
            System.out.printf("Кот %s не смог пробежать %d метров. ",
                    name,
                    distance_run);
            System.out.printf("Кот %s может пробежать только %d метров. %n",
                    name,
                    getRun_distance());
        }
    }

    @Override
    public void swim(int distance_swim){
        System.out.printf("Кот %s не умеет плавать. %n", name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
