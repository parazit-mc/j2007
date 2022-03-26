package hw2_2;

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        System.out.println("Size not correct");
    }
   }

class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        System.out.println("Data provided not correct on line "+ (i+1) + " element " + (j+1));
    }

}

class Converter {
    public static int processData(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        System.out.println(count);
        return count;

    }

}

public class App {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        App app = new App();
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "Z", "3", "4"}

        };

        Converter.processData(correct);
        Converter.processData(incorrect2);

    }
}
