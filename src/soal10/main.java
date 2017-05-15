package soal10;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */
public class main {
    /*Polymorphism: buat object Dog extend object Animal dan Cat extend object Animal jga,
    dgn properties bark (string) untuk Dog nya, dan properties meow(string) untuk Cat,
    setelah membuat dua object tersebut, panggil properties masing2 object tsb (4 points)*/

    class dog extends Animal
    {
        string bark;
    }

    class cat extends Animal
    {
        string meow;
    }

}
