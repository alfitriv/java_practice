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
        public String getSoundForDog(String bark1) {
            return bark1;
        }
    }

    class cat extends Animal
    {
        public String getSoundForCat(String meow1) {
            return meow1;
        }
    }

    class Animal{
        public String setSound(String bark, String meow){
             bark1 = bark;
             meow1 = meow;
        }
    }

}
