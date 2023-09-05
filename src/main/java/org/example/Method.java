package org.example;

public class Method {
    public static boolean checkPredel(int a, int b){
        int sum = a + b;
        if(sum > 10 && sum <=20){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static void checkMinus(int a){
        if(a >=0){
            System.out.println("положительное");
        }else {
            System.out.println("отрицательное");
        }
    }
    public static boolean checkMinusBoolean(int a) {
        if(a >=0){
            System.out.println("false");
           return false;
        }else {
            System.out.println("true");
            return true;
        }
    }
    public static void vivodStroki(String line, int number){
        for(int i =0; i<number; i++){
            System.out.println(line);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void arrayZamena(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void zeroArray(){
        int[] array = new int[100];
        for(int i = 1; i<=100; i++){
            array[i-1] = i;
//            System.out.println(array[i -1]);
        }

    }
    public static void multiplyArray(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] = array[i] * 2;
            }
        }

    }
    public static void dioganalArray(){
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void createArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i< len; i++){
            array[i] = initialValue;
        }
    }
}
