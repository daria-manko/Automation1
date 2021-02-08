import java.util.Arrays;
import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int v = arr.length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v; i++) {
            System.out.println("Введите целое число:");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum =0;
        for(int l :arr) {
            sum += l;
        }
        System.out.println("Сумма:" + sum);
        int avg = sum / v;
        System.out.println("Среднее значение:" + avg);
        for(int m = 0; m < v; m++){
            if(arr[m] < avg){
                arr[m] *= 2;
            }
        }
        System.out.println("Конечный массив:" + Arrays.toString(arr));
    }
}
