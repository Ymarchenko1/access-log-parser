import java.util.Scanner; // Импортируем класс Scanner для чтения данных

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для чтения данных из стандартного ввода
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод первого числа
        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt(); // Считываем целое число

        // Запрашиваем у пользователя ввод второго числа
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt(); // Считываем еще одно целое число

        // Выводим результаты арифметических операций
        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
        System.out.println("Разность чисел: " + (firstNumber - secondNumber));
        System.out.println("Произведение чисел: " + (firstNumber * secondNumber));
        // Для деления используем приведение типа к double, чтобы избежать потери точности
        System.out.println("Частное чисел: " + (double) firstNumber / secondNumber);

        // Закрываем сканер, когда он больше не нужен
        scanner.close();
    }
}
