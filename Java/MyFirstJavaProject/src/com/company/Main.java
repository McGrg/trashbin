package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
//        System.out.println("Could you input numbers");
//        for (int i = 0; i < 10; i++) {
//            arr[i] = in.nextInt();
//        }
//        for(int i= arr.length-1; i>0; i--)
//        {
//            for(int j=0;j<i; j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int tmp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=tmp;
//                }
//            }
//        }
//        for (int i:arr)
//        {
//            System.out.print(arr[i]);
//        }
        int[][] arr2 = new int[1000][1000];
        for (int[] i : arr2) {
            for (int j = 0; j < i.length - 1; j++) {
                i[j] = (int)(Math.random());
            }
        }
        double check;
        mass: for (int[] i : arr2) {
            for (int j = 0; j < i.length - 1; j++) {
                if (i[j] == 0) {
                    System.out.println("There is zero ;");
                    break mass;
                }
            }
        }
    }
}
