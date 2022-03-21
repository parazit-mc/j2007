package hw5;

public class sol {

    public static void main(String[] args) {

        camelCase("camelCasingTesting");

    }

    @org.jetbrains.annotations.Nullable
    public static String camelCase(String input) {
        int countr = 0;
        char[] array = input.toCharArray();
        for(char x : array){
            if(Character.isUpperCase(x)){
                countr++;
            }
        }
        if (countr==0){ // noCamelCase
            return input;
        }

        System.out.println(countr);
        return null;
    }


}