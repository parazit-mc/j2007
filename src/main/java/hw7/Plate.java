package hw7;


public class Plate {
    private int food;
    public boolean full;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int extra){
        if (extra>0){
            food += extra;
            System.out.println("added "+ extra + " food");
        }
    }

    public boolean decreaseFood(int n) {
        if ((food - n) < 0) {
            System.out.println("not enough food to feed the animal. Refuel the plate)");
            full =  false;

        } else {
            food -= n;
            full = true;
        }
        return full;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
