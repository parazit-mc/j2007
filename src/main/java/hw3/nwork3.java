package hw3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;
import static java.util.Collections.*;

/* javadoc
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
int длиной len, каждая ячейка которого равна initialValue;
6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
в котором сумма левой и правой части массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 */
public class nwork3 {
    public static void main(String[] args) {
        int len = 5; int initialValue = 7;
        int[] arr1 = new int[]{1, 0, 1, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[100];
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int[][]arr4 = new int[5][5];
        int[]arr6 = new int[]{5,3,1,17,7,21};
        //        task1(arr1);
//        task2(arr2);
 //       task3(arr3);
//        task4(arr4);
//        task5(len,initialValue);
//        task6(arr6);
    }

    public static void task1(int[]arr1){
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i]==1){ arr1[i]=0;         }
        else if (arr1[i]==0) { arr1[i]=1;         }
        }
    System.out.println("task1 result \n"+    Arrays.toString(arr1));
    }
    public static void task2(int[]arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i+1;
        }
        System.out.println("task2 result \n"+Arrays.toString(arr2));
    }
    public static void task3(int[]arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6) {   arr3[i]=arr3[i]*2;   }
            }
        System.out.println("task3 result \n" + Arrays.toString(arr3));
        }
    public static void task4(int[][]arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i==j || j==arr4.length-i-1){ arr4[i][j]=1;    }
                else { arr4[i][j]=0;    }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[] task5(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void task6(int[]arr6) {

        int min = arr6[0];
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i]<min) {min=arr6[i];  }
            if (arr6[i]>max) {max = arr6[i];   }
            }
        System.out.println("task6, min is " + min);
        System.out.println("task6, max is " + max);
        }


    }



