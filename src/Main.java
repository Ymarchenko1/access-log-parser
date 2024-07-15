import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPathCount = 0; // Счетчик для подсчета правильных путей

        while (scanner.hasNextLine()) {
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExist = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExist || isDirectory) {
                System.out.println("Указанный файл не существует или указанный путь является путём к папке.");
                continue; // Продолжаем цикл, если путь неверен
            }

            correctPathCount++; // Увеличиваем счетчик, если путь верен
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + correctPathCount);

        }
    }
}
