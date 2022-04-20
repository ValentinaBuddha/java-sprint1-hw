public class Converter {
    private static final double STEP_LENGHT = 0.00075;
    private static final double STEP_KILOCALORIES = 0.05;

    public static void convert(int totalSumSteps) {

        double distance = totalSumSteps * STEP_LENGHT;
        double kiloCalories = totalSumSteps * STEP_KILOCALORIES;
        System.out.println("Пройденная дистанция: " + distance + " км.");
        System.out.println("Сгорело: " + kiloCalories + " килокалорий.");
    }
}
