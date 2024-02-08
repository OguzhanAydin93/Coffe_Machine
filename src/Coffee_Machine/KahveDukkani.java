package Coffee_Machine;

import java.util.ArrayList;
import java.util.Scanner;

public class KahveDukkani extends KahveAbstract implements IMethodlar {


    private final Scanner scanner = new Scanner(System.in);
    private final Scanner input = new Scanner(System.in);

    @Override
    public void AcilisEkrani() {
        System.out.println("Kahve makinasına hoşgeldiniz.");
        System.out.println("Bu insanlar bir kahve içmesin mi !!!");
        System.out.println("Bu makina kuru üzüm vermiyor sorry :(( ");
    }

    @Override
    public void MenuGetir() {
        boolean exit = false;

        do {
            System.out.println("\n"+"***** COFFEE MACHINE *****");
            System.out.println("\n"+"1." + KahveTurleri.AMERICANO);
            System.out.println("2." + KahveTurleri.ESPRESSO);
            System.out.println("3." + KahveTurleri.CAPPUCINO);
            System.out.println("4." + KahveTurleri.LATTE);
            System.out.println("5." + KahveTurleri.MOCHA);
            System.out.println("6." + KahveTurleri.MACCHIATO);
            System.out.println("7." + KahveTurleri.AFFOGATO);
            System.out.println("8." + KahveTurleri.BUZLUKAHVE);
            System.out.println("9." + KahveTurleri.FRAPPUCCINO);
            System.out.println("10." + KahveTurleri.IRISH);
            System.out.println("0. Çıkış yapınız.");
            System.out.print("Lütfen seçiminizi yapınız : ");
            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("\n"+KahveTurleri.AMERICANO + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 2:
                    System.out.println("\n"+KahveTurleri.ESPRESSO + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 3:
                    System.out.println("\n"+KahveTurleri.CAPPUCINO + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 4:
                    System.out.println("\n"+KahveTurleri.LATTE + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 5:
                    System.out.println("\n"+KahveTurleri.MOCHA + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 6:
                    System.out.println("\n"+KahveTurleri.MACCHIATO + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 7:
                    System.out.println("\n"+KahveTurleri.AFFOGATO + " seçtiniz");
                    KahveBoyutu();
                    sut();
                    break;
                case 8:
                    System.out.println("\n"+KahveTurleri.BUZLUKAHVE + " seçtiniz");
                    System.out.println("Sıcak bir yaz gününde,serinlemenin en iyi yolu,PERFECTO");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 9:
                    System.out.println("\n"+KahveTurleri.FRAPPUCCINO + " seçtiniz");
                    System.out.println("Sıcak bir yaz gününde,serinlemenin en iyi yolu,PERFECTO");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 10:
                    System.out.println("\n"+KahveTurleri.IRISH + " seçtiniz");
                    KahveBoyutu();
                    seker();
                    sut();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim,lütfen geçerli bir tuşlama yapınız..");
                    break;
            }
        } while (!exit);
    }

    @Override
    public void KahveBoyutu() {

        System.out.println();
        System.out.println("Boyutlar:" + "\n" + "1.SMALL" + "\n" + "2.MEDIUM" + "\n" + "3.LARGE" + "\n" + "4.X-LARGE");
        System.out.print("Boyut seçimini yapınız : ");
        int boyutSecimi = scanner.nextInt();
        switch (boyutSecimi) {
            case 1:
                System.out.println("\n"+KahveBoyutu.SMALL+ " boyutunda kahveniz hazırlanıyor.");
                break;
            case 2:
                System.out.println("\n"+KahveBoyutu.MEDIUM+" boyutunda kahveniz hazırlanıyor.");
                break;
            case 3:
                System.out.println("\n"+KahveBoyutu.LARGE+ " boyutunda kahveniz hazırlanıyor.");
                break;
            case 4:
                System.out.println("\n"+KahveBoyutu.XLARGE+" boyutunda kahveniz hazırlanıyor.");
                break;
            default:
                System.out.println("Geçersiz seçim,lütfen geçerli bir tuşlama yapınız.");
                break;
        }

    }

    @Override
    public void seker() {
        while (true) {
            System.out.print("\n"+"Şeker ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            String seker = input.nextLine();
            if (seker.equalsIgnoreCase("evet")) {
                System.out.print("\n"+"Kaç şeker istersiniz?: ");
                int kacSeker = scanner.nextInt();
                System.out.println("\n"+kacSeker + " " + "şeker ekleniyor, lütfen bekleyin...");
                break;
            } else if (seker.equalsIgnoreCase("hayır")) {
                System.out.println("Şekersiz hazırlanıyor...");
                break;
            } else
                System.out.println("Geçersiz seçim,lütfen geçerli bir tuşlama yapınız.");
        }
        System.out.println();
    }

    @Override
    public void sut() {
        while (true) {
            System.out.print("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
            String sut = input.nextLine();
            if (sut.equalsIgnoreCase("evet")) {
                System.out.println("\n"+"Süt ekleniyor, lütfen bekleyin...");
                System.out.println("Kahveniz hazır,iyi eğlenceler");
                System.out.println("\n"+"Tall Grande Venti Bitti Gitti Hadi Laa :D");
                break;
            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println("Süt eklenmiyor.");
                System.out.println("Kahveniz hazır,iyi eğlenceler");
                break;
            } else
                System.out.println("Geçersiz seçim,lütfen geçerli bir tuşlama yapınız.");
        }
    }
}

