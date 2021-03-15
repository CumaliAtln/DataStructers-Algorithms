import java.util.Scanner;

/**
 * @author Cumali Atalan
 * @implNote : 170419503 (numara)
 *
 * Hotel Yonetim Sistemi
 *
 * @since Mar 7, 2021
 *
 *
 * Text dosyasının kaydedileceği yeri kendi kullanımınıza göre değiştirmelisiniz!
 *
 *
 *

 * kayit.txt Text dosyasının içeriği:
 * müsteri adi, soyadi, yapilan islem adi
 *
 * Rezervasyon işlemi müşteri ve çalışan tarafından yapılabilir
 * ancak check-in ve check-out işlemleri sadece çalışan tarafından yapılabilir.
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calisan calisan =new Calisan();

        Musteri musteri =new Musteri();

        System.out.println("--------C-TLN Resort Hotel--------");
        System.out.println("-----------HOSGELDINIZ-----------");

        boolean running = true;
        while(running){
            System.out.println( "[1] - Müsteri Giris" + "\n"
                            +   "[2] - Resepsiyonist Giris" + "\n"
                            +   "[0] - Cikis");

            int durum = scanner.nextInt();
            scanner.nextLine();

            switch(durum){
                case 0:
                    System.out.println("Iyi Gunler Dileriz");
                    running = false;
                    break;
                case 1:
                    System.out.println("Isim");
                    String name = scanner.nextLine();
                    musteri.setName(name);

                    System.out.println("Soyisim");
                    String surname = scanner.nextLine();
                    musteri.setSurname(surname);

                    System.out.println( "[1] - Rezervasyon Yap" + "\n" +
                                        "[2] - Rezervasyon Iptal Et");
                    int islem = scanner.nextInt();
                    scanner.nextLine();

                    switch (islem){
                        case 1:
                            System.out.println("Rezervasyon Suresi...");
                            int rezervasyonSuresi = scanner.nextInt();
                            scanner.nextLine();
                            musteri.setRezervasyonSuresi(rezervasyonSuresi);
                            musteri.rezervasyonYap(musteri.getName(), musteri.getSurname(), "Rezervasyon");
                            System.out.println("Rezervasyon Isleminiz Basarili!!");
                            break;
                        case 2:
                            musteri.rezervasyonIptal(musteri.getName(), musteri.getSurname(), "Rezervasyon Iptal");
                            System.out.println("Rezervasyonunuz Iptal Edildi!");
                            break;
                        default:
                            System.out.println("Hatali Giris!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Isim");
                    String isim = scanner.nextLine();
                    calisan.setName(isim);

                    System.out.println("Soyisim");
                    String soyisim = scanner.nextLine();
                    calisan.setSurname(soyisim);

                    System.out.println( "[1] - Rezervasyon Yap" + "\n" +
                            "[2] - Rezervasyon Iptal Et" + "\n" +
                            "[3] - Check In" + "\n" +
                            "[4] - Check Out");

                    int process = scanner.nextInt();
                    scanner.nextLine();

                    switch (process){
                        case 1:
                            System.out.println("Müsteri Adi...");   name = scanner.nextLine();

                            System.out.println("Müsteri Soyadi...");    surname = scanner.nextLine();

                            System.out.println("Rezervasyon Suresi...");    int rezervasyonSuresi = scanner.nextInt();  scanner.nextLine();

                            calisan.setRezervasyonSuresi(rezervasyonSuresi);
                            calisan.rezervasyonIptal(name, surname, "Rezervasyon");
                            System.out.println("Rezervasyon islemi basarili");
                            break;
                        case 2:
                            System.out.println("Müsteri Adi...");   name = scanner.nextLine();

                            System.out.println("Müsteri Soyadi...");    surname = scanner.nextLine();

                            calisan.rezervasyonIptal(name, surname, "Rezervasyon Iptal");
                            System.out.println("Rezervasyon iptal islemi basarili!");
                            break;
                        case 3:
                            System.out.println("Müsteri Adi...");
                            name = scanner.nextLine();
                            System.out.println("Müsteri Soyadi...");
                            surname = scanner.nextLine();
                            calisan.checkIn(name, surname, "check-in", "Onaylandi");
                            System.out.println("Rezervasyon check-in islemi basarili!");
                            break;
                        case 4:
                            System.out.println("Müsteri Adi...");
                            name = scanner.nextLine();
                            System.out.println("Müsteri Soyadi...");
                            surname = scanner.nextLine();
                            calisan.checkOut(name, surname, "check-out", "Onaylandi");
                            System.out.println("Rezervasyon check-out islemi basarili!");
                            break;
                        default:
                            System.out.println("Hatali Giris!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Hatali Giris");
                    break;
            }
        }

    }
}