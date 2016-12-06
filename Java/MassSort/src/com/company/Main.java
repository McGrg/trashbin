package com.company;

import java.util.Scanner;

import com.company.Mass;

public class Main {

    public static void main(String[] args) {
        long time = 0;

        int arr1[] = new int[10000];//создание тестового массива
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = (int) (Math.random() * 10000);
        }
        int arr2[] = arr1.clone();// копирование второго массива для сравнения

        Mass mass = new Mass(arr1);
        time = System.currentTimeMillis();// засекание таймера
        mass.Simple();
        time = System.currentTimeMillis() - time;// отсечка времени
        System.out.println("Simple: " + time + " milliseconds");
        Mass mass2 = new Mass(arr2);
        time = System.currentTimeMillis();
        mass2.Quick(0, 9999);
        time = System.currentTimeMillis() - time;
        System.out.println("Quick: " + time + " milliseconds");
    }
}

