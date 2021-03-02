package Lesson7_HomeWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name,int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p){
        if (!fullness){
        fullness = p.decreaseFood(appetite);
        if (fullness){
            System.out.printf("Кот %s поел %n", name);
        } else {
            System.out.printf("Кот %s не смог поесть %n", name);
        }
        }
        else {
            System.out.printf("Кот %s сытый %n",name);
        }
        return fullness;

    }
    public boolean checkFullness(){
        return fullness;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
}
