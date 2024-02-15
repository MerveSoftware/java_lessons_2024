package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen üç sayi girin ");
        int sayi1=scan.nextInt();
        int sayi2,sayi3;
        sayi2=scan.nextInt();
        sayi3=scan.nextInt();

        int enkucuk ,ortanca ,enbuyuk;
        if(sayi1<= sayi2&&sayi1 <=sayi3){
            enkucuk=sayi1;
            ortanca=(sayi2<=sayi3)?sayi2:sayi3;
            enbuyuk=(sayi2>sayi3)?sayi2:sayi3;
        } else if (sayi2<=sayi1&&sayi2<=sayi3) {
            enkucuk =sayi2;
            ortanca=(sayi3<=sayi3)?sayi1:sayi3;
            enbuyuk=(sayi1>sayi3)?sayi1:sayi3;

        }else {
            enkucuk=sayi3;
            ortanca=(sayi1 <=sayi2)?sayi1:sayi2;
            enbuyuk=(sayi1>sayi2)?sayi1:sayi2;
        }
        System.out.print("Girilen sayılar kücükten büyüğe : ");
        System.out.println(enkucuk+" ,"+ortanca+" ,"+enbuyuk);
        //System.out.println(" ksksksk ${ortanca} ., ülk");
        scan.close();
    }
}







