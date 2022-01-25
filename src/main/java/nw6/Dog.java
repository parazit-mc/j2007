package nw6;
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
// собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

public class Dog extends Animal {


    public Dog(int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;
    }


    public void canRun() {

        if (distRun > 500) {
            System.out.println("You asked dog to run "+ distRun +  " meters. Dog can't run more than 500 meters, it will die");
        } else {
            System.out.println("You asked dog to run " + distRun + "meters. Dog run " + distRun + " meters");
        }

    }


    public void canSwim() {
        if (distSwim > 10) {
            System.out.println("dog can't swim more than 10 meters, it will sink");
        } else {
            System.out.println("dog swimmed " + distSwim + " meters");
        }
    }
}
