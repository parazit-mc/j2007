package hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hwork4 {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final Scanner SC = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Enter coordinates X & Y ");
            x = SC.nextInt()-1;
            y = SC.nextInt()-1;
        } while(!isCellValid(x,y));
        map[y][x] = DOT_X;
    }
    public static void aiTurn(){
        int x = 0, y=0;

        do {
           x = rand.nextInt(SIZE);
           y = rand.nextInt(SIZE);
        } while(!isCellValid(x,y));
        System.out.println("AI makes turn " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x>=SIZE || y < 0 || y>=SIZE){
            return false;
        }
        if(map[y][x]!=DOT_EMPTY){
            return false;
        }
        return true;
    }
    public static boolean checkVertical(int i, char symbol){
            if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol){
                return true;
            }
        return false;
    }
    public static boolean checkHorizont(int i, char symbol){
        if (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol){
            return true;
        }
        return false;
    }

    public static boolean checkDiag(char symbol){
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol || map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol){
            return true;
        }
        return false;
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < map.length; i++) {
            if (checkVertical(i,symbol)){
                return true;
            }
            if (checkHorizont(i,symbol)){
                return true;
            }

        }
        if (checkDiag(symbol)){
            return true;
        }
        return false;
    }


    public static boolean isMapFull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j]==DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        initMap();
        printMap();
        while(true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Liu Kang wins! Flawless victory. Fatality");
                break;
            }
            if (isMapFull()){
                System.out.println("Nobody wins");
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_0)){
                System.out.println("Sektor wins! Earth Kingdom is gonna die!");
                break;
            }
            if (isMapFull()){
                System.out.println("Nobody wins");
            }
        }
        System.out.println("gameOver!");
    }
}

