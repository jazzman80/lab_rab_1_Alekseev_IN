import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Я умею находить сумму трёх целых чисел.");

        System.out.print("Введи первое число: ");
        int firstUserNumber = scanner.nextInt();

        System.out.print("Введи второе число: ");
        int secondUserNumber = scanner.nextInt();

        System.out.print("Введи третье число: ");
        int thirdUserNumber = scanner.nextInt();

        System.out.println("Сумма трёх чисел равна " +
                summ(firstUserNumber,secondUserNumber,thirdUserNumber));

    }

    static int summ(int firstNumber, int secondNumber, int thirdNumber)
    {
        return firstNumber + secondNumber + thirdNumber;
    }
}