package hw5;

public class app {
    public static void main(String[] args) {
        Emp[] e = new Emp[5];

        for (int i = 0; i < e.length; i++) {
            e[i] = new Emp("Ivan Ivanov" + (i + 1), "post" + (i + 1), "email@" + (i + 1), "000000000" + (i + 1), (i + 1) * 1000, i * 10 + 10);
        }

        for (Emp emp : e) {
            emp.info();
        }
    }

}

