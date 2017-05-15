package soal7;

/**
 * Created by vaniaradmilaalfitri on 5/15/17.
 */
public class main {
    /*Buat lah beberapa variable int dgn value angka genap dan ganjil, finally, buat
    if else statement yg menentukan angka tersebut ganjil atau genap (bonus point: kalau klian pakai function) (2 point, 1 bonus point)
     */
     int [] nums = {1,2,3,4,5};

    for(int i = 0; i<nums.length; i++)
    {
        if(nums[i] % 2 == 0)
        {
            System.out.println("genap");
        }
        else
        {
            System.out.println("ganjil");
        }
    }

}
