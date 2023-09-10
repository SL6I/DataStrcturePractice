import java.util.Arrays;
import java.util.Random;

/**
 * Day1
 */
/**
 * Day1
 * 
 */
public class Week1 {
    private int size;
    private int[] arr;
    private int numElemnts;

    Week1(){
        size = 0;
        arr = new int[5];
        numElemnts = 0;
    }

    Week1(int size){
        this.size = size;
        arr = new int[size];
        numElemnts = 0;
    }
    public static void main(String[] args) {
        Week1 day1 = new Week1(10);
        // day1.RandomElemnt();
        // day1.printArray();
        
        // System.out.println("\n---------------");
        // day1.shiftRght(2);
        // day1.printArray();
        System.out.println(day1.factorial(4));
        System.out.println(day1.sumUpTo(5));
        System.out.println(day1.meth(5));
    }

     void increaseSize(){
         size = (int)(size * 2 / 1.5);
         int[] newArray = Arrays.copyOf(arr,size);
        arr = newArray;
           
    }
        
     void RandomElemnt(){
        Random r = new Random();
        if(numElemnts == 0){
            arr[0] = r.nextInt(3);
            numElemnts++;
        }
        for(int i = numElemnts; i<arr.length;i++){
            arr[i] = r.nextInt(100);
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

        public void addElemnt(int vaue){
            if(numElemnts == arr.length){
                increaseSize();
            }
            arr[numElemnts] = vaue;
            numElemnts++;
        }


        void shiftRght(int index){
            if(index < 0 || index > numElemnts){
                System.out.println("Invalid index");
            }
            else{
                for(int i = numElemnts; i > index; i--){
                    arr[i] = arr[i-1];
                }
                arr[index] = 0;
            }
        }
        void remove(int index){
            if(index < 0 || index > numElemnts){
                System.out.println("Invalid index");
            }
            else{
                for(int i = index; i < numElemnts; i++){
                    arr[i] = arr[i+1];
                }
                arr[numElemnts] = 0;
            }
        }

        int factorial(int n){
            if(n == 0){
                return 1;
            }
            else{
                System.out.println(n);
                return n * factorial(n-1);
            }
        }
        int sumUpTo(int n){
            if(n == 1){
                return 1;
            }
            else{
                return n + sumUpTo(n-1);
            }
        }
        int meth(int n){
            if(n == 0) return 0;
            else if (n == 1) return 1;
            else return meth(n-1) + meth(n-2);
        }

}