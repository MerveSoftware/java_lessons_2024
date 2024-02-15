package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Bu gün hava kac derece?");
        int havaSicakligi=scan.nextInt();
        if(havaSicakligi<=0){
            System.out.println("uludağda kayak yapabilirsin");
        } else if (havaSicakligi>0&&havaSicakligi<=20) {
            System.out.println("bu gün yürüyüş yapmak için cok güzel bir gün");
        }else if (havaSicakligi>20 &&havaSicakligi<30){
            System.out.println("piknik günü");
        }
        else {
            System.out.println("yüzmeye gidebirsin ");
        }
        scan.close();
    }
}