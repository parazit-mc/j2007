package hw7;


public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        if (p.full) {
            this.full = true;
        }
    }

    public void catInfoFull(){
        if (full){
            System.out.println("котик "+ name +" успешно покушал " + appetite + " единиц еды");
        }
        else{
            System.out.println("котик "+ name +" не покушал, потому что не хватило еды");
        }
    }

}
