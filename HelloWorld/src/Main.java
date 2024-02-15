import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //kullanıcıdan vveri almak <3
        Scanner scan =new Scanner(System.in);
       /* String name;

        System.out.println("adınızı giriniz? ");
        name=scan.nextLine();
        System.out.println("sizin isminiz = "+name);


        */
        System.out.println("merhaba vücut kitle indeksinizi hesplayalimm\n \t boyunuzu ve kilonuzu giriniz");
        System.out.print("once boyunuzu giriniz:  ");
        double boy =scan.nextDouble();
        System.out.println("kilonuzu giriniz :  ");
        int kilo=scan.nextInt();
        double index= kilo/(boy*boy);
        String durum =index <18.5? "zayıf": index <24.9?"normal kiloda": index< 29.9? "kilolu ": "obez vatandaşş";
        System.out.println("vucut kitle indeksisniz: "+index);
        System.out.println("kilo durumunuz : "+durum);


    }
}
