package Lesson7_HomeWork;

public class Main {
    public static void main(String[] args) {
    Cat[] cats = {new Cat("Mursik", 30), new Cat("Pushok", 20), new Cat("Barsik",35), new Cat("Rizhik",30)};

    Plate plate = new Plate(100);
    plate.info();

    for (Cat cat:cats){
        cat.eat(plate);
        plate.info();
        System.out.println("Сытость:" + cat.checkFullness());
        System.out.println();
        //System.out.println(cat.toString());
    }
    System.out.println();
    plate.addFood(150);
    plate.info();
    System.out.println();

        for (Cat cat:cats){
            cat.eat(plate);
            plate.info();
            System.out.println("Сытость:" + cat.checkFullness());
            System.out.println();
            //System.out.println(cat.toString());
        }

    }

}
