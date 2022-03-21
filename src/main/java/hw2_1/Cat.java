package hw2_1;

public class Cat implements Sportsman {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println("cat " + this.name + " прыгает");
    }

    @Override
    public void run() {
        System.out.println("cat " + this.name + " бегает");
    }
}
