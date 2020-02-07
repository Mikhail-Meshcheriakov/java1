package lesson7.homework;

import java.util.ArrayList;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void infoSatiety() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            System.out.println("Кот " + name + " голоден.");
        }
    }

}

class MainClass {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 5));
        cats.add(new Cat("Vaska", 7));
        cats.add(new Cat("Timofei", 4));
        cats.add(new Cat("Leopold", 3));
        cats.add(new Cat("Black", 5));
        Plate plate = new Plate(20);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.infoSatiety();
        }
        plate.info();
    }
}

