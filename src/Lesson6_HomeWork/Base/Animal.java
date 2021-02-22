package Lesson6_HomeWork.Base;

public abstract class Animal {
    private int run_distance;
    private int swim_distance;
    private String name;

    public Animal (String name, int run_distance, int swim_distance){
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
