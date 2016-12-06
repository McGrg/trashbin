package com.company;

public class Main {


    public static void main(String[] args) {
        Vector vector1 = new Vector();
        vector1.setX(3);
        vector1.setY(5);
        vector1.setZ(8);
        Vector vector2 = new Vector();
        vector2.setX(1);
        vector2.setY(2);
        vector2.setZ(3);

        Vector vector5;
        vector5 = new Vector(4, 5, 6);
        vector5.print();
        Vector vector6 = new Vector(vector5);
        vector6.print();

        Vector vector4 = new Vector();

        vector4.multiply(vector1, vector2);
        vector4.print();

        Mymonthes month = new Mymonthes();
        System.out.println(month.monthName(5));
        String str;
        str="fdgsdfgsdg";
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

}
