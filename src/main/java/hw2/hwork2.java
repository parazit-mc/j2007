package hw2;

public class hwork2 {
    public static void main(String[] args) {
        System.out.println("checkSum is " + checkSum(-5,-10));
        System.out.println("isPositive is " + isPositive(0));
        System.out.println("isPositive2 is " + isPositive2(-3));
        printNTimes("simple_text", 3);
        int a = 1908;
        System.out.println("this year " + a + " is vysokosny: " + yr(a));
    }

    public static boolean checkSum (int a, int b){
      if (a+b>10&&a+b<20) return true;
      else return false;

    }

    public static String isPositive(int a){
        if (a>=0) return "this iz pozitive";
        else return "this iz negative";
    }

    public static boolean isPositive2(int a){
        boolean res = true;
       if (a>0) res= false;
       else if (a<0) res= true;
        return res;
    }
    public static void printNTimes(String txt, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(txt);
        }
    }

    public static boolean yr(int a){
        boolean isYr = true;
        if (a%4 ==0 && (a%400 ==0 || !(a%100==0))) isYr= true;
        else isYr=false;
        return isYr;
    }
}
