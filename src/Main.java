import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число, что бы определить, является ли \n оно последовательностью числ Фибоначи : ");
        Scanner num= new Scanner(System.in);
        int a = 0, b = 1, c = 0, fibo;
        fibo = num.nextInt();
        for (int i=0; i < 30; i++) {
            c = a + b;
            // System.out.print(c + ", "); // Вывод подсчёта порядка чисел
            a = b;
            b = c;
            if (c == fibo) {
                System.out.println("\n Число " + fibo + " является числом Фибоначи");
                break;
            }
        }
        if (c > fibo) {
            System.out.println("\n Число " + fibo + " не является число Фибоначи");
        }
    }
}
