package Lesson6_HomeWork;

import Lesson6_HomeWork.Base.Animal;

public class Cat extends Animal {

    public Cat() {
        super("Cat", 200, 0);

    }

    @Override
    public void run (int distance_run){
        if (getRun_distance() >= distance_run) {
            System.out.printf("Кот %s пробежал %d метров. %n",
                    super.getName(),
                    distance_run
            );
        } else if (getRun_distance() < distance_run){
            System.out.printf("Кот %s не смог пробежать %d метров. ",
                    super.getName(),
                    distance_run);
            System.out.printf("Кот %s может пробежать только %d метров. %n",
                    super.getName(),
                    getRun_distance());
        }
    }

    @Override
    public void swim(int distance_swim){
        System.out.printf("Кот %s не умеет плавать. %n", super.getName());
    }

}
