package hw2_5;
import java.util.Arrays;

public class ArrayOperations {
    private static final int size = 10000000;
    private static final int h = size / 2;
    float[] arr = new float[size];

    void arrayMethod1() {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("время работы метод 1 составляет " + (System.currentTimeMillis() - a) + " единиц времени");
    }

    void arrayMethod2() throws InterruptedException {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread = new Threaded("a1",a1);
        Thread thread2 = new Threaded("a2",a2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        a1 = ((Threaded) thread).getArr();
        a2 = ((Threaded) thread2).getArr();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);



        System.out.println("время работы метод 2 составляет " + (System.currentTimeMillis() - a) + " единиц времени");
    }


    class Threaded extends Thread {

        private float[] arr;

        Threaded(String name, float[] arr) {

            this.arr = arr;
        }

        float[] getArr() {
            return arr;
        }

        @Override
        public void run() {
            recalc();
        }

        private void recalc() {
            int len = arr.length;

            for (int i = 0; i < len; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }
}
