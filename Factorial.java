import java.io.FilterOutputStream;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        while (true) {
            System.out.print("Введите число: ");
            int factorial = new Scanner(System.in).nextInt();
            if (factorial <= 0) {
                while (true) {
                    System.out.println("Value should be >0");
                    factorial = new Scanner(System.in).nextInt();
                    if (factorial >= 1) {
                        for (int i = 1; i <= 1; i++) {
                            int result = 0;
                            result += i;

                            for (int i1 = 2; i1 <= factorial; i1++) {
                                if (result > 0) {
                                    result *= i1;
                                    if (result < 0) {
                                        System.out.println("Переполнение");
                                        break;
                                    }
                                }

                            }
                            if (result > 0) {
                                System.out.println("Ваш факториал равен: " + (result));
                                break;
                            }
                        }
                        break;
                    }

                }
            } else if (factorial >= 1) {
                for (int i = 1; i <= 1; i++) {
                    int result = 0;
                    result += i;
                    for (int i1 = 2; i1 <= factorial; i1++) {
                        if (result > 0) {
                            result *= i1;
                            if (result < 0) {
                                System.out.println("Переполнение");
                                break;
                            }
                        }
                    }
                    if (result > 0) {
                        System.out.println("Ваш факториал равен: " + (result));
                        break;
                    }
                }
            }
            break;
        }
    }
}