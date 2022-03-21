package nw6;
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

public class Cat extends Animal {

    public Cat(int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;
    }

    public void canRun() {

        if (distRun > 200) {
            System.out.println("cat can't run more than 200 meters, it will die");
        } else {
            System.out.println("cat run " + distRun + " meters");
        }

    }


    public void canSwim() {
        if (distSwim > 0) {
            System.out.println("cat can't swim "+ distSwim +" meters, it will sink");
        } else if (distSwim == 0) {
            System.out.println("cat came to the edge of river and after that it stepped back. Cat decide not to swim today");
        }
    }

}
