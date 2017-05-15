package soal1;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import static java.lang.System.out;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */

/*Buat 3 variable dgn data type string (nama bebas) lalu isi masing2 variable tsb dgn pecahan kata dari sebuah kalimat.
Lalu buat satu variable lgi yg menggabungkan 3 variable sebelumnya. Finally, print variable terakhir tersebut (1 point)
 */

public class main {
    static String name1 = "we";
    static String name2 = "love";
    static String name3 = "gojek";
    static String combine = name1 + " " + name2 + " " + name3;

    public static void test() {
        System.out.println(combine);
    }
}
