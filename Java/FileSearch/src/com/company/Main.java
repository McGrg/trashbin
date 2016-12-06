package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

int count=0;

        try (BufferedReader br = new BufferedReader(new FileReader(new File("F:\\maxim.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String words[]= line.split(" ");
                for (String i:words) {
                    i=i.trim().replace(",", "").replace(".", "").replace("-","").replace("!","").replace(";","").replace("%","");
                    if (i.equalsIgnoreCase(args[0]))
                        count++;
                }
            }
            System.out.println("Слово "+ args[0] +" содержится "+ count+ " раз.");
        } catch (Exception e) {

        }
    }
}
