import java.util.Scanner;

public class Task4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l;
        do {
            System.out.println("Введите трехзначное число!");
            l = in.nextInt();
        }
        while (l < 100 || l > 999);
        System.out.println(l);
        int a = l/100;
        int b = l%100/10;
        int c = l%10;
        int sum = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("Сумма:%d", sum);
    }
}

