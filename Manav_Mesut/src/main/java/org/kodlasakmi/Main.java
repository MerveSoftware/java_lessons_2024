package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    //class
    public static void main(String[] args) {
        //main matodu
        Scanner manav = new Scanner(System.in);
        System.out.println("merhaba mesut manava hosgeldınız almak ıstedıgınız urunun kodunu girin :?+\n \t" +
                "urun kodu : 1- domates 3.75 TL \n" +
                "urun kodu:2-limon 4.24 TL \n" +
                "urun kodu: 3- elma 7.02 TL\n" +
                "urun kodu : 4 - biber 12.46 TL\n" +
                "urun kodu : 5- muz 8.99 TL\n" +
                "urun kodu: 6 armıt 29.76 TL \n" +
                "urun kodu:7 -Ayşe kadin fasulye 7.30");
        int secim = manav.nextInt();
        System.out.println("sectiginiz urunden kac kg almak istiyorsunuz ?");
        double kg = manav.nextDouble();
        double fiyat = 0.0;
        fiyat =
                (secim==1)?(3.75*kg):
                (secim==2) ?(4.24*kg):
                (secim==3)?(7.02*kg) :
                (secim ==4) ?(12.46*kg):
                (secim==5)?(8.99*kg):
                (secim==6)?(29.76*kg):
                (secim==7)?(7.30*kg):
              fiyat;
        String mesaj=((fiyat>0.0)?"aldiginiz ürünun fiyatı :"+fiyat:"gecersiz ürün kodu girdiniz ");
        System.out.println(fiyat);
       System.out.print("");

    }
}





