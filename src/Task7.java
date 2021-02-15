//Решить задачу 3, выделив в чистые методы:
//а. поиск суммы элементов массива (входящий параметр - только массив, возвращаемое значение - сумма элементов);
//б. вычисление среднего арифметического элементов массива (входящий параметр - массив, возвращаемое значение - среднее арифметическое);
//в. умножение элементов массива, меньших среднего арифметического, на два (входящие параметры - массив, среднее арифметическое, множитель; возвращаемое значение - новый
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
static int [] arr = new int[10];
static int v = arr.length;
static double sum;
static double avg;

    public static void main(String[] args) {
        setArr();
        System.out.println("Массив" + Arrays.toString(arr));
        sum = getSum(arr);
        System.out.println("Сумма:" + sum);
        avg = getAvg(arr);
        System.out.println("Среднее значение:" + avg);
        multiply(arr, avg, 2);
        System.out.println("Конечный массив:" + Arrays.toString(arr));
    }

    public static void setArr() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v; i++) {
            System.out.println("Введите целое число:");
            arr[i] = sc.nextInt();
        }
    }
    public static double getSum(int[]arr) {
        sum = 0;
        for (int l : arr) {
            sum += l;
        }
        return sum;
    }
    public static double getAvg(int[]arr) {
        double avg = sum / v;
        return avg;
    }
    public static void multiply(int[]arr, double avg, int x){
        for(int m = 0; m < v; m++){
            if(arr[m] < avg){
                arr[m] *= x;
            }
        }
    }
}