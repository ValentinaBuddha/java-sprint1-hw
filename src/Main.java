import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int day;
        int numbersOfSteps;
        int newDailyGoal;

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    while (true) {
                        System.out.println("Введи номер месяца от 1 до 12.");
                        month = scanner.nextInt();
                        if (month >= 1 && month <= 12) {
                            break;
                        } else {
                            System.out.println("Ошибка! Введено неверное значение. Повторите ввод.");
                        }
                    }
                    while (true) {
                        System.out.println("Введи день от 1 до 30.");
                        day = scanner.nextInt();
                        if (day >= 1 && day <= 30) {
                            break;
                        } else {
                            System.out.println("Ошибка! Введено неверное значение. Повторите ввод.");
                        }
                    }
                    while (true) {
                        System.out.println("Введи количество пройденных шагов.");
                        numbersOfSteps = scanner.nextInt();
                        if (numbersOfSteps >= 0) {
                            StepTracker.saveNumbersOfSteps(month, day, numbersOfSteps);
                            break;
                        } else {
                            System.out.println("Ошибка! Введено неверное значение. Повторите ввод.");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Введи номер месяца от 1 до 12.");
                        month = scanner.nextInt();
                        if (month >= 1 && month <= 12) {
                            StepTracker.printTotalSteps(month);
                            StepTracker.bestSeries(month);
                            break;
                        } else {
                            System.out.println("Ошибка! Введено отрицательное значение. Повторите ввод.");
                        }
                    }
                    break;
                case 3:
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
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Извини, такой команды пока нет.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nВыбери команду:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}