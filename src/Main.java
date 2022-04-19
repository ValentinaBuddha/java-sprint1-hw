import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        int month, day, numbersOfSteps, newDailyGoal;

        while (true) {
            if (command == 1) {
                System.out.println("Введи номер месяца от 0 до 11.");
                month = scanner.nextInt();
                System.out.println("Введи день от 0 до 29.");
                day = scanner.nextInt();
                while (true) {
                    System.out.println("Введи количество пройденных шагов.");
                    numbersOfSteps = scanner.nextInt();
                    if (numbersOfSteps >= 0) {
                        StepTracker.saveNumbersOfSteps(month, day, numbersOfSteps);
                        break;
                    } else {
                        System.out.println("Ошибка! Введено отрицательное значение. Повторите ввод.");
                    }
                }
                printMenu();
                command = scanner.nextInt();
            } else if (command == 2) {
                System.out.println("Введи номер месяца от 0 до 11.");
                month = scanner.nextInt();
                StepTracker.printTotalSteps(month);
                StepTracker.BestSeries(month);
                printMenu();
                command = scanner.nextInt();
            } else if (command == 3) {
                while (true) {
                    System.out.println("Укажи новую цель.");
                    newDailyGoal = scanner.nextInt();
                    if (newDailyGoal >= 0) {
                        StepTracker.changeDailyGoal(newDailyGoal);
                        break;
                    } else {
                        System.out.println("Ошибка! Введено отрицательное значение. Повтори ввод.");
                    }
                }
                printMenu();
                command = scanner.nextInt();
            } else if (command == 0) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
                printMenu();
                command = scanner.nextInt();
            }
        }
    }

    static void printMenu() {
        System.out.println("Выбери команду:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}