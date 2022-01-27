package hw7;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(15);
        plate.info();

        Cat c[] = {new Cat("yashka",5),new Cat("vaska",10),new Cat("kotik",10)};

        for (Cat cats: c ) {
            cats.eat(plate);
            cats.catInfoFull();

        }
        plate.addFood(10);


        plate.info();

    }

}
