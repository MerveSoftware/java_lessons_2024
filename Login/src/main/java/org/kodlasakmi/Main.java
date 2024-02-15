package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String DogruKullaniAdi="Admin";
        String DogruSifre="1234";
        System.out.println("Kullanıcı adınızı giriniz.");
        String kullaniciAdi= scan.nextLine();
        System.out.println("Lütfen şifrenizi giriniz.");
        String sifre=scan.nextLine();

        if (kullaniciAdi.equals(DogruKullaniAdi)&&sifre.equals(DogruSifre)){
            System.out.println("merhaba hosgeldin");

        }else {
            System.out.println("Kullanıcı adınız veya şifreniz yanliş. Sisteme giriş basarısız!");
            System.out.println("Şifrenizi değiştirmek istermisiniz (Evet/Hayır)");
            String secim =scan.nextLine();
            switch (secim){
                case "Evet":
                    System.out.println("Yeni sifre belirleyin.");
                    String yeniSifre=scan.nextLine();
                    if(yeniSifre.equals(DogruSifre)){
                        System.out.println("Yeni şifrenizle eski şifreniz aynı olamaz!");
                    }else {
                        DogruSifre=yeniSifre;
                        System.out.println("Şifreniz başarıyla güncellendi...");

                    }
                    break;
                case "Hayır":
                    System.out.println("Şifre değiştirme işlemi iptal edildi");
                    break;
                default:
                    System.out.println("Başarisiz işlem yapıldı, şifre değiştirme işlemi iptal edildi");
                    break;

            }
        }

        scan.close();
    }
}




