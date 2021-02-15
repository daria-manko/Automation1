import java.util.Scanner;

public class Task8 {
    static int v;
    static int sum;
    public static void main(String[] args) {
        v = setValue();
        System.out.println(v);
        sum = getSum();
        System.out.printf("Сумма:%d", sum);
    }
    public static int setValue() {
        Scanner in = new Scanner(System.in);
        int v;
        do {
            System.out.println("Введите трехзначное число!");
            v = in.nextInt();
        }
        while (v < 100 || v > 999);
        return v;
    }
    public static int getSum(){
            int sum;
            int a = v/100;
            int b = v%100/10;
            int c = v%10;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            sum = a + b + c;
            return sum;
        }
    }
