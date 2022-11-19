package okulyonetimi;

import java.util.Scanner;

public class OkulAnasayfa {

    static Scanner input = new Scanner(System.in);

    public static void okulAnaSayfasi() {
        System.err.println("# Okul Anasayfa #");

        System.out.println(" 1. Ogrenci Islemleri\n" +
                "2. Ogretmen Islemleri\n" +
                "Q. Cikis\n" +
                "Yapmak istediginiz islemi seciniz.");

        String secim = input.next().toUpperCase();

        boolean scm = true;
        do {
            switch (secim) {
                case "1":
                    Ogrenci.ogrenciMenu();
                    scm = false;
                    break;
                case "2":
                    Ogretmen.ogretmenMenu();
                    scm = false;
                    break;
                case "Q":
                    System.out.println("Okul Sayfamizi ziyaret ettiginiz icin tesekkur ederiz\n" +
                            "Iyi Gunler Dileriz :)");
                    scm = false;
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz. Tekrar giris yapiniz");
                    secim = input.next().toUpperCase();
            }
        } while (scm);


    }
}
