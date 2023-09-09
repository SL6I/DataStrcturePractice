import java.util.Arrays;
import java.util.Random;

/**
 * Day1
 */
public class Day1 {
    private int size;
    private int[] arr;
    private int numElemnts;

    Day1(){
        size = 0;
        arr = new int[5];
        numElemnts = 0;
    }

    Day1(int size){
        this.size = size;
        arr = new int[size];
        numElemnts = 0;
    }
    public static void main(String[] args) {
        Day1 day1 = new Day1(10);
        day1.RandomElemnt();
        day1.printArray();
        
        System.out.println("---------------");
        day1.increaseSize();
        day1.RandomElemnt();
        day1.printArray();
    }

     void increaseSize(){
         size = (int)(size * 2 / 1.5);
         int[] newArray = Arrays.copyOf(arr,size);
        arr = newArray;
           
    }
        
     void RandomElemnt(){
        Random r = new Random();
        for(int i = 0; i<arr.length;i++){
            arr[i] = r.nextInt(3);
            numElemnts++;
        }

       
     }
      void printArray(){
         System.out.print("[ ");
         for(int i : arr){
            System.out.print(i + ", ");
         }   
         System.out.print(" ]");
        }

        public void swapAr
}