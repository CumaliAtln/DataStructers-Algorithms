public class Insan {

    //çalışan ve müşteri farketmeksizin herkesin bir adı ve soyadı vardır.
    //öncelikle Insan.class içerisinde ad ve soyad bilgilerini alıyoruz.

    private String name;
    private String surname;

    public Insan(String name, String surname)
    {
        this.setName(name);
        this.setSurname(surname);
    }

    public Insan() {
        this("Bilgi Yok","Bilgi Yok");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}