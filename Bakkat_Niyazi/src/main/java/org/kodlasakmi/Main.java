package org.kodlasakmi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("merhaba ben bakkal Niyazi aldığın ürünün kdv hesabini yapacagım \n " +
                "alınan ürünün fiyatini girin");
        int kdvsiz_fiyat=scan.nextInt();
        System.out.println("alınan ürürnün sabit kdv orani :%18 dir");
        double sabit_kdv_orani=0.18;
        double kdvtutari=kdvsiz_fiyat*sabit_kdv_orani;
        double kdvlifiyat=kdvtutari+kdvsiz_fiyat;
        System.out.println("aldıgınız ürünün KDV tutarı : "+kdvtutari);
        System.out.println("aldıgınız ürünün KDVli fiyati : "+kdvlifiyat);
    }
}