public class Week2 {
    public static void main(String[] args) {
        System.out.println("1"+44);
        int[] a1 = {4, 5, 2, 12, 14, 14, 9};
        int[] a2 = a1;    
        a1[0] = 7;
        a2[0] = 8;
        System.out.println(a1[0]+"\n"+a2[0]);
    }
}
