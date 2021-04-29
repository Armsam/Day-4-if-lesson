package com.company;

import java.util.Scanner;

public class Cycrle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please select 1 to perimete ...... 2 to area ");
        double a = sc.nextInt();
        double radius = 4, parimeter = 0, area = 0;


        if (a == 1) {
            parimeter = 2 * Math.PI * radius;
            System.out.println(parimeter);
        } else if (a == 2) {
            area = 2 * Math.PI * Math.pow(radius, 2);
            System.out.println(area);
        }
        else{
            System.out.println("wrong number pleases selecet again");
        }
    }


}
