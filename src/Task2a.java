import java.util.Arrays;
public class Task2a {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int l = myArray.length;
        for (int i = 0; i < l; i++) {
            myArray[i] = (int) Math.pow(i, 2);
        }
        System.out.println(Arrays.toString(myArray));
        for (int v : myArray) {
            if (v % 3 == 0 || v % 7 == 0) {
                v = 0;
            }
            System.out.println(v + " ");
        }
    }
}