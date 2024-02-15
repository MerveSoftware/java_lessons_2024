package org.MerveSoftwere;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // not ortalaması hesaplayan program
        //dersler :  web ,mobil programlama ,kullanıcı deneyımı tasarımı ,edevlet,bilişim hukuku,c#
        Scanner scan =new Scanner(System.in);
        int web,mobil_programlama,kullanıcıDT,edevlet,bilisimH,csharp;
        System.out.println("merhaba gardaş e-okul öbs ye hosgeldin<3 \n bana ders notlarını gir ve senin için donem notunu hesaplayayımmm");
        System.out.print("web dersinin ders notunu gir: ");
        web=scan.nextInt();
        System.out.print(" mobil programlama dersinin ders notunu gir: ");
        mobil_programlama=scan.nextInt();
        System.out.print("kullanıcı deneyimi ve tasarımı dersinin ders notunu gir: ");
        kullanıcıDT=scan.nextInt();
        System.out.print("e-Devlet dersinin ders notunu gir: ");
        edevlet=scan.nextInt();
        System.out.print("bilişim hukuku dersinin ders notunu gir: ");
        bilisimH=scan.nextInt();
        System.out.print("c# dersinin ders notunu gir: ");
        csharp=scan.nextInt();
        double ortalama =(web+mobil_programlama+kullanıcıDT+edevlet+bilisimH+csharp)/ 6;
        System.out.println("not ortalaman :"+ortalama);
        String durum = ortalama>=50? "sinifi gectın cano":"allah yardımcın olsun gardaş seneye görüşürüz :(";
        System.out.println(durum);
        System.out.println("iyi dersler \t **BAŞARILAR**");
    }
}













