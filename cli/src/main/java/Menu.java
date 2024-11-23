import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    public void menu() {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(calculator.add(num1, num2));
                case 2:
                    System.out.println(calculator.subtract(num1, num2));
                case 3:
                    System.out.println(calculator.multiply(num1, num2));
                case 4:
                    System.out.println(calculator.divide(num1, num2));
                case 0:
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }
    public void printMenu() {
        System.out.println("1 - Сумма" +
                "2 - Вычитание" +
                "3 - Умножение" +
                "4 - Деление" +
                "0 - Выход");
    }
}
