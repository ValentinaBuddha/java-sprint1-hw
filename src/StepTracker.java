public class StepTracker {
    static int dailyGoal = 10000;
    static int[][] totalStepsArr = new int[12][30];

    static void saveNumbersOfSteps(int month, int day, int numbersOfSteps) {
        totalStepsArr[month][day] = numbersOfSteps;
        System.out.println("Данные сохранены.");
    }

    static void changeDailyGoal(int newDailyGoal) {
        dailyGoal = newDailyGoal;
        System.out.print("Твоя новая цель - " + dailyGoal + " шагов в день.");
    }

    static void printTotalSteps(int month) {
        int totalSumSteps = 0;
        int maxNumbersOfSteps = 0;
        System.out.println("Твоя статистика по шагам за " + month + " месяц");
        for (int i = 0; i < 30; i++) {
            System.out.println(i + " день: " + totalStepsArr[month][i]);
            totalSumSteps += totalStepsArr[month][i];
            if (totalStepsArr[month][i] > maxNumbersOfSteps) {
                maxNumbersOfSteps = totalStepsArr[month][i];
            }
        }
        int averageNumbersOfSteps = totalSumSteps / 30;
        System.out.println("Общая сумма шагов: " + totalSumSteps);
        System.out.println("Максимальное пройденное количество шагов: " + maxNumbersOfSteps);
        System.out.println("Среднее количество шагов: " + averageNumbersOfSteps);
        Converter.convert(totalSumSteps);
    }
    static void BestSeries(int month) {
        int currentSeries = 0;
        int maxSeries = 0;
        for (int i = 0; i < 30; i++) {
            if (totalStepsArr[month][i] >= dailyGoal) {
                currentSeries = currentSeries + 1;
            } if (totalStepsArr[month][i] < dailyGoal) {
                if (currentSeries > maxSeries) {
                    maxSeries = currentSeries;
                    currentSeries = 0;
                }
            }
        }
        System.out.println("Лучшая серия дней за месяц: " + maxSeries);
    }

}