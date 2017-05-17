package soal1;

/**
 * Created by vaniaradmilaalfitri on 5/17/17.
 */
public class Contoh {

    public String nama;
    static int age = 24;


    public Contoh(String nama) {
        this.nama = nama;
    }

    public void printName() {
        System.out.println(nama);
    }

    public static void printStatic() {
        System.out.println("name");
    }
}
