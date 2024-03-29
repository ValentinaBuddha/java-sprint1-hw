public class StepTracker {
    private static int dailyGoal = 10000;
    private static int[][] totalStepsArr = new int[12][30];

    public static void saveNumbersOfSteps(int month, int day, int numbersOfSteps) {
        totalStepsArr[month-1][day-1] = numbersOfSteps;
        System.out.println("Данные сохранены.");
    }

    public static void changeDailyGoal(int newDailyGoal) {
        dailyGoal = newDailyGoal;
        System.out.print("Твоя новая цель - " + dailyGoal + " шагов в день.");
    }

    public static void printTotalSteps(int month) {
        int totalSumSteps = 0;
        int maxNumbersOfSteps = 0;
        System.out.println("Твоя статистика по шагам за " + month + " месяц");
        for (int i = 0; i < 30; i++) {
            System.out.println((i+1) + " день: " + totalStepsArr[month-1][i]);
            totalSumSteps += totalStepsArr[month-1][i];
            if (totalStepsArr[month-1][i] > maxNumbersOfSteps) {
                maxNumbersOfSteps = totalStepsArr[month-1][i];
            }
        }
        int averageNumbersOfSteps = totalSumSteps / 30;
        System.out.println("Общая сумма шагов: " + totalSumSteps);
        System.out.println("Максимальное пройденное количество шагов: " + maxNumbersOfSteps);
        System.out.println("Среднее количество шагов: " + averageNumbersOfSteps);
        Converter.convert(totalSumSteps);
    }

    public static void bestSeries(int month) {
        int currentSeries = 0;
        int maxSeries = 0;
        for (int i = 0; i < 30; i++) {
            if (totalStepsArr[month-1][i] >= dailyGoal) {
                currentSeries++;
                if (currentSeries > maxSeries) {
                    maxSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        System.out.println("Лучшая серия дней за месяц: " + maxSeries);
    }
}