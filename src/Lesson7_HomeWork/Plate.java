package Lesson7_HomeWork;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void info (){
        System.out.println("Plate: " + food);
    }
    public boolean decreaseFood(int n){
        if (food>=n){
            food-=n;
            return true;
        } else {
            System.out.println("В тарелке не достаточно еды");
            return false;
        }
    }
    public void addFood (int food){
        this.food = food;
    }

}
