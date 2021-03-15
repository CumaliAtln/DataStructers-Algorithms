import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author CumaliAtalan
 */

public class FileProcess {
    public static void main(String[] args) {

    }

    public static void writeMusteriFile(String name, String surname, String islem){
        //DOSYA İÇERİSİNE YAZABİLME FONKSİYONU
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\tr\\Desktop\\kayit.txt", true));
            //write objesi Buffer'a yazmamızı sağlıyor.
            writer.newLine(); //newLine ile yeni satıra geçiyor.
            writer.write("İsim: " + name + " Soyisim: " + surname
                    + " İslem: " + islem);
            //writer objesine write metodu ile beraber dosyaya yazma işlemini geröekleştiriyor.

            writer.close(); //dosyayı yazdıktan sonra kapatıyor.
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static void writeCalisanFile(String name, String surname, String islem, String onay){
        //DOSYA İÇERİSİNE YAZABİLME FONKSİYONU
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\tr\\Desktop\\kayit.txt", true));
            //write objesi Buffer'a yazmamızı sağlıyor.
            writer.newLine(); //newLine ile yeni satıra geçiyor.
            writer.write("İsim: " + name + " Soyisim: " + surname
                    + " İslem: " + islem + " Onay: " + onay);
            //writer objesine write metodu ile beraber dosyaya yazma işlemini geröekleştiriyor.

            writer.close(); //dosyayı yazdıktan sonra kapatıyor.
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}