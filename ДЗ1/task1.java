
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите целое число N: ");
        long n = Scanner.nextLong();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(n));
        System.out.println("Факториал числа  = " + getFactorial(n));
    }

    public static long Triangle(long num) {
        return (num * (num + 1) / 2);
    }

    public static long getFactorial(long f) {
        long result = 1;
        for (long i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
