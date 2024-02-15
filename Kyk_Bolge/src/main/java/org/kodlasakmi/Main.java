package org.kodlasakmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Merhaba KYK yurt bölge programına hoşgeldiniz!\n" +
                " Ben KYK yurt bölge programının müdürü Recep İvedik \n\t " +
                "Lütfen bulunduğunuz bölgeyi giriniz");
        String bolge=scan.nextLine();
        switch (bolge){
            case "İç Anadolu":
                System.out.println("İç Anadolu bölgesi için aylik ücretlendirmeniz 700TL");
            break;
            case "Doğu Anadolu":
                System.out.println("Doğu Anadolu bölgesi için aylik ücretlendirmeniz 1700TL");
                break;
            case "Marmara":
                System.out.println("Marmara bölgesi için aylik ücretlendirmeniz 6529TL");
                break;
            case "Ege Bölgesi":
                System.out.println("Ege bölgesi için aylik ücretlendirmeniz 830TL");
                break;
            case "Karadeniz":
                System.out.println("Karadeniz bölgesi için aylik ücretlendirmeniz 1900TL");
                break;
            case "GüneyDoğu Anadolu":
                System.out.println("Güneydoğu Anadolu bölgesi için aylik ücretlendirmeniz 1705TL");
                break;
            case "Akdeniz":
                System.out.println("Akdeniz bölgesi için aylik ücretlendirmeniz 1453TL");
                break;
            default:
                System.out.println("Geçerli bölge girin");
                break;
        }
        System.out.println("Eğer Gundiler aşiretindensenisss ucret 5000 TL'dir. \n Evet yada hayir diye bunu belirtin. ");
        String secim=scan.nextLine();
        switch (secim) {
            case "Evet":
                System.out.println("slm Gundik ücretin 5000 TL hehehehehe ");
                break;
            case "Hayır":
                System.out.println("Ücret alinmıyor");
                break;
            default:
                System.out.println("Hayırli gunler");
                break;
        }
    }
}



