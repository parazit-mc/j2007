package hw2_1;

public class Human implements Sportsman {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("human named" + this.name+" прыгает");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("human named" + this.name+ " бегает");

    }
}
