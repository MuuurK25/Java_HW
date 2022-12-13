
// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Double num1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        Double num2 = reader.nextDouble();
        System.out.print("Выберите одну операцию (+, -, *, /): ");
        Character op = reader.next().charAt(0);
        reader.close();
        double ans;
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Вы ввели неправильную операцию");
                return;
        }
        System.out.print("\nПолучившийся результат вычисления:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}