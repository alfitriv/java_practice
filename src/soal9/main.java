package soal9;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */
public class main {
    /*Buat object Animal, dgn default constructor isAlive (boolean), name (string),
    age (int), lalu print masing2 properties object tsb (3 points)
     */
    myObject animal = new myObject();

}

    class myObject {
        boolean isAlive;//instance variables
        String name;
        int age;

        public myObject() {
            isAlive = true;
            name = "Lion";
            age = 12;
        }

        public void print() {
            System.out.println(name + isAlive + age);
        }
    }







