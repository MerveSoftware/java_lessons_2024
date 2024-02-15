package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Double sayi1 ,sayi2 ,sonuc;
        //j e 2 0
        char operator;
        System.out.println("ilk sayıyı girin.");
        sayi1 =scan.nextDouble();
        System.out.println("ikinci sayıyı girin.");
        sayi2 =scan.nextDouble();
        System.out.println("kullanacağınız operatörü seçiniz. \n  (+ ,-, *,/ ) ");
        operator=scan.next().charAt(0);
        switch (operator){
            case '+':
                sonuc=sayi1+sayi2;
                System.out.println("Toplama sonucu : "+sonuc);
                break;
            case '-':
                sonuc=sayi1-sayi2;
                System.out.println("Çikarma işlemi sonucu : "+sonuc);
                break;
            case '*':
                sonuc=sayi1*sayi2;
                System.out.println("Carpma sonucu : "+sonuc);
                break;
            case '/':
                if(sayi2 != 0 ){
                    sonuc=sayi1/sayi2;
                    System.out.println("Bölme sonucu : "+sonuc);
                }else {
                    System.out.println("HATA ~ sifira bölme hatasi");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi yaptınız !");
        }
        scan.close();
    }
}




