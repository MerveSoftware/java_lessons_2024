package org.kodlasakmi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
      /*  int yas=scan.nextInt();
        if(yas>18){
            System.out.println("Ehliyet alabilirsin");
        } else if (yas==18) {
            System.out.println("Ehliyet almanız için 18 yasını doldurmuş olmanız gerekiyor");
        }else {
            System.out.println("Yasınız 18 degil");
        }
*/
      String sinif="Web Tasarım";
        System.out.println("okul numaranı gir");//1453
      int no=scan.nextInt();
      if (sinif=="Web Tasarım"&&no==1453){
          System.out.println("Hosgeldin Merve!");
          System.out.print("Lutfen Web Tasarım dersının sinavindan aldigin notu gir :  ");
          int sinavNot=scan.nextInt();
          if (sinavNot>=90){
              System.out.println("dersten AA ile gectn");
          } else if (sinavNot>=80) {
              System.out.println("Dersten BB ile gectin");

          } else if (sinavNot>=65) {
              System.out.println("Dersten CD ile gectin");

          } else if (sinavNot>=50) {
              System.out.println("Dersten DD ile gectin");

          } else if (sinavNot>=30) {
              System.out.println("Dersten FD ile kaldınız");

          }else {
              System.out.println("Dersten kaldınız \n Harf notunuz FF");
          }

      }else {
          System.out.println("Yanliş sinif veya yanliş numara girdiniz ");
      }
    }
}




