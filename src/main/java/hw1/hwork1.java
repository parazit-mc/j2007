package hw1;

public class hwork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();;
    }


    public static void printThreeWords(){
        System.out.println("orange");
        System.out.println("bonana");
        System.out.println("opple");
        System.out.println("----------------------");

    }

    public static void checkSumSign(){
        int a = 5;
        int b = 3;

        if(a+b>=0) System.out.println("sum is positive");
        else System.out.println("sum is negative");
        System.out.println("----------------------");

    }

    public static void printColor() {
        int value = 130;
        if (value<=0) System.out.println("red");
        else if (value >0 && value<=100) System.out.println("yellow");
        else System.out.println("green");
        System.out.println("----------------------");
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        if (a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
        System.out.println("----------------------");
    }
}
