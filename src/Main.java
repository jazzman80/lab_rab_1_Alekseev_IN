import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������! � ���� �������� ����� ��� ����� �����.");

        System.out.print("����� ������ �����: ");
        int firstUserNumber = scanner.nextInt();

        System.out.print("����� ������ �����: ");
        int secondUserNumber = scanner.nextInt();

        System.out.print("����� ������ �����: ");
        int thirdUserNumber = scanner.nextInt();

        System.out.println("����� ��� ����� ����� " +
                summ(firstUserNumber,secondUserNumber,thirdUserNumber));

    }

    static int summ(int firstNumber, int secondNumber, int thirdNumber)
    {
        return firstNumber + secondNumber + thirdNumber;
    }
}