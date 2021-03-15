public interface IMusteri {

    // IMusteri interface'inde musterinin yapabilecegi islemler belirtilir.

    void rezervasyonYap(String name, String surname, String islem);
    void rezervasyonIptal(String name, String surname, String islem);
}
