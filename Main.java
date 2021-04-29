package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int saturacia =sc.nextInt();
	if(saturacia==98){
        System.out.println("you are healthy");
    }
	else if(saturacia == 70){
        System.out.println("its normal");
    }
	else if(saturacia==50){
        System.out.println("not bad");
    }
	else if(saturacia==30){
        System.out.println( "its bad");
    }
	else{
        System.out.println("error");
    }
    }
}
