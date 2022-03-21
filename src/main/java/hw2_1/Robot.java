package hw2_1;

public class Robot implements Sportsman {
    private final String name;


    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println("robot "+ this.name+ " прыгает");
    }

    @Override
    public void run() {
        System.out.println("robot "+ this.name+ " бегает");
    }
}
