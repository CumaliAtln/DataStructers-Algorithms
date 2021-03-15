public class Calisan extends Insan implements ICalisan{

    // Calisa.class, Insan.class'tan miras alır ve ICalisan interface'inden implement alır.

    private int rezervasyonSuresi;
    private int ucret = 500 * rezervasyonSuresi;

    public Calisan(){
    }

    // müsteri için rezervasyon süresi ayarlanır.
    public void setRezervasyonSuresi(int rezervasyonSuresi) {
        this.rezervasyonSuresi = rezervasyonSuresi;
    }

    FileProcess dosyaIslemi =new FileProcess();

    // rezervasyon işlemi yapılacaksa gerekli bilgiler alınır ve kayit.txt dosyasına kaydedilir.
    @Override
    public void rezervasyonYap(String name, String surname, String islem) {
        dosyaIslemi.writeMusteriFile(name, surname, islem);
    }

    // rezervasyon iptal işlemi yapılacaksa gerekli bilgiler alınır ve kayit.txt dosyasına kaydedilir.
    @Override
    public void rezervasyonIptal(String name, String surname, String islem) {
        dosyaIslemi.writeMusteriFile(name, surname, islem);
    }

    // rezervasyon check-in işlemi yapılacaksa gerekli bilgiler alınır ve kayit.txt dosyasına kaydedilir.
    @Override
    public void checkIn(String name, String surname, String islem, String onay) {
        dosyaIslemi.writeCalisanFile(name, surname, islem, onay);
    }

    // rezervasyon check-out işlemi yapılacaksa gerekli bilgiler alınır ve kayit.txt dosyasına kaydedilir.
    @Override
    public void checkOut(String name, String surname, String islem, String onay) {
        dosyaIslemi.writeCalisanFile(name, surname, islem, onay);
    }
}