package hw2_5;


public class App {
    public static void main(String[] args) {
        ArrayOperations ao = new ArrayOperations();

       ao.arrayMethod1();
        try {
            ao.arrayMethod2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
