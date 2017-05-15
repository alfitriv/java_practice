package soal4;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */

/*Buat sebuah 3 variable dgn data type boolean yg isinya mathematical operations dgn at least mengandung
1 AND (&&) atau OR (||) (2 point)
 */

public class main {
    static boolean yes = true;
    static boolean no = false;
    static boolean neutral;

    public static void test() {
        if (3 < 5 || 4 < 3) {
            System.out.println(yes);
        } else if (3 < 5 && 4 < 3) {
            System.out.println(no);
        } else {
            System.out.println(neutral);
        }
    }
}
