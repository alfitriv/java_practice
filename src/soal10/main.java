package soal10;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */
public class main {
    /*Polymorphism: buat object Dog extend object Animal dan Cat extend object Animal jga,
    dgn properties bark (string) untuk Dog nya, dan properties meow(string) untuk Cat,
    setelah membuat dua object tersebut, panggil properties masing2 object tsb (4 points)*/



    public class Dog extends Animal
    {
        public String bark; //setting the property
        public String getSoundForDog() {
            this.bark = "bark";
            return bark;
        }

    }

    public class Cat extends Animal
    {
        public String meow; //setting the property
        public String getSoundForCat() {
            this.meow = "meow";
            return meow;
        }
    }

    class Animal{

    }

}
