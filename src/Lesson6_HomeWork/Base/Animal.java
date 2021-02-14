package Lesson6_HomeWork.Base;

public abstract class Animal {
    private int run_distance;
    private int swim_distance;

    public Animal (int run_distance, int swim_distance){
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public int getRun_distance() {
        return run_distance;
    }

    public int getSwim_distance() {
        return swim_distance;
    }
}
