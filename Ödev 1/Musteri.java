public class Musteri extends Insan implements IMusteri{

    // Musteri.class, Insan.class'tan miras alır
    // ve IMusteri interface'i üzerinden implement alır.

    private int rezervasyonSuresi=1;
    //rezervasyon en az 1 gün olacağından 1'e eşitlenir.

    public Musteri() {
    }

    // müsteri rezervasyon yapmak istediğinde ne kadar süre rezervasyon yapacağını belirler.
    public void setRezervasyonSuresi(int rezervasyonSuresi) {
        this.rezervasyonSuresi = rezervasyonSuresi;
    }

    FileProcess dosyaIslemi =new FileProcess();

    // rezervasyon işlemi yapıldığı taktirde .txt dosyasına kayıt yapılır.
    @Override
    public void rezervasyonYap(String name, String surname, String islem) {
        dosyaIslemi.writeMusteriFile(name, surname, islem);
    }

    // rezervasyon iptal işlemi yapıldığı taktirde .txt dosyasına kayıt yapılır.
    @Override
    public void rezervasyonIptal(String name, String surname, String islem) {
        dosyaIslemi.writeMusteriFile(name, surname, islem);
    }
}
