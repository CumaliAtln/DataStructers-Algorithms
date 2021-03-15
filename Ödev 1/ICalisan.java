public interface ICalisan {
    // ICalisan interface'inde calisanin yapabilecegi islemler belirtilir.
    void rezervasyonYap(String name, String surname, String islem);
    void rezervasyonIptal(String name, String surname, String islem);

    void checkIn(String name, String surname, String islem, String onay);
    //onay

    void checkOut(String name, String surname, String islem, String onay);
    //ödeme alır, işlem başarı ile sonlandırılır.
}
