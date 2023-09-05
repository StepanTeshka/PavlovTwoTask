package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Method me = new Method();
        me.checkPredel(10,10);
        me.checkMinus(10);
        me.vivodStroki("Гей", 5);
        int year = 400;
        boolean isLeap = me.isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        me.dioganalArray();
    }
}