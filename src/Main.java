import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       /* Scanner numbercase = new Scanner(System.in);
        switch (numbercase.nextInt()){
        case 1:
*/
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
       /* case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
    }*/
    }
}
