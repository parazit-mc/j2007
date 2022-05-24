package hw3_7;

import hw3_7.Test.TestHandler;

public class App {
    public static void main(String[] args) {
//         Task1

        ClassHandler classForTesting = new ClassHandler();
        TestHandler.start(classForTesting.getClass());


//          Task2

        System.out.println();
        ClassHandler.outClassInfo(String.class);
    }
}
