import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import task1.CosImpl;

/**
 * Useless class that was expected to be used on creation stage but now it is useless
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int var;
        boolean check = false;
        System.out.print("Введите номер задания: ");
        var = scanner.nextInt();
        switch (var) {
            case 1:
                System.out.print("Введите степень разложения: ");
                CosImpl cosine = new CosImpl(scanner.nextInt());
                System.out.print("Введите координату x: ");
                    try {
                        cosine.setX((scanner.nextDouble()));
                        System.out.println("X записан");
                    } catch (InputMismatchException e) {
                        System.out.println("Значение не является типом double, попробуйте снова");
                    }
                System.out.println("Ответ: " + cosine.apply(cosine.getX(), cosine.getN()));
                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}

