package lesson6.homework.animals;

import java.util.Random;

public class Cat extends Animal {

    private Random rnd = new Random();
    private static String defaultName = "cat";
    private static int increment = 0;

    @Override
    public String toString() {
        return defaultName;
    }

    public Cat() {
        increment++;
        defaultName += increment;
        swimLimit = 0;
        runLimit = 100 + rnd.nextInt(200);
        jumpLimit = 1 + rnd.nextInt(3);
    }

    @Override
    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(this + " run " + length + " m.");
        } else {
            System.out.println(this + " cannot run so long");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(this + " are not able to swim");
    }

    @Override
    public void jump(int height) {
        if (height <= jumpLimit) {
            System.out.println(this + " jump to " + height + " m.");
        } else {
            System.out.println(this + " cannot jump so high");
        }
    }
}
