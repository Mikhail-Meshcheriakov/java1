package lesson6.homework;

public class Cat extends Animal {

    public Cat() {
        super(200, 0, 2);
    }

    public Cat(int limitRun, int limitSail, double limitJump) {
    }

    @Override
    public void sail(double distance) {
        System.out.println(this.getClass().getSimpleName() + ".sail(" + distance + ") -> Кошки не умеют плавать!");
    }
}
