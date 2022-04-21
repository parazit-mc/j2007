package hw3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String [] stringArray = {"1","2","3","4","5","6"};

//        task1(stringArray);
//        task2(stringArray);


        task3();


    }

    private static void task3() {
        System.out.println("task3");
        Float wagap1;
        Float wagap2;
        Float wagaj1;
        Pomarance p = new Pomarance();
        Jablko j = new Jablko();

        Box <Pomarance> boxp1= new Box<>();
        Box <Pomarance> boxp2= new Box<>();

        Box <Jablko> boxj = new Box<>();


        boxp1.add(new Pomarance());
        boxp1.add(new Pomarance());
        boxp1.add(new Pomarance());
        boxp1.add(new Pomarance());

        boxp2.add(new Pomarance());
        boxp2.add(new Pomarance());

        for (int i = 0; i < 7; i++) {
            boxj.add(new Jablko());
        }

        boxp1.getinfo();
        boxp2.getinfo();
        boxj.getinfo();

        System.out.println(wagap1= boxp1.getWeight());
        System.out.println(wagap1= boxp2.getWeight());
        System.out.println(wagap1= boxj.getWeight());

        System.out.println("comparing weights: boxp1 vs boxj " + boxp1.compare(boxj));
        System.out.println("comparing weights: boxp2 vs boxj " + boxp2.compare(boxj));

        boxp1.moveTo(boxp2);

        boxp1.getinfo();
        boxp2.getinfo();
        boxj.getinfo();
    }

    private static <T> List <T>  task2(T stringArray) {
        return Arrays.asList(stringArray);

    }

    private static void task1(String[] stringArray){

        System.out.println("source array " + Arrays.toString(stringArray));
        swapArrayElements(stringArray,2,5);
    }
    private static void swapArrayElements(String[] stringArray, int i, int i1) {
        String z = stringArray[i];
        String zz = stringArray[i1];
        stringArray[i] = zz;
        stringArray[i1] = z;
        System.out.println("swapped array " + Arrays.toString(stringArray));
    }

}
