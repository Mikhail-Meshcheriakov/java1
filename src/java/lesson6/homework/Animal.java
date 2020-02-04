package lesson6.homework;

public class Animal {

    private double limitRun;
    private double limitSail;
    private double limitJump;

    public Animal() {
        this.limitRun = 300;
        this.limitSail = 100;
        this.limitJump = 1;
    }

    public Animal(double limitRun, double limitSail, double limitJump) {
        this.limitRun = limitRun;
        this.limitSail = limitSail;
        this.limitJump = limitJump;
    }

    public void run(double distance) {
        if (distance >= 0 && distance <= limitRun) {
            System.out.println(this.getClass().getSimpleName() + ".run(" + distance + ") -> true");
        } else if (distance > limitRun) {
            System.out.println(this.getClass().getSimpleName() + ".run(" + distance + ") -> false. Максимальная дистанция: " + limitRun);
        } else {
            System.out.println(this.getClass().getSimpleName() + ".run(" + distance + ") -> false. Дистанция не может быть отрицательной");
        }
    }


    public void jump(double height) {
        if (height >= 0 && height <= limitJump) {
            System.out.println(this.getClass().getSimpleName() + ".jump(" + height + ") -> true");
        } else if (height > limitJump) {
            System.out.println(this.getClass().getSimpleName() + ".jump(" + height + ") -> false. Максимальная высота: " + limitJump);
        } else {
            System.out.println(this.getClass().getSimpleName() + ".jump(" + height + ") -> false. Высота не может быть отрицательной");
        }
    }

    public void sail(double distance) {
        if (distance >= 0 && distance <= limitSail) {
            System.out.println(this.getClass().getSimpleName() + ".sail(" + distance + ") -> true");
        } else if (distance > limitSail) {
            System.out.println(this.getClass().getSimpleName() + ".sail(" + distance + ") -> false. Максимальная дистанция: " + limitSail);
        } else {
            System.out.println(this.getClass().getSimpleName() + ".sail(" + distance + ") -> false. Дистанция не может быть отрицательной");
        }
    }
}
