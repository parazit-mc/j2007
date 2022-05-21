package hw3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Owoce> {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

//    public Box(T... obj) {
//        list = Arrays.asList(obj);
//    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveTo(Box<T> box) {

        box.getList().addAll(list);
        list.clear();
    }

    void getinfo() {
        if (list.isEmpty()) {
            System.out.println("box empty");
        } else {
            System.out.println("box contains " + list.get(0).toString() + " amount: " + list.size());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Owoce> box) {
        return this.getWeight() == box.getWeight();
    }

}
