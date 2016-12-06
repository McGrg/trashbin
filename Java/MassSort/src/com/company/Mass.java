package com.company;

/**
 * Created by MSI GT70 on 04.12.2016.
 */
public class Mass {
    private int[] mas;

    public Mass(int[] mas) {
        this.mas = mas;
    }

    int Last() {
        return mas.length - 1;
    }

    void Print() {
        for (int i = 0; i < 10; i++)
            System.out.println(mas[i]);
    }

    public void Quick(int first, int last) {
        int f = first;
        int l = last;
        int pivot = mas[(f + l) / 2]; //Опорный элемент - средний зл-т массива
        while (f <= l) {
            while (mas[f] < pivot)
                f++;
            while (mas[l] > pivot)
                l--;
            if (f <= l) {
                int temp = mas[f];
                mas[f] = mas[l];
                mas[l] = temp;
                f++;
                l--;
            }
            if (first < l) {
                Quick(first, l);
            }
            if (f < last) {
                Quick(f, last);
            }
        }
    }

    public void Simple() {
        for (int i = 0; i <mas.length-1; ++i) {
            for (int j = i+1; j < mas.length-1; j++) {
                if (mas[j] < mas[i]) {
                    int tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }
}
