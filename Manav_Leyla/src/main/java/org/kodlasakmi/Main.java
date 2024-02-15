package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //domates 3.75
        //limon 4.75
        //elma 7.30
        //biber 12.46
        //muz 8.99
         /*
        Scanner scan = new Scanner(System.in);
        System.out.println("merhaba Leyyla manava hosgeldınız almak ıstedıgınız urunun kodunu girin :?+\n \t" +
                "urun kodu : 1- domates 3.75 \n" +
                "urun kodu:2-limon 4.24 \n" +
                "urun kodu: 3- elma 7.02\n" +
                "urun kodu : 4 - biber 12.46\n" +
                "urun kodu : 5- muz 8.99\n" +
                "urun kodu:6 -Ayşe kadin fasulye 7.30");
        double secim = scan.nextDouble();
        System.out.println("sectiginiz urunden kac kg almak istiyorsunuz ?");
        double kg = scan.nextDouble();
        double fiyat = 0.0;
        fiyat =
                (secim == 1) ?( 3.75 * kg) :
                (secim == 2)? (4.24 * kg) :
                (secim == 3) ? (7.02 * kg) :
                (secim == 4) ?( 12.46 * kg) :
                (secim == 5) ?( 8.99 * kg) :
                (secim == 6) ? (7.30 * kg) :
                fiyat;
        String mesaj=(fiyat>0.0)?"aldınız urunun toplam tutarı:"+fiyat
                :"gecersiz urun kodu girdiniz!";
        System.out.println(fiyat);
//tek urun tek kg

    }
    /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Manav Ürünleri ve Fiyatları:");
        System.out.println("1. Elma: 2.5 TL/kg");
        System.out.println("2. Armut: 3.0 TL/kg");
        System.out.println("3. Domates: 2.0 TL/kg");
        System.out.println("4. Patates: 1.5 TL/kg");
        //yazılı olan 6 urunu seciyoruz
        int urunSayisi = 6; // Kullanıcı kaç ürün seçmek istediğini burada belirtebilirsiniz.
        double toplamTutar = 0.0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print("Ürün " + i + " numarasını girin (1-4): ");
            int secim = scanner.nextInt();

            System.out.print("Ürün " + i + " için kaç kilo alacaksınız: ");
            double kilo = scanner.nextDouble();

            double urunTutari =
                    (secim == 1) ? (2.5 * kilo) :
                            (secim == 2) ? (3.0 * kilo) :
                                    (secim == 3) ? (2.0 * kilo) :
                                            (secim == 4) ? (1.5 * kilo) :
                                                    0.0;

            toplamTutar += urunTutari;
        }

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
*/